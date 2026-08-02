package com.vk.stat.scheme;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.shy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: MobileOfficialAppsAdsStat.kt */
/* loaded from: classes11.dex */
public final class MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo {
    public final transient String a;
    public final transient String b;

    @pmi0("ecpm")
    private final float ecpm;

    @pmi0("ecpm_definition")
    private final EcpmDefinition ecpmDefinition;

    @pmi0("ad_id")
    private final FilteredString filteredAdId;

    @pmi0("dsp_source")
    private final FilteredString filteredDspSource;

    @pmi0("global_insert_position")
    private final int globalInsertPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MobileOfficialAppsAdsStat.kt */
    /* loaded from: classes5.dex */
    public static final class EcpmDefinition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ EcpmDefinition[] $VALUES;

        @pmi0("estimated")
        public static final EcpmDefinition ESTIMATED;

        @pmi0("exact")
        public static final EcpmDefinition EXACT;

        @pmi0("publisher_defined")
        public static final EcpmDefinition PUBLISHER_DEFINED;

        @pmi0(StringUtils.UNDEFINED)
        public static final EcpmDefinition UNDEFINED;

        static {
            EcpmDefinition ecpmDefinition = new EcpmDefinition("PUBLISHER_DEFINED", 0);
            PUBLISHER_DEFINED = ecpmDefinition;
            EcpmDefinition ecpmDefinition2 = new EcpmDefinition("EXACT", 1);
            EXACT = ecpmDefinition2;
            EcpmDefinition ecpmDefinition3 = new EcpmDefinition("ESTIMATED", 2);
            ESTIMATED = ecpmDefinition3;
            EcpmDefinition ecpmDefinition4 = new EcpmDefinition("UNDEFINED", 3);
            UNDEFINED = ecpmDefinition4;
            EcpmDefinition[] ecpmDefinitionArr = {ecpmDefinition, ecpmDefinition2, ecpmDefinition3, ecpmDefinition4};
            $VALUES = ecpmDefinitionArr;
            $ENTRIES = new asp(ecpmDefinitionArr);
        }

        private EcpmDefinition(String str, int i) {
        }

        public static EcpmDefinition valueOf(String str) {
            return (EcpmDefinition) Enum.valueOf(EcpmDefinition.class, str);
        }

        public static EcpmDefinition[] values() {
            return (EcpmDefinition[]) $VALUES.clone();
        }
    }

    /* compiled from: MobileOfficialAppsAdsStat.kt */
    public static final class PersistenceSerializer implements uay<MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo>, a9y<MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo(fai.n(x9yVar), (EcpmDefinition) dq.f(x9yVar, "ecpm_definition", tru.a(), EcpmDefinition.class), fai.p(x9yVar, "global_insert_position"), fai.C(x9yVar, "ad_id"), fai.C(x9yVar, "dsp_source"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo = (MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo) obj;
            x9y x9yVar = new x9y();
            x9yVar.n("ecpm", Float.valueOf(mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.a()));
            x9yVar.o("ecpm_definition", tru.a().toJson(mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.b()));
            x9yVar.n("global_insert_position", Integer.valueOf(mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.c()));
            x9yVar.o("ad_id", mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.a);
            x9yVar.o("dsp_source", mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.b);
            return x9yVar;
        }
    }

    public MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo(float f, EcpmDefinition ecpmDefinition, int i, String str, String str2) {
        this.ecpm = f;
        this.ecpmDefinition = ecpmDefinition;
        this.globalInsertPosition = i;
        this.a = str;
        this.b = str2;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredAdId = filteredString;
        FilteredString filteredString2 = new FilteredString(lhg.b(128));
        this.filteredDspSource = filteredString2;
        filteredString.a(str);
        filteredString2.a(str2);
    }

    public final float a() {
        return this.ecpm;
    }

    public final EcpmDefinition b() {
        return this.ecpmDefinition;
    }

    public final int c() {
        return this.globalInsertPosition;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo)) {
            return false;
        }
        MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo = (MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo) obj;
        return Float.compare(this.ecpm, mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.ecpm) == 0 && this.ecpmDefinition == mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.ecpmDefinition && this.globalInsertPosition == mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.globalInsertPosition && epx.f(this.a, mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.a) && epx.f(this.b, mobileOfficialAppsAdsStat$TypeFeedSdkAdInfo.b);
    }

    public final int hashCode() {
        int a = shy.a(this.globalInsertPosition, (this.ecpmDefinition.hashCode() + (Float.hashCode(this.ecpm) * 31)) * 31, 31);
        String str = this.a;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeFeedSdkAdInfo(ecpm=");
        sb.append(this.ecpm);
        sb.append(", ecpmDefinition=");
        sb.append(this.ecpmDefinition);
        sb.append(", globalInsertPosition=");
        sb.append(this.globalInsertPosition);
        sb.append(", adId=");
        sb.append(this.a);
        sb.append(", dspSource=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ MobileOfficialAppsAdsStat$TypeFeedSdkAdInfo(float f, EcpmDefinition ecpmDefinition, int i, String str, String str2, int i2, zcl zclVar) {
        this(f, ecpmDefinition, i, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? null : str2);
    }
}
