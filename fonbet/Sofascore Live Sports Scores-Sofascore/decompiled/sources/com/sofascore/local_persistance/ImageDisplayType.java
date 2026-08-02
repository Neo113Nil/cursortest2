package com.sofascore.local_persistance;

import com.ironsource.U3;
import com.ironsource.mediationsdk.j;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import defpackage.duf;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/sofascore/local_persistance/ImageDisplayType;", "Lcom/squareup/wire/WireEnum;", "", U3.i.X, "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", j.a, "AD_UNIT", "Companion", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ImageDisplayType implements WireEnum {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ ImageDisplayType[] $VALUES;

    @NotNull
    public static final ProtoAdapter<ImageDisplayType> ADAPTER;
    public static final ImageDisplayType AD_UNIT;
    public static final ImageDisplayType BANNER;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ImageDisplayType UNKNOWN;
    private final int value;

    private static final /* synthetic */ ImageDisplayType[] $values() {
        return new ImageDisplayType[]{UNKNOWN, BANNER, AD_UNIT};
    }

    static {
        final ImageDisplayType imageDisplayType = new ImageDisplayType("UNKNOWN", 0, 0);
        UNKNOWN = imageDisplayType;
        BANNER = new ImageDisplayType(j.a, 1, 1);
        AD_UNIT = new ImageDisplayType("AD_UNIT", 2, 2);
        ImageDisplayType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(ImageDisplayType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ImageDisplayType>(orCreateKotlinClass, syntax, imageDisplayType) { // from class: com.sofascore.local_persistance.ImageDisplayType$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.EnumAdapter
            public ImageDisplayType fromValue(int value) {
                return ImageDisplayType.INSTANCE.fromValue(value);
            }
        };
    }

    private ImageDisplayType(String str, int i, int i2) {
        this.value = i2;
    }

    @Nullable
    public static final ImageDisplayType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static ImageDisplayType valueOf(String str) {
        return (ImageDisplayType) Enum.valueOf(ImageDisplayType.class, str);
    }

    public static ImageDisplayType[] values() {
        return (ImageDisplayType[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/sofascore/local_persistance/ImageDisplayType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/sofascore/local_persistance/ImageDisplayType;", "fromValue", U3.i.X, "", "localPersistence_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ImageDisplayType fromValue(int value) {
            if (value == 0) {
                return ImageDisplayType.UNKNOWN;
            }
            if (value == 1) {
                return ImageDisplayType.BANNER;
            }
            if (value != 2) {
                return null;
            }
            return ImageDisplayType.AD_UNIT;
        }

        private Companion() {
        }
    }
}
