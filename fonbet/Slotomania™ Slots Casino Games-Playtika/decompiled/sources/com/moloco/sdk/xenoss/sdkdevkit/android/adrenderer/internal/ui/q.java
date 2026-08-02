package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class q {
    public static final int a = 0;

    public static final class a extends q {
        public static final int e = 0;
        public final boolean b;
        public final int c;
        public final int d;

        public /* synthetic */ a(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, i, i2);
        }

        public final int a() {
            return this.d;
        }

        public final boolean b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public a(boolean z, int i, int i2) {
            super(null);
            this.b = z;
            this.c = i;
            this.d = i2;
        }
    }

    public static final class b extends q {
        public static final int g = 8;
        public final Painter b;
        public final String c;
        public final long d;
        public final Shape e;
        public final long f;

        public /* synthetic */ b(Painter painter, String str, long j, Shape shape, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(painter, str, j, shape, j2);
        }

        public final long a() {
            return this.f;
        }

        public final Shape b() {
            return this.e;
        }

        public final String c() {
            return this.c;
        }

        public final long d() {
            return this.d;
        }

        public final Painter e() {
            return this.b;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Painter painter, String str, long j, Shape backgroundShape, long j2) {
            super(null);
            Intrinsics.checkNotNullParameter(painter, "painter");
            Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.b = painter;
            this.c = str;
            this.d = j;
            this.e = backgroundShape;
            this.f = j2;
        }
    }

    public static final class c extends q {
        public static final int c = 0;
        public final String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String text) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            this.b = text;
        }

        public final String a() {
            return this.b;
        }
    }

    public static final class d extends q {
        public static final int l = 8;
        public final String b;
        public final Painter c;
        public final String d;
        public final long e;
        public final Shape f;
        public final long g;
        public final boolean h;
        public final boolean i;
        public final long j;
        public final long k;

        public /* synthetic */ d(String str, Painter painter, String str2, long j, Shape shape, long j2, boolean z, boolean z2, long j3, long j4, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, painter, str2, j, shape, j2, z, z2, j3, j4);
        }

        public final long a() {
            return this.g;
        }

        public final Shape b() {
            return this.f;
        }

        public final String c() {
            return this.d;
        }

        public final long d() {
            return this.k;
        }

        public final long e() {
            return this.j;
        }

        public final long f() {
            return this.e;
        }

        public final Painter g() {
            return this.c;
        }

        public final String h() {
            return this.b;
        }

        public final boolean i() {
            return this.h;
        }

        public final boolean j() {
            return this.i;
        }

        public /* synthetic */ d(String str, Painter painter, String str2, long j, Shape shape, long j2, boolean z, boolean z2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, painter, str2, j, shape, j2, z, z2, j3, (i & 512) != 0 ? TextUnit.INSTANCE.m4642getUnspecifiedXSAIIZE() : j4, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String text, Painter painter, String str, long j, Shape backgroundShape, long j2, boolean z, boolean z2, long j3, long j4) {
            super(null);
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(painter, "painter");
            Intrinsics.checkNotNullParameter(backgroundShape, "backgroundShape");
            this.b = text;
            this.c = painter;
            this.d = str;
            this.e = j;
            this.f = backgroundShape;
            this.g = j2;
            this.h = z;
            this.i = z2;
            this.j = j3;
            this.k = j4;
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public q() {
    }
}
