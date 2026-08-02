package com.vk.media.gles;

import android.os.Build;
import androidx.annotation.Nullable;
import com.vk.media.gles.EglTexture;
import com.vk.media.rotation.Flip;
import com.vk.media.rotation.Rotation;
import java.nio.FloatBuffer;
import xsna.io9;
import xsna.koo0;
import xsna.nap;

/* compiled from: EglDrawable.java */
/* loaded from: classes.dex */
public class a {
    public static final Rotation d = Rotation.ROTATION_270;
    public final C1262a b;
    public EglTexture c;

    /* compiled from: EglDrawable.java */
    /* renamed from: com.vk.media.gles.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1262a {
        public final FloatBuffer a = nap.c(koo0.a);
        public FloatBuffer b;
        public FloatBuffer c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final EglTexture.ProgramType h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public Rotation m;

        public C1262a(EglTexture.ProgramType programType) {
            this.h = EglTexture.ProgramType.TEXTURE_2D;
            this.h = programType;
            h(false, true, true, false, null);
            this.e = 2;
            this.f = 8;
            this.d = 4;
            this.g = 8;
        }

        public final int a() {
            return this.e;
        }

        public final Rotation b() {
            return this.m;
        }

        public final FloatBuffer c(Flip flip) {
            return flip == Flip.NO_FLIP ? this.b : this.c;
        }

        public final int d() {
            return this.g;
        }

        public final FloatBuffer e() {
            return this.a;
        }

        public final int f() {
            return this.d;
        }

        public final int g() {
            return this.f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
        
            if (r0.contains(xsna.io9.b[0]) != false) goto L17;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(boolean z, boolean z2, boolean z3, boolean z4, @Nullable Rotation rotation) {
            Rotation rotation2;
            Flip flip = Flip.NO_FLIP;
            if (rotation == null) {
                rotation = Rotation.ROTATION_0;
            }
            this.m = rotation;
            EglTexture.ProgramType programType = EglTexture.ProgramType.TEXTURE_2D;
            EglTexture.ProgramType programType2 = this.h;
            if (programType2 == programType || programType2 == EglTexture.ProgramType.TEXTURE_2D_YUV) {
                if (z3) {
                    if (z4) {
                        rotation2 = a.d;
                    } else {
                        rotation2 = Rotation.ROTATION_0;
                        String str = Build.MODEL;
                        boolean z5 = false;
                        if (!z) {
                            for (int i = 0; i < 3; i++) {
                                if (str.contains(io9.a[i])) {
                                    z5 = true;
                                    break;
                                }
                            }
                            int d = io9.d();
                            if (d == 0) {
                                rotation2 = z5 ? Rotation.ROTATION_90 : Rotation.ROTATION_270;
                            } else if (d == 1) {
                                rotation2 = z5 ? Rotation.ROTATION_0 : Rotation.ROTATION_180;
                            } else if (d == 2) {
                                rotation2 = z5 ? Rotation.ROTATION_270 : Rotation.ROTATION_90;
                            } else if (d == 3) {
                                rotation2 = z5 ? Rotation.ROTATION_180 : Rotation.ROTATION_0;
                            }
                        }
                    }
                    this.m = rotation2;
                    flip = Flip.VERTICAL_HORIZONTAL;
                } else {
                    this.m = Rotation.ROTATION_180;
                    if (z2 && z) {
                        flip = Flip.VERTICAL_HORIZONTAL;
                    } else if (z2) {
                        flip = Flip.HORIZONTAL;
                    } else if (z) {
                        flip = Flip.VERTICAL;
                    }
                }
            }
            this.k = z3;
            this.i = z;
            this.j = z2;
            this.l = z4;
            this.b = nap.c(koo0.d(this.m, flip, true));
            this.c = nap.c(koo0.d(this.m, Flip.VERTICAL, true));
        }

        public final void i(@Nullable Rotation rotation) {
            if (this.m != rotation) {
                h(this.i, this.j, this.k, this.l, rotation);
            }
        }
    }

    public a(EglTexture eglTexture) {
        this.b = new C1262a(eglTexture.c());
        this.c = eglTexture;
    }

    public final void g(int i, float[] fArr, float[] fArr2, Flip flip) {
        float[] fArr3 = fArr == null ? nap.a : fArr;
        EglTexture eglTexture = this.c;
        C1262a c1262a = this.b;
        eglTexture.b(fArr3, c1262a.e(), c1262a.f(), c1262a.a(), c1262a.g(), fArr2, c1262a.c(flip), i, c1262a.d());
    }

    public void h() {
        EglTexture eglTexture = this.c;
        if (eglTexture != null) {
            eglTexture.d();
            this.c = null;
        }
    }

    public final void i(@Nullable Rotation rotation) {
        this.b.i(rotation);
    }
}
