package com.vk.movika.sdk.base.model.props;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import xsna.asp;
import xsna.imi0;
import xsna.msy;
import xsna.sp;
import xsna.zrp;

@imi0
/* loaded from: classes3.dex */
public final class ShapeProps {
    public static final Companion Companion = new Companion();
    public static final KSerializer<Object>[] d = {null, Type.Companion.serializer(), null};
    public final BorderProps a;
    public final Type b;
    public final Double c;

    public static final class Companion {
        public final KSerializer<ShapeProps> serializer() {
            return ShapeProps$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @imi0
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
        public static final Companion Companion;
        public static final Type RECTANGLE;

        public static final class Companion {
            public final KSerializer<Type> serializer() {
                return (KSerializer) Type.$cachedSerializer$delegate.getValue();
            }
        }

        static {
            Type type = new Type("RECTANGLE", 0);
            RECTANGLE = type;
            Type[] typeArr = {type};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
            Companion = new Companion();
            $cachedSerializer$delegate = msy.a(LazyThreadSafetyMode.PUBLICATION, new b());
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

    public /* synthetic */ ShapeProps(int i, BorderProps borderProps, Type type, Double d2) {
        if (2 != (i & 2)) {
            sp.x(i, 2, ShapeProps$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = borderProps;
        }
        this.b = type;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }
}
