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
public final class BackgroundProps {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] e = {Type.Companion.serializer(), null, null, null};
    public final Type a;
    public final String b;
    public final String c;
    public final Double d;

    public static final class Companion {
        public final KSerializer<BackgroundProps> serializer() {
            return BackgroundProps$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @imi0
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Type COLOR;
        public static final Companion Companion;

        public static final class Companion {
            public final KSerializer<Type> serializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }
        }

        static {
            Type type = new Type("COLOR", 0);
            COLOR = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new Companion();
            $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new a(0));
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public /* synthetic */ BackgroundProps(int i, Type type, String str, String str2, Double d) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = type;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
    }

    public BackgroundProps() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
