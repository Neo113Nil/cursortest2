package com.bytedance.sdk.openadsdk.of;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.ilg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class gpj {
    private static final gpj[] pcc = oo();
    private final sf[] gm;
    private final int oo;
    private final int sf;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class pcc {
        private final int pcc;
        private final int sf;

        public pcc(int i, int i2) {
            this.pcc = i;
            this.sf = i2;
        }

        public int pcc() {
            return this.pcc;
        }

        public int sf() {
            return this.sf;
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class sf {
        private final int pcc;
        private final pcc[] sf;

        public sf(int i, pcc... pccVarArr) {
            this.pcc = i;
            this.sf = pccVarArr;
        }

        public int gm() {
            return sf() * this.pcc;
        }

        public pcc[] oo() {
            return this.sf;
        }

        public int pcc() {
            return this.pcc;
        }

        public int sf() {
            int i = 0;
            for (pcc pccVar : this.sf) {
                i += pccVar.pcc();
            }
            return i;
        }
    }

    private gpj(int i, int[] iArr, sf... sfVarArr) {
        this.sf = i;
        this.gm = sfVarArr;
        int pcc2 = sfVarArr[0].pcc();
        int i2 = 0;
        for (pcc pccVar : sfVarArr[0].oo()) {
            i2 += (pccVar.sf() + pcc2) * pccVar.pcc();
        }
        this.oo = i2;
    }

    private static gpj[] oo() {
        return new gpj[]{new gpj(1, new int[0], new sf(7, new pcc(1, 19)), new sf(10, new pcc(1, 16)), new sf(13, new pcc(1, 13)), new sf(17, new pcc(1, 9))), new gpj(2, new int[]{6, 18}, new sf(10, new pcc(1, 34)), new sf(16, new pcc(1, 28)), new sf(22, new pcc(1, 22)), new sf(28, new pcc(1, 16))), new gpj(3, new int[]{6, 22}, new sf(15, new pcc(1, 55)), new sf(26, new pcc(1, 44)), new sf(18, new pcc(2, 17)), new sf(22, new pcc(2, 13))), new gpj(4, new int[]{6, 26}, new sf(20, new pcc(1, 80)), new sf(18, new pcc(2, 32)), new sf(26, new pcc(2, 24)), new sf(16, new pcc(4, 9))), new gpj(5, new int[]{6, 30}, new sf(26, new pcc(1, 108)), new sf(24, new pcc(2, 43)), new sf(18, new pcc(2, 15), new pcc(2, 16)), new sf(22, new pcc(2, 11), new pcc(2, 12))), new gpj(6, new int[]{6, 34}, new sf(18, new pcc(2, 68)), new sf(16, new pcc(4, 27)), new sf(24, new pcc(4, 19)), new sf(28, new pcc(4, 15))), new gpj(7, new int[]{6, 22, 38}, new sf(20, new pcc(2, 78)), new sf(18, new pcc(4, 31)), new sf(18, new pcc(2, 14), new pcc(4, 15)), new sf(26, new pcc(4, 13), new pcc(1, 14))), new gpj(8, new int[]{6, 24, 42}, new sf(24, new pcc(2, 97)), new sf(22, new pcc(2, 38), new pcc(2, 39)), new sf(22, new pcc(4, 18), new pcc(2, 19)), new sf(26, new pcc(4, 14), new pcc(2, 15))), new gpj(9, new int[]{6, 26, 46}, new sf(30, new pcc(2, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE)), new sf(22, new pcc(3, 36), new pcc(2, 37)), new sf(20, new pcc(4, 16), new pcc(4, 17)), new sf(24, new pcc(4, 12), new pcc(4, 13))), new gpj(10, new int[]{6, 28, 50}, new sf(18, new pcc(2, 68), new pcc(2, 69)), new sf(26, new pcc(4, 43), new pcc(1, 44)), new sf(24, new pcc(6, 19), new pcc(2, 20)), new sf(28, new pcc(6, 15), new pcc(2, 16))), new gpj(11, new int[]{6, 30, 54}, new sf(20, new pcc(4, 81)), new sf(30, new pcc(1, 50), new pcc(4, 51)), new sf(28, new pcc(4, 22), new pcc(4, 23)), new sf(24, new pcc(3, 12), new pcc(8, 13))), new gpj(12, new int[]{6, 32, 58}, new sf(24, new pcc(2, 92), new pcc(2, 93)), new sf(22, new pcc(6, 36), new pcc(2, 37)), new sf(26, new pcc(4, 20), new pcc(6, 21)), new sf(28, new pcc(7, 14), new pcc(4, 15))), new gpj(13, new int[]{6, 34, 62}, new sf(26, new pcc(4, 107)), new sf(22, new pcc(8, 37), new pcc(1, 38)), new sf(24, new pcc(8, 20), new pcc(4, 21)), new sf(22, new pcc(12, 11), new pcc(4, 12))), new gpj(14, new int[]{6, 26, 46, 66}, new sf(30, new pcc(3, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new pcc(1, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE)), new sf(24, new pcc(4, 40), new pcc(5, 41)), new sf(20, new pcc(11, 16), new pcc(5, 17)), new sf(24, new pcc(11, 12), new pcc(5, 13))), new gpj(15, new int[]{6, 26, 48, 70}, new sf(22, new pcc(5, 87), new pcc(1, 88)), new sf(24, new pcc(5, 41), new pcc(5, 42)), new sf(30, new pcc(5, 24), new pcc(7, 25)), new sf(24, new pcc(11, 12), new pcc(7, 13))), new gpj(16, new int[]{6, 26, 50, 74}, new sf(24, new pcc(5, 98), new pcc(1, 99)), new sf(28, new pcc(7, 45), new pcc(3, 46)), new sf(24, new pcc(15, 19), new pcc(2, 20)), new sf(30, new pcc(3, 15), new pcc(13, 16))), new gpj(17, new int[]{6, 30, 54, 78}, new sf(28, new pcc(1, 107), new pcc(5, 108)), new sf(28, new pcc(10, 46), new pcc(1, 47)), new sf(28, new pcc(1, 22), new pcc(15, 23)), new sf(28, new pcc(2, 14), new pcc(17, 15))), new gpj(18, new int[]{6, 30, 56, 82}, new sf(30, new pcc(5, 120), new pcc(1, Sdk.SDKError.Reason.TPAT_ERROR_VALUE)), new sf(26, new pcc(9, 43), new pcc(4, 44)), new sf(28, new pcc(17, 22), new pcc(1, 23)), new sf(28, new pcc(2, 14), new pcc(19, 15))), new gpj(19, new int[]{6, 30, 58, 86}, new sf(28, new pcc(3, 113), new pcc(4, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE)), new sf(26, new pcc(3, 44), new pcc(11, 45)), new sf(26, new pcc(17, 21), new pcc(4, 22)), new sf(26, new pcc(9, 13), new pcc(16, 14))), new gpj(20, new int[]{6, 34, 62, 90}, new sf(28, new pcc(3, 107), new pcc(5, 108)), new sf(26, new pcc(3, 41), new pcc(13, 42)), new sf(30, new pcc(15, 24), new pcc(5, 25)), new sf(28, new pcc(15, 15), new pcc(10, 16))), new gpj(21, new int[]{6, 28, 50, 72, 94}, new sf(28, new pcc(4, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE), new pcc(4, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new sf(26, new pcc(17, 42)), new sf(28, new pcc(17, 22), new pcc(6, 23)), new sf(30, new pcc(19, 16), new pcc(6, 17))), new gpj(22, new int[]{6, 26, 50, 74, 98}, new sf(28, new pcc(2, 111), new pcc(7, 112)), new sf(28, new pcc(17, 46)), new sf(30, new pcc(7, 24), new pcc(16, 25)), new sf(24, new pcc(34, 13))), new gpj(23, new int[]{6, 30, 54, 78, 102}, new sf(30, new pcc(4, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new pcc(5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new sf(28, new pcc(4, 47), new pcc(14, 48)), new sf(30, new pcc(11, 24), new pcc(14, 25)), new sf(30, new pcc(16, 15), new pcc(14, 16))), new gpj(24, new int[]{6, 28, 54, 80, 106}, new sf(30, new pcc(6, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new pcc(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new sf(28, new pcc(6, 45), new pcc(14, 46)), new sf(30, new pcc(11, 24), new pcc(16, 25)), new sf(30, new pcc(30, 16), new pcc(2, 17))), new gpj(25, new int[]{6, 32, 58, 84, 110}, new sf(26, new pcc(8, 106), new pcc(4, 107)), new sf(28, new pcc(8, 47), new pcc(13, 48)), new sf(30, new pcc(7, 24), new pcc(22, 25)), new sf(30, new pcc(22, 15), new pcc(13, 16))), new gpj(26, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, new sf(28, new pcc(10, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE), new pcc(2, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)), new sf(28, new pcc(19, 46), new pcc(4, 47)), new sf(28, new pcc(28, 22), new pcc(6, 23)), new sf(30, new pcc(33, 16), new pcc(4, 17))), new gpj(27, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE}, new sf(30, new pcc(8, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new pcc(4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new sf(28, new pcc(22, 45), new pcc(3, 46)), new sf(30, new pcc(8, 23), new pcc(26, 24)), new sf(30, new pcc(12, 15), new pcc(28, 16))), new gpj(28, new int[]{6, 26, 50, 74, 98, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE}, new sf(30, new pcc(3, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new pcc(10, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new sf(28, new pcc(3, 45), new pcc(23, 46)), new sf(30, new pcc(4, 24), new pcc(31, 25)), new sf(30, new pcc(11, 15), new pcc(31, 16))), new gpj(29, new int[]{6, 30, 54, 78, 102, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE}, new sf(30, new pcc(7, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE), new pcc(7, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE)), new sf(28, new pcc(21, 45), new pcc(7, 46)), new sf(30, new pcc(1, 23), new pcc(37, 24)), new sf(30, new pcc(19, 15), new pcc(26, 16))), new gpj(30, new int[]{6, 26, 52, 78, 104, 130}, new sf(30, new pcc(5, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new pcc(10, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE)), new sf(28, new pcc(19, 47), new pcc(10, 48)), new sf(30, new pcc(15, 24), new pcc(25, 25)), new sf(30, new pcc(23, 15), new pcc(25, 16))), new gpj(31, new int[]{6, 30, 56, 82, 108, 134}, new sf(30, new pcc(13, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new pcc(3, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE)), new sf(28, new pcc(2, 46), new pcc(29, 47)), new sf(30, new pcc(42, 24), new pcc(1, 25)), new sf(30, new pcc(23, 15), new pcc(28, 16))), new gpj(32, new int[]{6, 34, 60, 86, 112, 138}, new sf(30, new pcc(17, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE)), new sf(28, new pcc(10, 46), new pcc(23, 47)), new sf(30, new pcc(10, 24), new pcc(35, 25)), new sf(30, new pcc(19, 15), new pcc(35, 16))), new gpj(33, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142}, new sf(30, new pcc(17, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new pcc(1, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE)), new sf(28, new pcc(14, 46), new pcc(21, 47)), new sf(30, new pcc(29, 24), new pcc(19, 25)), new sf(30, new pcc(11, 15), new pcc(46, 16))), new gpj(34, new int[]{6, 34, 62, 90, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, 146}, new sf(30, new pcc(13, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE), new pcc(6, Sdk.SDKError.Reason.GZIP_ENCODE_ERROR_VALUE)), new sf(28, new pcc(14, 46), new pcc(23, 47)), new sf(30, new pcc(44, 24), new pcc(7, 25)), new sf(30, new pcc(59, 16), new pcc(1, 17))), new gpj(35, new int[]{6, 30, 54, 78, 102, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 150}, new sf(30, new pcc(12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new pcc(7, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new sf(28, new pcc(12, 47), new pcc(26, 48)), new sf(30, new pcc(39, 24), new pcc(14, 25)), new sf(30, new pcc(22, 15), new pcc(41, 16))), new gpj(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new sf(30, new pcc(6, Sdk.SDKError.Reason.TPAT_ERROR_VALUE), new pcc(14, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)), new sf(28, new pcc(6, 47), new pcc(34, 48)), new sf(30, new pcc(46, 24), new pcc(10, 25)), new sf(30, new pcc(2, 15), new pcc(64, 16))), new gpj(37, new int[]{6, 28, 54, 80, 106, Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 158}, new sf(30, new pcc(17, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new pcc(4, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new sf(28, new pcc(29, 46), new pcc(14, 47)), new sf(30, new pcc(49, 24), new pcc(10, 25)), new sf(30, new pcc(24, 15), new pcc(46, 16))), new gpj(38, new int[]{6, 32, 58, 84, 110, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, 162}, new sf(30, new pcc(4, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), new pcc(18, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE)), new sf(28, new pcc(13, 46), new pcc(32, 47)), new sf(30, new pcc(48, 24), new pcc(14, 25)), new sf(30, new pcc(42, 15), new pcc(32, 16))), new gpj(39, new int[]{6, 26, 54, 82, 110, 138, 166}, new sf(30, new pcc(20, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE), new pcc(4, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE)), new sf(28, new pcc(40, 47), new pcc(7, 48)), new sf(30, new pcc(43, 24), new pcc(22, 25)), new sf(30, new pcc(10, 15), new pcc(67, 16))), new gpj(40, new int[]{6, 30, 58, 86, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE, 142, 170}, new sf(30, new pcc(19, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE), new pcc(6, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE)), new sf(28, new pcc(18, 47), new pcc(31, 48)), new sf(30, new pcc(34, 24), new pcc(34, 25)), new sf(30, new pcc(20, 15), new pcc(61, 16)))};
    }

    public static gpj pcc(int i) {
        if (i > 0 && i <= 40) {
            return pcc[i - 1];
        }
        ilg.c();
        return null;
    }

    public int gm() {
        return (this.sf * 4) + 17;
    }

    public int sf() {
        return this.oo;
    }

    public sf pcc(kj kjVar) {
        return this.gm[kjVar.ordinal()];
    }

    public int pcc() {
        return this.sf;
    }
}
