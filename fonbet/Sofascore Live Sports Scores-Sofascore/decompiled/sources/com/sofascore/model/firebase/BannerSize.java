package com.sofascore.model.firebase;

import defpackage.gz8;
import defpackage.jp5;
import defpackage.q5h;
import defpackage.r5h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h(with = BannerSizeSerializer.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/sofascore/model/firebase/BannerSize;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "ANCHORED_ADAPTIVE", "INLINE_ADAPTIVE", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BannerSize {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ BannerSize[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @q5h("standard")
    public static final BannerSize STANDARD = new BannerSize("STANDARD", 0);

    @q5h("anchored")
    public static final BannerSize ANCHORED_ADAPTIVE = new BannerSize("ANCHORED_ADAPTIVE", 1);

    @q5h("inline")
    public static final BannerSize INLINE_ADAPTIVE = new BannerSize("INLINE_ADAPTIVE", 2);

    private static final /* synthetic */ BannerSize[] $values() {
        return new BannerSize[]{STANDARD, ANCHORED_ADAPTIVE, INLINE_ADAPTIVE};
    }

    static {
        BannerSize[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private BannerSize(String str, int i) {
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static BannerSize valueOf(String str) {
        return (BannerSize) Enum.valueOf(BannerSize.class, str);
    }

    public static BannerSize[] values() {
        return (BannerSize[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/sofascore/model/firebase/BannerSize$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/BannerSize;", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return BannerSizeSerializer.INSTANCE;
        }

        private Companion() {
        }
    }
}
