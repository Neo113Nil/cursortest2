package com.vk.movika.sdk.base.model.props;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import xsna.asp;
import xsna.imi0;
import xsna.msy;
import xsna.zrp;

@imi0
/* loaded from: classes3.dex */
public final class TextProps {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] g = {null, GravityHorizontal.Companion.serializer(), GravityVertical.Companion.serializer(), null, null, null};
    public final String a;
    public final GravityHorizontal b;
    public final GravityVertical c;
    public final String d;
    public final Double e;
    public final Double f;

    public static final class Companion {
        public final KSerializer<TextProps> serializer() {
            return TextProps$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @imi0
    public static final class GravityHorizontal {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GravityHorizontal[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final GravityHorizontal CENTER;
        public static final Companion Companion;
        public static final GravityHorizontal END;
        public static final GravityHorizontal START;

        public static final class Companion {
            public final KSerializer<GravityHorizontal> serializer() {
                return (KSerializer) GravityHorizontal.$cachedSerializer$delegate.getValue();
            }
        }

        static {
            GravityHorizontal gravityHorizontal = new GravityHorizontal("START", 0);
            START = gravityHorizontal;
            GravityHorizontal gravityHorizontal2 = new GravityHorizontal("CENTER", 1);
            CENTER = gravityHorizontal2;
            GravityHorizontal gravityHorizontal3 = new GravityHorizontal("END", 2);
            END = gravityHorizontal3;
            GravityHorizontal[] gravityHorizontalArr = {gravityHorizontal, gravityHorizontal2, gravityHorizontal3};
            $VALUES = gravityHorizontalArr;
            $ENTRIES = new asp(gravityHorizontalArr);
            Companion = new Companion();
            $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new c(0));
        }

        public GravityHorizontal() {
            throw null;
        }

        public static GravityHorizontal valueOf(String str) {
            return (GravityHorizontal) Enum.valueOf(GravityHorizontal.class, str);
        }

        public static GravityHorizontal[] values() {
            return (GravityHorizontal[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @imi0
    public static final class GravityVertical {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GravityVertical[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final GravityVertical BOTTOM;
        public static final GravityVertical CENTER;
        public static final Companion Companion;
        public static final GravityVertical TOP;

        public static final class Companion {
            public final KSerializer<GravityVertical> serializer() {
                return (KSerializer) GravityVertical.$cachedSerializer$delegate.getValue();
            }
        }

        static {
            GravityVertical gravityVertical = new GravityVertical("TOP", 0);
            TOP = gravityVertical;
            GravityVertical gravityVertical2 = new GravityVertical("CENTER", 1);
            CENTER = gravityVertical2;
            GravityVertical gravityVertical3 = new GravityVertical("BOTTOM", 2);
            BOTTOM = gravityVertical3;
            GravityVertical[] gravityVerticalArr = {gravityVertical, gravityVertical2, gravityVertical3};
            $VALUES = gravityVerticalArr;
            $ENTRIES = new asp(gravityVerticalArr);
            Companion = new Companion();
            $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new d(0));
        }

        public GravityVertical() {
            throw null;
        }

        public static GravityVertical valueOf(String str) {
            return (GravityVertical) Enum.valueOf(GravityVertical.class, str);
        }

        public static GravityVertical[] values() {
            return (GravityVertical[]) $VALUES.clone();
        }
    }

    public /* synthetic */ TextProps(int i, String str, GravityHorizontal gravityHorizontal, GravityVertical gravityVertical, String str2, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = gravityHorizontal;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = gravityVertical;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d2;
        }
    }

    public TextProps() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
