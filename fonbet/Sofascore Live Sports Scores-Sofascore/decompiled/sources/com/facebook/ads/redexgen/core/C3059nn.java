package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.nn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C3059nn implements FL, InterfaceC1643Cp {
    public static String[] A0E = {"SSDELygzudefytBtRYlDWoyFfpg", "4SEnazR2Nu4dPKZqq", "4H9jqKlT7lQdtxWBQl9xa6akogWkCWsp", "Wknx73gM1GoPE2GN1snRYal1oMjUwY3P", "7txELYcTJwThSLRxJ5dUM1K4qPQ", "gA7GGJKubAjwOro28", "9KdodW4K4GXGszeM7wnefptXiT4TjY3", ""};
    public long A00;
    public C14725i A01;
    public InterfaceC1759Hd A02;
    public boolean A04;
    public final Uri A06;
    public final AnonymousClass48 A07;
    public final AG A08;
    public final DD A09;
    public final HA A0A;
    public volatile boolean A0C;
    public final /* synthetic */ C15759p A0D;
    public final HV A0B = new HV();
    public boolean A03 = true;
    public final long A05 = Cq.A00();

    public C3059nn(C15759p c15759p, Uri uri, InterfaceC3148pF interfaceC3148pF, DD dd, HA ha, AnonymousClass48 anonymousClass48) {
        this.A0D = c15759p;
        this.A06 = uri;
        this.A08 = new AG(interfaceC3148pF);
        this.A09 = dd;
        this.A0A = ha;
        this.A07 = anonymousClass48;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(long j, long j2) {
        this.A0B.A00 = j;
        this.A00 = j2;
        this.A03 = true;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void A4r() {
        this.A0C = true;
    }

    @Override // com.facebook.ads.redexgen.core.FL
    public final void AAr() throws IOException {
        int i = 0;
        while (i == 0 && !this.A0C) {
            try {
                long j = this.A0B.A00;
                this.A01 = new C14725i(this.A06, j, -1L, this.A0D.A0b);
                long AGi = this.A08.AGi(this.A01);
                if (AGi != -1) {
                    AGi += j;
                    this.A0D.A0G();
                }
                this.A0D.A09 = null;
                InterfaceC3148pF interfaceC3148pF = this.A08;
                if (this.A0D.A09 != null && this.A0D.A09.A01 != -1) {
                    final AG ag = this.A08;
                    final int i2 = this.A0D.A09.A01;
                    interfaceC3148pF = new InterfaceC3148pF(ag, i2, this) { // from class: com.facebook.ads.redexgen.X.9r
                        public int A00;
                        public final int A01;
                        public final InterfaceC3148pF A02;
                        public final InterfaceC1643Cp A03;
                        public final byte[] A04;

                        {
                            AbstractC14363y.A07(i2 > 0);
                            this.A02 = ag;
                            this.A01 = i2;
                            this.A03 = this;
                            this.A04 = new byte[1];
                            this.A00 = i2;
                        }

                        private boolean A00() throws IOException {
                            int bytesRead = this.A02.read(this.A04, 0, 1);
                            if (bytesRead == -1) {
                                return false;
                            }
                            int bytesRead2 = this.A04[0];
                            int metadataLength = (bytesRead2 & 255) << 4;
                            if (metadataLength == 0) {
                                return true;
                            }
                            int i3 = 0;
                            int i4 = metadataLength;
                            byte[] bArr = new byte[metadataLength];
                            while (i4 > 0) {
                                int bytesRead3 = this.A02.read(bArr, i3, i4);
                                if (bytesRead3 == -1) {
                                    return false;
                                }
                                i3 += bytesRead3;
                                i4 -= bytesRead3;
                            }
                            while (metadataLength > 0) {
                                int bytesRead4 = metadataLength - 1;
                                if (bArr[bytesRead4] != 0) {
                                    break;
                                }
                                metadataLength--;
                            }
                            if (metadataLength > 0) {
                                this.A03.AE5(new C14594v(bArr, metadataLength));
                            }
                            return true;
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
                        public final void A43(InterfaceC14835t interfaceC14835t) {
                            AbstractC14363y.A01(interfaceC14835t);
                            this.A02.A43(interfaceC14835t);
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
                        public final Map<String, List<String>> A8t() {
                            return this.A02.A8t();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
                        public final Uri A9P() {
                            return this.A02.A9P();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
                        public final long AGi(C14725i c14725i) {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC3148pF
                        public final void close() {
                            throw new UnsupportedOperationException();
                        }

                        @Override // com.facebook.ads.redexgen.core.InterfaceC13922c
                        public final int read(byte[] bArr, int i3, int i4) throws IOException {
                            if (this.A00 == 0) {
                                if (!A00()) {
                                    return -1;
                                }
                                this.A00 = this.A01;
                            }
                            int read = this.A02.read(bArr, i3, Math.min(this.A00, i4));
                            if (read != -1) {
                                int bytesRead = this.A00;
                                this.A00 = bytesRead - read;
                            }
                            return read;
                        }
                    };
                    this.A02 = this.A0D.A0Z();
                    this.A02.A6e(C15759p.A0g);
                }
                this.A09.AAB(interfaceC3148pF, this.A06, this.A08.A8t(), j, AGi, this.A0A);
                if (this.A0D.A09 != null) {
                    this.A09.A5y();
                }
                if (this.A03) {
                    this.A09.AJ6(j, this.A00);
                    this.A03 = false;
                }
                while (i == 0 && !this.A0C) {
                    try {
                        this.A07.A00();
                        i = this.A09.AHM(this.A0B);
                        long position = this.A09.A7a();
                        if (position > this.A0D.A0M + j) {
                            j = position;
                            this.A07.A02();
                            this.A0D.A0O.post(this.A0D.A0a);
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (i == 1) {
                    i = 0;
                } else {
                    long A7a = this.A09.A7a();
                    String[] strArr = A0E;
                    if (strArr[2].charAt(24) != strArr[3].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A0E[6] = "OKjnlHtv3KbBLefZQYMpPe9SdH47QI1";
                    if (A7a != -1) {
                        this.A0B.A00 = this.A09.A7a();
                    }
                }
                AbstractC14675d.A00(this.A08);
            } catch (Throwable th) {
                if (i != 1 && this.A09.A7a() != -1) {
                    this.A0B.A00 = this.A09.A7a();
                }
                AbstractC14675d.A00(this.A08);
                throw th;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1643Cp
    public final void AE5(C14594v c14594v) {
        long max;
        if (this.A04) {
            max = Math.max(this.A0D.A03(true), this.A00);
        } else {
            max = this.A00;
        }
        int A07 = c14594v.A07();
        InterfaceC1759Hd interfaceC1759Hd = (InterfaceC1759Hd) AbstractC14363y.A01(this.A02);
        interfaceC1759Hd.AIr(c14594v, A07);
        interfaceC1759Hd.AIu(max, 1, A07, 0, null);
        this.A04 = true;
    }
}
