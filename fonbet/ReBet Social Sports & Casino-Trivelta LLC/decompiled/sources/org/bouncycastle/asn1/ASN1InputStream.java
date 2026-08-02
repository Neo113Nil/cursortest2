package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.UByte;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes5.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    public static ASN1Primitive createPrimitiveDERObject(int i10, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        if (i10 == 10) {
            return ASN1Enumerated.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
        }
        if (i10 == 12) {
            return new DERUTF8String(definiteLengthInputStream.toByteArray());
        }
        if (i10 == 30) {
            return new DERBMPString(getBMPCharBuffer(definiteLengthInputStream));
        }
        switch (i10) {
            case 1:
                return ASN1Boolean.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
            case 2:
                return new ASN1Integer(definiteLengthInputStream.toByteArray(), false);
            case 3:
                return ASN1BitString.fromInputStream(definiteLengthInputStream.getRemaining(), definiteLengthInputStream);
            case 4:
                return new DEROctetString(definiteLengthInputStream.toByteArray());
            case 5:
                return DERNull.INSTANCE;
            case 6:
                return ASN1ObjectIdentifier.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
            default:
                switch (i10) {
                    case 18:
                        return new DERNumericString(definiteLengthInputStream.toByteArray());
                    case 19:
                        return new DERPrintableString(definiteLengthInputStream.toByteArray());
                    case 20:
                        return new DERT61String(definiteLengthInputStream.toByteArray());
                    case 21:
                        return new DERVideotexString(definiteLengthInputStream.toByteArray());
                    case 22:
                        return new DERIA5String(definiteLengthInputStream.toByteArray());
                    case 23:
                        return new ASN1UTCTime(definiteLengthInputStream.toByteArray());
                    case 24:
                        return new ASN1GeneralizedTime(definiteLengthInputStream.toByteArray());
                    case 25:
                        return new DERGraphicString(definiteLengthInputStream.toByteArray());
                    case 26:
                        return new DERVisibleString(definiteLengthInputStream.toByteArray());
                    case 27:
                        return new DERGeneralString(definiteLengthInputStream.toByteArray());
                    case 28:
                        return new DERUniversalString(definiteLengthInputStream.toByteArray());
                    default:
                        throw new IOException("unknown tag " + i10 + " encountered");
                }
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) {
        int remaining = definiteLengthInputStream.getRemaining();
        if ((remaining & 1) != 0) {
            throw new IOException("malformed BMPString encoding encountered");
        }
        int i10 = remaining / 2;
        char[] cArr = new char[i10];
        byte[] bArr = new byte[8];
        int i11 = 0;
        int i12 = 0;
        while (remaining >= 8) {
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, 8) != 8) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            cArr[i12] = (char) ((bArr[0] << 8) | (bArr[1] & UByte.MAX_VALUE));
            cArr[i12 + 1] = (char) ((bArr[2] << 8) | (bArr[3] & UByte.MAX_VALUE));
            cArr[i12 + 2] = (char) ((bArr[4] << 8) | (bArr[5] & UByte.MAX_VALUE));
            cArr[i12 + 3] = (char) ((bArr[6] << 8) | (bArr[7] & UByte.MAX_VALUE));
            i12 += 4;
            remaining -= 8;
        }
        if (remaining > 0) {
            if (Streams.readFully(definiteLengthInputStream, bArr, 0, remaining) != remaining) {
                throw new EOFException("EOF encountered in middle of BMPString");
            }
            do {
                int i13 = i11 + 1;
                int i14 = bArr[i11] << 8;
                i11 += 2;
                cArr[i12] = (char) ((bArr[i13] & UByte.MAX_VALUE) | i14);
                i12++;
            } while (i11 < remaining);
        }
        if (definiteLengthInputStream.getRemaining() == 0 && i10 == i12) {
            return cArr;
        }
        throw new IllegalStateException();
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) {
        int remaining = definiteLengthInputStream.getRemaining();
        if (remaining >= bArr.length) {
            return definiteLengthInputStream.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        definiteLengthInputStream.readAllIntoByteArray(bArr2);
        return bArr2;
    }

    public static int readTagNumber(InputStream inputStream, int i10) {
        int i11 = i10 & 31;
        if (i11 != 31) {
            return i11;
        }
        int read = inputStream.read();
        if ((read & 127) == 0) {
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        int i12 = 0;
        while (read >= 0 && (read & 128) != 0) {
            i12 = ((read & 127) | i12) << 7;
            read = inputStream.read();
        }
        if (read >= 0) {
            return (read & 127) | i12;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public ASN1Primitive buildObject(int i10, int i11, int i12) {
        boolean z10 = (i10 & 32) != 0;
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i12, this.limit);
        if ((i10 & 64) != 0) {
            return new DLApplicationSpecific(z10, i11, definiteLengthInputStream.toByteArray());
        }
        if ((i10 & 128) != 0) {
            return new ASN1StreamParser(definiteLengthInputStream).readTaggedObject(z10, i11);
        }
        if (!z10) {
            return createPrimitiveDERObject(i11, definiteLengthInputStream, this.tmpBuffers);
        }
        if (i11 != 4) {
            if (i11 == 8) {
                return new DLExternal(readVector(definiteLengthInputStream));
            }
            if (i11 == 16) {
                return this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DLFactory.createSequence(readVector(definiteLengthInputStream));
            }
            if (i11 == 17) {
                return DLFactory.createSet(readVector(definiteLengthInputStream));
            }
            throw new IOException("unknown tag " + i11 + " encountered");
        }
        ASN1EncodableVector readVector = readVector(definiteLengthInputStream);
        int size = readVector.size();
        ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
        for (int i13 = 0; i13 != size; i13++) {
            ASN1Encodable aSN1Encodable = readVector.get(i13);
            if (!(aSN1Encodable instanceof ASN1OctetString)) {
                throw new ASN1Exception("unknown object encountered in constructed OCTET STRING: " + aSN1Encodable.getClass());
            }
            aSN1OctetStringArr[i13] = (ASN1OctetString) aSN1Encodable;
        }
        return new BEROctetString(aSN1OctetStringArr);
    }

    public int getLimit() {
        return this.limit;
    }

    public void readFully(byte[] bArr) {
        if (Streams.readFully(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    public int readLength() {
        return readLength(this, this.limit, false);
    }

    public ASN1Primitive readObject() {
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int readTagNumber = readTagNumber(this, read);
        boolean z10 = (read & 32) != 0;
        int readLength = readLength();
        if (readLength >= 0) {
            try {
                return buildObject(read, readTagNumber, readLength);
            } catch (IllegalArgumentException e10) {
                throw new ASN1Exception("corrupted stream detected", e10);
            }
        }
        if (!z10) {
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit);
        if ((read & 64) != 0) {
            return new BERApplicationSpecificParser(readTagNumber, aSN1StreamParser).getLoadedObject();
        }
        if ((read & 128) != 0) {
            return new BERTaggedObjectParser(true, readTagNumber, aSN1StreamParser).getLoadedObject();
        }
        if (readTagNumber == 4) {
            return new BEROctetStringParser(aSN1StreamParser).getLoadedObject();
        }
        if (readTagNumber == 8) {
            return new DERExternalParser(aSN1StreamParser).getLoadedObject();
        }
        if (readTagNumber == 16) {
            return new BERSequenceParser(aSN1StreamParser).getLoadedObject();
        }
        if (readTagNumber == 17) {
            return new BERSetParser(aSN1StreamParser).getLoadedObject();
        }
        throw new IOException("unknown BER object encountered");
    }

    public ASN1EncodableVector readVector(DefiniteLengthInputStream definiteLengthInputStream) {
        if (definiteLengthInputStream.getRemaining() < 1) {
            return new ASN1EncodableVector(0);
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(definiteLengthInputStream);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                return aSN1EncodableVector;
            }
            aSN1EncodableVector.add(readObject);
        }
    }

    public ASN1InputStream(InputStream inputStream, int i10) {
        this(inputStream, i10, false);
    }

    public static int readLength(InputStream inputStream, int i10, boolean z10) {
        int read = inputStream.read();
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (read == 128) {
            return -1;
        }
        if (read <= 127) {
            return read;
        }
        int i11 = read & 127;
        if (i11 > 4) {
            throw new IOException("DER length more than 4 bytes: " + i11);
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int read2 = inputStream.read();
            if (read2 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i12 = (i12 << 8) + read2;
        }
        if (i12 < 0) {
            throw new IOException("corrupted stream - negative length found");
        }
        if (i12 < i10 || z10) {
            return i12;
        }
        throw new IOException("corrupted stream - out of bounds length found: " + i12 + " >= " + i10);
    }

    public ASN1InputStream(InputStream inputStream, int i10, boolean z10) {
        super(inputStream);
        this.limit = i10;
        this.lazyEvaluate = z10;
        this.tmpBuffers = new byte[11][];
    }

    public ASN1InputStream(InputStream inputStream, boolean z10) {
        this(inputStream, StreamUtil.findLimit(inputStream), z10);
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, boolean z10) {
        this(new ByteArrayInputStream(bArr), bArr.length, z10);
    }
}
