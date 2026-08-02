package com.plaid.internal;

import android.content.res.Resources;
import javax.inject.Inject;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class V0 extends androidx.lifecycle.Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final Resources f39698a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f39699a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f39700b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f39701c;

        public a(@NotNull String header, @NotNull String content, @NotNull String buttonText) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(buttonText, "buttonText");
            this.f39699a = header;
            this.f39700b = content;
            this.f39701c = buttonText;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f39699a, aVar.f39699a) && Intrinsics.areEqual(this.f39700b, aVar.f39700b) && Intrinsics.areEqual(this.f39701c, aVar.f39701c);
        }

        public final int hashCode() {
            return this.f39701c.hashCode() + C3783x.a(this.f39700b, this.f39699a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            return "ErrorTexts(header=" + this.f39699a + ", content=" + this.f39700b + ", buttonText=" + this.f39701c + ")";
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39702a;

        static {
            int[] iArr = new int[H3.values().length];
            try {
                iArr[H3.NETWORK_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H3.SESSION_EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H3.INITIALIZATION_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H3.HTTP_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H3.UNKNOWN_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f39702a = iArr;
        }
    }

    @Inject
    public V0(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f39698a = resources;
    }
}
