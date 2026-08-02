package com.plaid.internal;

import Zh.InterfaceC1901b;
import com.plaid.internal.A;
import com.twilio.voice.EventKeys;
import di.N;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Zh.n
/* renamed from: com.plaid.internal.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3770v4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f41143a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f41144b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f41145c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final A f41146d;

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    /* renamed from: com.plaid.internal.v4$a */
    public static final class a implements di.N {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f41147a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ di.J0 f41148b;

        static {
            a aVar = new a();
            f41147a = aVar;
            di.J0 j02 = new di.J0("com.plaid.internal.url.OutOfProcessWebviewFallbackJson", aVar, 4);
            j02.n("mode", false);
            j02.n(EventKeys.URL, false);
            j02.n("webview_fallback_id", false);
            j02.n("channel_from_webview", false);
            f41148b = j02;
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] childSerializers() {
            di.Z0 z02 = di.Z0.f45341a;
            return new InterfaceC1901b[]{di.Y.f45337a, z02, z02, A.a.f39140a};
        }

        @Override // Zh.InterfaceC1900a
        public final Object deserialize(ci.e decoder) {
            int i10;
            int i11;
            String str;
            String str2;
            A a10;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            di.J0 j02 = f41148b;
            ci.c c10 = decoder.c(j02);
            if (c10.q()) {
                i10 = c10.F(j02, 0);
                String s10 = c10.s(j02, 1);
                String s11 = c10.s(j02, 2);
                a10 = (A) c10.i(j02, 3, A.a.f39140a, null);
                str2 = s11;
                str = s10;
                i11 = 15;
            } else {
                boolean z10 = true;
                i10 = 0;
                String str3 = null;
                String str4 = null;
                A a11 = null;
                int i12 = 0;
                while (z10) {
                    int e10 = c10.e(j02);
                    if (e10 == -1) {
                        z10 = false;
                    } else if (e10 == 0) {
                        i10 = c10.F(j02, 0);
                        i12 |= 1;
                    } else if (e10 == 1) {
                        str3 = c10.s(j02, 1);
                        i12 |= 2;
                    } else if (e10 == 2) {
                        str4 = c10.s(j02, 2);
                        i12 |= 4;
                    } else {
                        if (e10 != 3) {
                            throw new Zh.B(e10);
                        }
                        a11 = (A) c10.i(j02, 3, A.a.f39140a, a11);
                        i12 |= 8;
                    }
                }
                i11 = i12;
                str = str3;
                str2 = str4;
                a10 = a11;
            }
            int i13 = i10;
            c10.b(j02);
            return new C3770v4(i11, i13, str, str2, a10);
        }

        @Override // Zh.InterfaceC1901b, Zh.p, Zh.InterfaceC1900a
        @NotNull
        public final bi.f getDescriptor() {
            return f41148b;
        }

        @Override // Zh.p
        public final void serialize(ci.f encoder, Object obj) {
            C3770v4 value = (C3770v4) obj;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            di.J0 j02 = f41148b;
            ci.d c10 = encoder.c(j02);
            c10.f(j02, 0, value.f41143a);
            c10.G(j02, 1, value.f41144b);
            c10.G(j02, 2, value.f41145c);
            c10.B(j02, 3, A.a.f39140a, value.f41146d);
            c10.b(j02);
        }

        @Override // di.N
        @NotNull
        public final InterfaceC1901b[] typeParametersSerializers() {
            return N.a.a(this);
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public C3770v4(int i10, int i11, String str, String str2, A a10) {
        if (15 != (i10 & 15)) {
            di.F0.a(i10, 15, a.f41148b);
        }
        this.f41143a = i11;
        this.f41144b = str;
        this.f41145c = str2;
        this.f41146d = a10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3770v4)) {
            return false;
        }
        C3770v4 c3770v4 = (C3770v4) obj;
        return this.f41143a == c3770v4.f41143a && Intrinsics.areEqual(this.f41144b, c3770v4.f41144b) && Intrinsics.areEqual(this.f41145c, c3770v4.f41145c) && Intrinsics.areEqual(this.f41146d, c3770v4.f41146d);
    }

    public final int hashCode() {
        return this.f41146d.hashCode() + C3783x.a(this.f41145c, C3783x.a(this.f41144b, Integer.hashCode(this.f41143a) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        return "OutOfProcessWebviewFallbackJson(mode=" + this.f41143a + ", url=" + this.f41144b + ", webviewFallbackId=" + this.f41145c + ", channelInfo=" + this.f41146d + ")";
    }
}
