package com.googlecode.mp4parser.boxes.mp4;

import java.nio.ByteBuffer;
import java.util.Iterator;
import xsna.aqw;
import xsna.auo;
import xsna.cyg0;
import xsna.dyd0;
import xsna.e8l;
import xsna.imj0;
import xsna.mb7;
import xsna.n0y;
import xsna.o0y;
import xsna.o8l;
import xsna.w8g0;
import xsna.whq;
import xsna.zx4;

/* loaded from: classes13.dex */
public class ESDescriptorBox extends AbstractDescriptorBox {
    public static final String TYPE = "esds";
    private static final /* synthetic */ n0y ajc$tjp_0 = null;
    private static final /* synthetic */ n0y ajc$tjp_1 = null;
    private static final /* synthetic */ n0y ajc$tjp_2 = null;
    private static final /* synthetic */ n0y ajc$tjp_3 = null;

    static {
        ajc$preClinit();
    }

    public ESDescriptorBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        whq whqVar = new whq("ESDescriptorBox.java", ESDescriptorBox.class);
        ajc$tjp_0 = whqVar.f(whqVar.e("getEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor"));
        ajc$tjp_1 = whqVar.f(whqVar.e("setEsDescriptor", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.ESDescriptor", "esDescriptor", "", "void"));
        ajc$tjp_2 = whqVar.f(whqVar.e("equals", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "java.lang.Object", "o", "", "boolean"));
        ajc$tjp_3 = whqVar.f(whqVar.e("hashCode", "com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox", "", "", "", "int"));
    }

    public boolean equals(Object obj) {
        o0y d = whq.d(ajc$tjp_2, this, this, obj);
        w8g0.a();
        w8g0.b(d);
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ByteBuffer byteBuffer = this.data;
        ByteBuffer byteBuffer2 = ((ESDescriptorBox) obj).data;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0270  */
    @Override // com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox, com.googlecode.mp4parser.AbstractBox
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getContent(ByteBuffer byteBuffer) {
        int i;
        int i2;
        writeVersionAndFlags(byteBuffer);
        auo esDescriptor = getEsDescriptor();
        if (esDescriptor == null) {
            byteBuffer.put(this.data.duplicate());
            return;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[esDescriptor.b()]);
        aqw.w(3, wrap);
        esDescriptor.e(esDescriptor.a(), wrap);
        aqw.u(esDescriptor.d, wrap);
        wrap.put((byte) (((esDescriptor.e << 7) | (esDescriptor.f << 6) | (esDescriptor.g << 5) | (esDescriptor.h & 31)) & 255));
        if (esDescriptor.e > 0) {
            aqw.u(esDescriptor.k, wrap);
        }
        if (esDescriptor.f > 0) {
            wrap.put((byte) (esDescriptor.i & 255));
            wrap.put(imj0.b(esDescriptor.j));
            wrap.put((byte) 0);
        }
        if (esDescriptor.g > 0) {
            aqw.u(esDescriptor.l, wrap);
        }
        e8l e8lVar = esDescriptor.m;
        ByteBuffer allocate = ByteBuffer.allocate(e8lVar.b());
        aqw.w(e8lVar.a, allocate);
        e8lVar.e(e8lVar.a(), allocate);
        allocate.put((byte) (e8lVar.d & 255));
        allocate.put((byte) (((e8lVar.e << 2) | (e8lVar.f << 1) | 1) & 255));
        aqw.v(e8lVar.g, allocate);
        allocate.putInt((int) e8lVar.h);
        allocate.putInt((int) e8lVar.i);
        o8l o8lVar = e8lVar.j;
        if (o8lVar != null) {
            ByteBuffer allocate2 = ByteBuffer.allocate(o8lVar.b());
            aqw.w(o8lVar.a, allocate2);
            o8lVar.e(o8lVar.d.length, allocate2);
            allocate2.put(o8lVar.d);
            allocate.put((ByteBuffer) allocate2.rewind());
        }
        zx4 zx4Var = e8lVar.k;
        if (zx4Var != null) {
            ByteBuffer allocate3 = ByteBuffer.allocate(zx4Var.b());
            aqw.w(zx4Var.a, allocate3);
            zx4Var.e(zx4Var.a(), allocate3);
            ByteBuffer wrap2 = ByteBuffer.wrap(new byte[zx4Var.a()]);
            mb7 mb7Var = new mb7(wrap2);
            zx4.g(zx4Var.e, mb7Var);
            mb7Var.a(zx4Var.f, 4);
            if (zx4Var.f == 15) {
                mb7Var.a(zx4Var.g, 24);
            }
            mb7Var.a(zx4Var.h, 4);
            int i3 = zx4Var.d;
            if (i3 == 5 || i3 == 29) {
                zx4Var.i = 5;
                zx4Var.j = true;
                if (i3 == 29) {
                    zx4Var.k = true;
                }
                mb7Var.a(zx4Var.l, 4);
                if (zx4Var.l == 15) {
                    mb7Var.a(zx4Var.m, 24);
                }
                zx4.g(zx4Var.d, mb7Var);
                if (zx4Var.d == 22) {
                    mb7Var.a(zx4Var.n, 4);
                }
            }
            switch (zx4Var.d) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    mb7Var.a(zx4Var.v, 1);
                    mb7Var.a(zx4Var.w, 1);
                    if (zx4Var.w == 1) {
                        mb7Var.a(zx4Var.x, 14);
                    }
                    mb7Var.a(zx4Var.y, 1);
                    if (zx4Var.h == 0) {
                        throw new UnsupportedOperationException("can't parse program_config_element yet");
                    }
                    int i4 = zx4Var.d;
                    if (i4 == 6 || i4 == 20) {
                        mb7Var.a(zx4Var.z, 3);
                    }
                    if (zx4Var.y == 1) {
                        if (zx4Var.d == 22) {
                            mb7Var.a(zx4Var.A, 5);
                            mb7Var.a(zx4Var.B, 11);
                        }
                        int i5 = zx4Var.d;
                        if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                            mb7Var.a(zx4Var.C ? 1 : 0, 1);
                            mb7Var.a(zx4Var.D ? 1 : 0, 1);
                            mb7Var.a(zx4Var.E ? 1 : 0, 1);
                        }
                        mb7Var.a(zx4Var.F, 1);
                        if (zx4Var.F == 1) {
                            throw new RuntimeException("not yet implemented");
                        }
                    }
                    break;
                case 5:
                case 10:
                case 11:
                case 18:
                case 29:
                case 31:
                default:
                    int i6 = zx4Var.d;
                    if (i6 != 17 && i6 != 39) {
                        switch (i6) {
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                                break;
                            default:
                                i = zx4Var.u;
                                if (i >= 0) {
                                    mb7Var.a(i, 11);
                                    if (zx4Var.u == 695) {
                                        zx4.g(zx4Var.i, mb7Var);
                                        if (zx4Var.i == 5) {
                                            mb7Var.a(zx4Var.j ? 1 : 0, 1);
                                            if (zx4Var.j) {
                                                mb7Var.a(zx4Var.l, 4);
                                                if (zx4Var.l == 15) {
                                                    mb7Var.a(zx4Var.m, 24);
                                                }
                                                int i7 = zx4Var.t;
                                                if (i7 >= 0) {
                                                    mb7Var.a(i7, 11);
                                                    if (zx4Var.s == 1352) {
                                                        mb7Var.a(zx4Var.k ? 1 : 0, 1);
                                                    }
                                                }
                                            }
                                        }
                                        if (zx4Var.i == 22) {
                                            mb7Var.a(zx4Var.j ? 1 : 0, 1);
                                            if (zx4Var.j) {
                                                i2 = 4;
                                                mb7Var.a(zx4Var.l, 4);
                                                if (zx4Var.l == 15) {
                                                    mb7Var.a(zx4Var.m, 24);
                                                }
                                            } else {
                                                i2 = 4;
                                            }
                                            mb7Var.a(zx4Var.n, i2);
                                        }
                                    }
                                }
                                allocate3.put((ByteBuffer) wrap2.rewind());
                                allocate.put((ByteBuffer) allocate3.rewind());
                                break;
                        }
                    }
                    mb7Var.a(zx4Var.q, 2);
                    int i8 = zx4Var.q;
                    if (i8 == 2 || i8 == 3) {
                        throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                    }
                    if (i8 == 3) {
                        mb7Var.a(zx4Var.r, 1);
                        if (zx4Var.r == 0) {
                            throw new RuntimeException("not implemented");
                        }
                    }
                    i = zx4Var.u;
                    if (i >= 0) {
                    }
                    allocate3.put((ByteBuffer) wrap2.rewind());
                    allocate.put((ByteBuffer) allocate3.rewind());
                    break;
                case 8:
                    throw new UnsupportedOperationException("can't write CelpSpecificConfig yet");
                case 9:
                    throw new UnsupportedOperationException("can't write HvxcSpecificConfig yet");
                case 12:
                    throw new UnsupportedOperationException("can't write TTSSpecificConfig yet");
                case 13:
                case 14:
                case 15:
                case 16:
                    throw new UnsupportedOperationException("can't write StructuredAudioSpecificConfig yet");
                case 24:
                    throw new UnsupportedOperationException("can't write ErrorResilientCelpSpecificConfig yet");
                case 25:
                    throw new UnsupportedOperationException("can't write ErrorResilientHvxcSpecificConfig yet");
                case 26:
                case 27:
                    throw new UnsupportedOperationException("can't write parseParametricSpecificConfig yet");
                case 28:
                    throw new UnsupportedOperationException("can't write SSCSpecificConfig yet");
                case 30:
                    mb7Var.a(zx4Var.o, 1);
                    throw new UnsupportedOperationException("can't write SpatialSpecificConfig yet");
                case 32:
                case 33:
                case 34:
                    throw new UnsupportedOperationException("can't write MPEG_1_2_SpecificConfig yet");
                case 35:
                    throw new UnsupportedOperationException("can't write DSTSpecificConfig yet");
                case 36:
                    mb7Var.a(zx4Var.p, 5);
                    throw new UnsupportedOperationException("can't write ALSSpecificConfig yet");
                case 37:
                case 38:
                    throw new UnsupportedOperationException("can't write SLSSpecificConfig yet");
                case 39:
                    throw new UnsupportedOperationException("can't write ELDSpecificConfig yet");
                case 40:
                case 41:
                    throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
            }
        }
        Iterator it = e8lVar.l.iterator();
        while (it.hasNext()) {
            dyd0 dyd0Var = (dyd0) it.next();
            ByteBuffer allocate4 = ByteBuffer.allocate(dyd0Var.b());
            aqw.w(20, allocate4);
            dyd0Var.e(1, allocate4);
            allocate4.put((byte) (dyd0Var.d & 255));
            allocate.put(allocate4);
        }
        ByteBuffer byteBuffer2 = (ByteBuffer) allocate.rewind();
        cyg0 cyg0Var = esDescriptor.n;
        ByteBuffer allocate5 = ByteBuffer.allocate(cyg0Var.b());
        aqw.w(6, allocate5);
        cyg0Var.e(1, allocate5);
        allocate5.put((byte) (cyg0Var.d & 255));
        wrap.put(byteBuffer2.array());
        wrap.put(allocate5.array());
        byteBuffer.put((ByteBuffer) wrap.rewind());
    }

    @Override // com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox, com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (getEsDescriptor() != null ? r0.b() : this.data.remaining()) + 4;
    }

    public auo getEsDescriptor() {
        o0y c = whq.c(ajc$tjp_0, this, this);
        w8g0.a();
        w8g0.b(c);
        return (auo) super.getDescriptor();
    }

    public int hashCode() {
        o0y c = whq.c(ajc$tjp_3, this, this);
        w8g0.a();
        w8g0.b(c);
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            return byteBuffer.hashCode();
        }
        return 0;
    }

    public void setEsDescriptor(auo auoVar) {
        o0y d = whq.d(ajc$tjp_1, this, this, auoVar);
        w8g0.a();
        w8g0.b(d);
        super.setDescriptor(auoVar);
    }
}
