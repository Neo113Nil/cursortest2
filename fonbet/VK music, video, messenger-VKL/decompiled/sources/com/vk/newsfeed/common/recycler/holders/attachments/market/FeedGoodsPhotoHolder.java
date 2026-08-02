package com.vk.newsfeed.common.recycler.holders.attachments.market;

import com.vk.dto.tags.Tag;
import io.reactivex.rxjava3.internal.operators.mixed.k;
import xsna.asp;
import xsna.zrp;

/* compiled from: FeedGoodsPhotoHolder.kt */
/* loaded from: classes4.dex */
public interface FeedGoodsPhotoHolder {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FeedGoodsPhotoHolder.kt */
    public static final class GoodsVisibilityState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ GoodsVisibilityState[] $VALUES;
        public static final GoodsVisibilityState CLEARED;
        public static final GoodsVisibilityState NOT_DRAWN;
        public static final GoodsVisibilityState VISIBLE;

        static {
            GoodsVisibilityState goodsVisibilityState = new GoodsVisibilityState("NOT_DRAWN", 0);
            NOT_DRAWN = goodsVisibilityState;
            GoodsVisibilityState goodsVisibilityState2 = new GoodsVisibilityState("VISIBLE", 1);
            VISIBLE = goodsVisibilityState2;
            GoodsVisibilityState goodsVisibilityState3 = new GoodsVisibilityState("CLEARED", 2);
            CLEARED = goodsVisibilityState3;
            GoodsVisibilityState[] goodsVisibilityStateArr = {goodsVisibilityState, goodsVisibilityState2, goodsVisibilityState3};
            $VALUES = goodsVisibilityStateArr;
            $ENTRIES = new asp(goodsVisibilityStateArr);
        }

        public GoodsVisibilityState() {
            throw null;
        }

        public static GoodsVisibilityState valueOf(String str) {
            return (GoodsVisibilityState) Enum.valueOf(GoodsVisibilityState.class, str);
        }

        public static GoodsVisibilityState[] values() {
            return (GoodsVisibilityState[]) $VALUES.clone();
        }
    }

    /* compiled from: FeedGoodsPhotoHolder.kt */
    public interface a {
        void a4(String str);

        int m2();

        void x1(Tag tag, String str);
    }

    /* compiled from: FeedGoodsPhotoHolder.kt */
    public interface b {
        GoodsVisibilityState getState();
    }

    default b G5() {
        return new k(14);
    }

    void n1();

    default void V1() {
    }

    default void z5() {
    }

    default void c3(GoodsVisibilityState goodsVisibilityState) {
    }

    default void u5(a aVar) {
    }
}
