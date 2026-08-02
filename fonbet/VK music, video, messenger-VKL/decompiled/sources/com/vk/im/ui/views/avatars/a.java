package com.vk.im.ui.views.avatars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.vk.dto.common.Peer;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import defpackage.j;
import defpackage.k;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.an10;
import xsna.bpn0;
import xsna.cdp;
import xsna.cqi;
import xsna.drm0;
import xsna.epx;
import xsna.gep;
import xsna.ho8;
import xsna.i5s;
import xsna.qq;
import xsna.qtd0;
import xsna.ucp;
import xsna.urd0;
import xsna.vu5;
import xsna.x9;

/* compiled from: AbbreviationAvatarDrawable.kt */
/* loaded from: classes2.dex */
public final class a extends Drawable {
    public static final /* synthetic */ int o = 0;
    public final Context a;
    public final float b;
    public final Paint c;
    public final Paint d;
    public final Rect e;
    public final char[] f;
    public gep g;
    public gep h;
    public cdp i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public Integer m;
    public C1177a n;

    /* compiled from: AbbreviationAvatarDrawable.kt */
    /* renamed from: com.vk.im.ui.views.avatars.a$a, reason: collision with other inner class name */
    public static final class C1177a {
        public final int a;
        public final int b;

        public C1177a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1177a)) {
                return false;
            }
            C1177a c1177a = (C1177a) obj;
            return this.a == c1177a.a && this.b == c1177a.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("GradientConfig(startColor=");
            sb.append(this.a);
            sb.append(", endColor=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: AbbreviationAvatarDrawable.kt */
    public static abstract class b {

        /* compiled from: AbbreviationAvatarDrawable.kt */
        /* renamed from: com.vk.im.ui.views.avatars.a$b$a, reason: collision with other inner class name */
        public static final class C1178a extends b {
            public final long a;
            public final String b;

            public C1178a(long j, String str) {
                this.a = j;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1178a)) {
                    return false;
                }
                C1178a c1178a = (C1178a) obj;
                return this.a == c1178a.a && epx.f(this.b, c1178a.b);
            }

            public final int hashCode() {
                return urd0.a(Long.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Chat(id=");
                sb.append(this.a);
                sb.append(", title=");
                return i5s.a(sb, this.b, ", backgroundColor=null)");
            }
        }

        /* compiled from: AbbreviationAvatarDrawable.kt */
        /* renamed from: com.vk.im.ui.views.avatars.a$b$b, reason: collision with other inner class name */
        public static final class C1179b extends b {
            public final String a;

            public C1179b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1179b) && epx.f(this.a, ((C1179b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("Contact(name="), this.a, ')');
            }
        }

        /* compiled from: AbbreviationAvatarDrawable.kt */
        public static final class c extends b {
            public final qtd0 a;

            public c(qtd0 qtd0Var) {
                this.a = qtd0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return qq.f(new StringBuilder("Profile(profile="), this.a, ')');
            }
        }
    }

    /* compiled from: AbbreviationAvatarDrawable.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(Context context, b bVar, int i) {
        Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, context);
        TextSizeUnit textSizeUnit = TextSizeUnit.SP;
        bVar = (i & 4) != 0 ? null : bVar;
        this.a = context;
        this.b = 0.6f;
        int i2 = 1;
        this.c = x9.c(true);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setSubpixelText(true);
        paint.setLinearText(true);
        paint.setTypeface(a);
        this.d = paint;
        this.e = new Rect();
        this.f = new char[2];
        this.j = new bpn0(new j(this, i2));
        this.k = new bpn0(new k(this, i2));
        this.l = new bpn0(new com.vk.movika.sdk.android.defaultplayer.interactive.a(this, i2));
        if (bVar != null) {
            if (bVar instanceof b.c) {
                d(((b.c) bVar).a);
                return;
            }
            if (bVar instanceof b.C1179b) {
                c(((b.C1179b) bVar).a, Peer.Type.CONTACT);
            } else {
                if (!(bVar instanceof b.C1178a)) {
                    throw new NoWhenBranchMatchedException();
                }
                b.C1178a c1178a = (b.C1178a) bVar;
                b(c1178a.a, c1178a.b, null);
            }
        }
    }

    public static void e(String str, char[] cArr) {
        if (cArr.length != 2) {
            return;
        }
        cArr[0] = 0;
        cArr[1] = 0;
        if (str.length() == 0) {
            return;
        }
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (Character.isLetter(str.charAt(i))) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        cArr[0] = Character.toUpperCase(str.charAt(i));
        int L = drm0.L(str, ' ', i, 4) + 1;
        Integer valueOf = Integer.valueOf(L);
        if (1 > L || L >= str.length()) {
            valueOf = null;
        }
        if (valueOf != null) {
            char charAt = str.charAt(valueOf.intValue());
            Character valueOf2 = Character.isLetter(charAt) ? Character.valueOf(charAt) : null;
            if (valueOf2 != null) {
                cArr[1] = Character.toUpperCase(valueOf2.charValue());
            }
        }
    }

    public final void a() {
        Paint paint = this.c;
        paint.setColor(-1);
        Integer num = this.m;
        if (num != null) {
            paint.setColor(num.intValue());
        }
        paint.setShader(null);
        C1177a c1177a = this.n;
        if (c1177a != null) {
            paint.setShader(new LinearGradient(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, c1177a.a, c1177a.b, Shader.TileMode.CLAMP));
        }
        invalidateSelf();
    }

    public final void b(long j, String str, Integer num) {
        e(str, this.f);
        ucp ucpVar = ucp.a;
        this.g = ucp.b(str);
        if (num == null) {
            this.m = null;
            this.n = (C1177a) ((List) this.l.getValue()).get((int) (j % ((List) r5.getValue()).size()));
        } else {
            this.m = num;
            this.n = null;
        }
        a();
    }

    public final void c(String str, Peer.Type type) {
        e(str, this.f);
        ucp ucpVar = ucp.a;
        this.g = ucp.b(str);
        this.m = null;
        this.n = c.$EnumSwitchMapping$0[type.ordinal()] == 1 ? (C1177a) this.k.getValue() : (C1177a) this.j.getValue();
        a();
    }

    public final void d(qtd0 qtd0Var) {
        e(qtd0Var.name(), this.f);
        ucp ucpVar = ucp.a;
        this.g = ucp.b(qtd0Var.name());
        this.m = null;
        this.n = c.$EnumSwitchMapping$0[qtd0Var.t8().ordinal()] == 1 ? (C1177a) this.k.getValue() : (C1177a) this.j.getValue();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, this.c);
        gep gepVar = this.g;
        if (gepVar == null) {
            Paint paint = this.d;
            paint.setTextSize(getBounds().width() * 0.33f);
            char[] cArr = this.f;
            int length = cArr.length;
            Rect rect = this.e;
            paint.getTextBounds(cArr, 0, length, rect);
            canvas2 = canvas;
            canvas2.drawText(cArr, 0, cArr.length, getBounds().exactCenterX() - rect.exactCenterX(), getBounds().exactCenterY() - rect.exactCenterY(), paint);
            this.i = null;
            this.h = null;
        } else {
            canvas2 = canvas;
            if (!gepVar.equals(this.h)) {
                gep gepVar2 = this.g;
                this.h = gepVar2;
                ucp ucpVar = ucp.a;
                this.i = ucp.c(gepVar2, an10.b(getBounds().right * this.b));
            }
        }
        if (this.i != null) {
            canvas2.save();
            canvas2.translate(getBounds().exactCenterX() - (this.i.getIntrinsicWidth() / 2.0f), getBounds().exactCenterY() - (this.i.getIntrinsicHeight() / 2.0f));
            cdp cdpVar = this.i;
            if (cdpVar != null) {
                cdpVar.draw(canvas2);
            }
            canvas2.restore();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.d.getTypeface(), aVar.d.getTypeface()) && Arrays.equals(this.f, aVar.f) && epx.f(this.h, aVar.h) && epx.f(this.m, aVar.m) && epx.f(this.n, aVar.n);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f) + (this.d.getTypeface().hashCode() * 31)) * 31;
        gep gepVar = this.h;
        int hashCode2 = (hashCode + (gepVar != null ? gepVar.hashCode() : 0)) * 31;
        Integer num = this.m;
        int intValue = (hashCode2 + (num != null ? num.intValue() : 0)) * 31;
        C1177a c1177a = this.n;
        return intValue + (c1177a != null ? c1177a.hashCode() : 0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.c.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
