package com.vk.ecomm.market.api.labels;

import com.vk.dto.common.Image;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.c210;
import xsna.epx;
import xsna.ms9;
import xsna.urd0;
import xsna.zrp;

/* compiled from: MarketItemModalApproveInfoModel.kt */
/* loaded from: classes18.dex */
public final class MarketItemModalApproveInfoModel {
    public final Image a;
    public final String b;
    public final String c;
    public final String d;
    public final ModalApproveInfoType e;
    public final List<c210> f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MarketItemModalApproveInfoModel.kt */
    public static final class ModalApproveInfoType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModalApproveInfoType[] $VALUES;
        public static final ModalApproveInfoType INTEGRATION_PRICE;
        public static final ModalApproveInfoType LABEL;

        static {
            ModalApproveInfoType modalApproveInfoType = new ModalApproveInfoType("LABEL", 0);
            LABEL = modalApproveInfoType;
            ModalApproveInfoType modalApproveInfoType2 = new ModalApproveInfoType("INTEGRATION_PRICE", 1);
            INTEGRATION_PRICE = modalApproveInfoType2;
            ModalApproveInfoType[] modalApproveInfoTypeArr = {modalApproveInfoType, modalApproveInfoType2};
            $VALUES = modalApproveInfoTypeArr;
            $ENTRIES = new asp(modalApproveInfoTypeArr);
        }

        public ModalApproveInfoType() {
            throw null;
        }

        public static ModalApproveInfoType valueOf(String str) {
            return (ModalApproveInfoType) Enum.valueOf(ModalApproveInfoType.class, str);
        }

        public static ModalApproveInfoType[] values() {
            return (ModalApproveInfoType[]) $VALUES.clone();
        }
    }

    public MarketItemModalApproveInfoModel(Image image, String str, String str2, String str3, ModalApproveInfoType modalApproveInfoType, List<c210> list) {
        this.a = image;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = modalApproveInfoType;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemModalApproveInfoModel)) {
            return false;
        }
        MarketItemModalApproveInfoModel marketItemModalApproveInfoModel = (MarketItemModalApproveInfoModel) obj;
        return epx.f(this.a, marketItemModalApproveInfoModel.a) && epx.f(this.b, marketItemModalApproveInfoModel.b) && epx.f(this.c, marketItemModalApproveInfoModel.c) && epx.f(this.d, marketItemModalApproveInfoModel.d) && this.e == marketItemModalApproveInfoModel.e && epx.f(this.f, marketItemModalApproveInfoModel.f);
    }

    public final int hashCode() {
        Image image = this.a;
        return this.f.hashCode() + ((this.e.hashCode() + urd0.a(urd0.a(urd0.a((image == null ? 0 : image.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemModalApproveInfoModel(image=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", buttonName=");
        sb.append(this.d);
        sb.append(", viewType=");
        sb.append(this.e);
        sb.append(", contentItems=");
        return ms9.a(')', sb, this.f);
    }

    public MarketItemModalApproveInfoModel(Image image, String str, String str2, String str3, ModalApproveInfoType modalApproveInfoType) {
        this(image, str, str2, str3, modalApproveInfoType, EmptyList.b);
    }
}
