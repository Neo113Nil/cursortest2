package io.agora.base;

/* loaded from: classes2.dex */
public interface ColorSpace {

    public enum Matrix {
        RGB(0),
        BT709(1),
        Unspecified(2),
        FCC(4),
        BT470BG(5),
        SMPTE170M(6),
        SMPTE240M(7),
        YCOCG(8),
        BT2020_NCL(9),
        BT2020_CL(10),
        SMPTE2085(11),
        CDNCLS(12),
        CDCLS(13),
        BT2100_ICTCP(14);

        private final int matrix;

        Matrix(int i10) {
            this.matrix = i10;
        }

        public int getMatrix() {
            return this.matrix;
        }
    }

    public enum Primary {
        BT709(1),
        Unspecified(2),
        BT470M(4),
        BT470BG(5),
        kSMPTE170M(6),
        kSMPTE240M(7),
        kFILM(8),
        kBT2020(9),
        kSMPTEST428(10),
        kSMPTEST431(11),
        kSMPTEST432(12),
        kJEDECP22(22);

        private final int primary;

        Primary(int i10) {
            this.primary = i10;
        }

        public int getPrimary() {
            return this.primary;
        }
    }

    public enum Range {
        Invalid(0),
        Limited(1),
        Full(2);

        private final int range;

        Range(int i10) {
            this.range = i10;
        }

        public int getRange() {
            return this.range;
        }
    }

    public enum Transfer {
        BT709(1),
        Unspecified(2),
        GAMMA22(4),
        GAMMA28(5),
        SMPTE170M(6),
        SMPTE240M(7),
        LINEAR(8),
        LOG(9),
        LOG_SQRT(10),
        IEC61966_2_4(11),
        BT1361_ECG(12),
        IEC61966_2_1(13),
        BT2020_10(14),
        BT2020_12(15),
        SMPTEST2084(16),
        SMPTEST428(17),
        ARIB_STD_B67(18);

        private final int transfer;

        Transfer(int i10) {
            this.transfer = i10;
        }

        public int getTransfer() {
            return this.transfer;
        }
    }

    HdrMetadata getHdrMetadata();

    Matrix getMatrix();

    Primary getPrimary();

    Range getRange();

    Transfer getTransfer();
}
