package org.bouncycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class ASN1StreamParser {
    private final InputStream _in;
    private final int _limit;
    private final byte[][] tmpBuffers;

    public ASN1StreamParser(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    private void set00Check(boolean z10) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z10);
        }
    }

    public ASN1Encodable readImplicit(boolean z10, int i10) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            if (z10) {
                return readIndef(i10);
            }
            throw new IOException("indefinite-length primitive encoding encountered");
        }
        if (z10) {
            if (i10 == 4) {
                return new BEROctetStringParser(this);
            }
            if (i10 == 16) {
                return new DLSequenceParser(this);
            }
            if (i10 == 17) {
                return new DLSetParser(this);
            }
        } else {
            if (i10 == 4) {
                return new DEROctetStringParser((DefiniteLengthInputStream) inputStream);
            }
            if (i10 == 16) {
                throw new ASN1Exception("sets must use constructed encoding (see X.690 8.11.1/8.12.1)");
            }
            if (i10 == 17) {
                throw new ASN1Exception("sequences must use constructed encoding (see X.690 8.9.1/8.10.1)");
            }
        }
        throw new ASN1Exception("implicit tagging not implemented");
    }

    public ASN1Encodable readIndef(int i10) {
        if (i10 == 4) {
            return new BEROctetStringParser(this);
        }
        if (i10 == 8) {
            return new DERExternalParser(this);
        }
        if (i10 == 16) {
            return new BERSequenceParser(this);
        }
        if (i10 == 17) {
            return new BERSetParser(this);
        }
        throw new ASN1Exception("unknown BER object encountered: 0x" + Integer.toHexString(i10));
    }

    public ASN1Encodable readObject() {
        int read = this._in.read();
        if (read == -1) {
            return null;
        }
        set00Check(false);
        int readTagNumber = ASN1InputStream.readTagNumber(this._in, read);
        boolean z10 = (read & 32) != 0;
        int readLength = ASN1InputStream.readLength(this._in, this._limit, readTagNumber == 4 || readTagNumber == 16 || readTagNumber == 17 || readTagNumber == 8);
        if (readLength < 0) {
            if (!z10) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this._in, this._limit), this._limit);
            return (read & 64) != 0 ? new BERApplicationSpecificParser(readTagNumber, aSN1StreamParser) : (read & 128) != 0 ? new BERTaggedObjectParser(true, readTagNumber, aSN1StreamParser) : aSN1StreamParser.readIndef(readTagNumber);
        }
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this._in, readLength, this._limit);
        if ((read & 64) != 0) {
            return new DLApplicationSpecific(z10, readTagNumber, definiteLengthInputStream.toByteArray());
        }
        if ((read & 128) != 0) {
            return new BERTaggedObjectParser(z10, readTagNumber, new ASN1StreamParser(definiteLengthInputStream));
        }
        if (!z10) {
            if (readTagNumber == 4) {
                return new DEROctetStringParser(definiteLengthInputStream);
            }
            try {
                return ASN1InputStream.createPrimitiveDERObject(readTagNumber, definiteLengthInputStream, this.tmpBuffers);
            } catch (IllegalArgumentException e10) {
                throw new ASN1Exception("corrupted stream detected", e10);
            }
        }
        if (readTagNumber == 4) {
            return new BEROctetStringParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        if (readTagNumber == 8) {
            return new DERExternalParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        if (readTagNumber == 16) {
            return new DLSequenceParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        if (readTagNumber == 17) {
            return new DLSetParser(new ASN1StreamParser(definiteLengthInputStream));
        }
        throw new IOException("unknown tag " + readTagNumber + " encountered");
    }

    public ASN1Primitive readTaggedObject(boolean z10, int i10) {
        if (!z10) {
            return new DLTaggedObject(false, i10, new DEROctetString(((DefiniteLengthInputStream) this._in).toByteArray()));
        }
        ASN1EncodableVector readVector = readVector();
        return this._in instanceof IndefiniteLengthInputStream ? readVector.size() == 1 ? new BERTaggedObject(true, i10, readVector.get(0)) : new BERTaggedObject(false, i10, BERFactory.createSequence(readVector)) : readVector.size() == 1 ? new DLTaggedObject(true, i10, readVector.get(0)) : new DLTaggedObject(false, i10, DLFactory.createSequence(readVector));
    }

    public ASN1EncodableVector readVector() {
        ASN1Encodable readObject = readObject();
        if (readObject == null) {
            return new ASN1EncodableVector(0);
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        do {
            aSN1EncodableVector.add(readObject instanceof InMemoryRepresentable ? ((InMemoryRepresentable) readObject).getLoadedObject() : readObject.toASN1Primitive());
            readObject = readObject();
        } while (readObject != null);
        return aSN1EncodableVector;
    }

    public ASN1StreamParser(InputStream inputStream, int i10) {
        this._in = inputStream;
        this._limit = i10;
        this.tmpBuffers = new byte[11][];
    }

    public ASN1StreamParser(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }
}
