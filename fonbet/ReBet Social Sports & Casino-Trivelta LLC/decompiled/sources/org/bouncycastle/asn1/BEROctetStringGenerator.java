package org.bouncycastle.asn1;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public class BEROctetStringGenerator extends BERGenerator {

    public class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off = 0;

        public BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._derOut = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            int i10 = this._off;
            if (i10 != 0) {
                DEROctetString.encode(this._derOut, true, this._buf, 0, i10);
            }
            this._derOut.flushInternal();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i10) {
            byte[] bArr = this._buf;
            int i11 = this._off;
            int i12 = i11 + 1;
            this._off = i12;
            bArr[i11] = (byte) i10;
            if (i12 == bArr.length) {
                DEROctetString.encode(this._derOut, true, bArr, 0, bArr.length);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            while (i11 > 0) {
                int min = Math.min(i11, this._buf.length - this._off);
                System.arraycopy(bArr, i10, this._buf, this._off, min);
                int i12 = this._off + min;
                this._off = i12;
                byte[] bArr2 = this._buf;
                if (i12 < bArr2.length) {
                    return;
                }
                DEROctetString.encode(this._derOut, true, bArr2, 0, bArr2.length);
                this._off = 0;
                i10 += min;
                i11 -= min;
            }
        }
    }

    public BEROctetStringGenerator(OutputStream outputStream) {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i10, boolean z10) {
        super(outputStream, i10, z10);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }
}
