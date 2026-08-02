package com.vk.stat.scheme;

import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.a9y;
import xsna.asp;
import xsna.b9y;
import xsna.dq;
import xsna.epx;
import xsna.fai;
import xsna.ho8;
import xsna.lhg;
import xsna.pmi0;
import xsna.qoy;
import xsna.tay;
import xsna.tru;
import xsna.uay;
import xsna.x9y;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CommonAudioStat.kt */
/* loaded from: classes11.dex */
public final class CommonAudioStat$TypeAudioModal implements SchemeStat$TypeView.b {
    public final transient String a;

    @pmi0("section_id")
    private final FilteredString filteredSectionId;

    @pmi0("has_subscription")
    private final boolean hasSubscription;

    @pmi0("modal_id")
    private final ModalId modalId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommonAudioStat.kt */
    /* loaded from: classes5.dex */
    public static final class ModalId {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModalId[] $VALUES;

        @pmi0("offline_playback_paywall")
        public static final ModalId OFFLINE_PLAYBACK_PAYWALL;

        @pmi0("subscription_expired")
        public static final ModalId SUBSCRIPTION_EXPIRED;

        @pmi0("subscription_expired_downloads")
        public static final ModalId SUBSCRIPTION_EXPIRED_DOWNLOADS;

        @pmi0("subscription_expired_downloads_offline")
        public static final ModalId SUBSCRIPTION_EXPIRED_DOWNLOADS_OFFLINE;

        @pmi0("subscription_expired_offline")
        public static final ModalId SUBSCRIPTION_EXPIRED_OFFLINE;

        static {
            ModalId modalId = new ModalId("SUBSCRIPTION_EXPIRED_DOWNLOADS", 0);
            SUBSCRIPTION_EXPIRED_DOWNLOADS = modalId;
            ModalId modalId2 = new ModalId("SUBSCRIPTION_EXPIRED_DOWNLOADS_OFFLINE", 1);
            SUBSCRIPTION_EXPIRED_DOWNLOADS_OFFLINE = modalId2;
            ModalId modalId3 = new ModalId("SUBSCRIPTION_EXPIRED", 2);
            SUBSCRIPTION_EXPIRED = modalId3;
            ModalId modalId4 = new ModalId("SUBSCRIPTION_EXPIRED_OFFLINE", 3);
            SUBSCRIPTION_EXPIRED_OFFLINE = modalId4;
            ModalId modalId5 = new ModalId("OFFLINE_PLAYBACK_PAYWALL", 4);
            OFFLINE_PLAYBACK_PAYWALL = modalId5;
            ModalId[] modalIdArr = {modalId, modalId2, modalId3, modalId4, modalId5};
            $VALUES = modalIdArr;
            $ENTRIES = new asp(modalIdArr);
        }

        private ModalId(String str, int i) {
        }

        public static ModalId valueOf(String str) {
            return (ModalId) Enum.valueOf(ModalId.class, str);
        }

        public static ModalId[] values() {
            return (ModalId[]) $VALUES.clone();
        }
    }

    /* compiled from: CommonAudioStat.kt */
    public static final class PersistenceSerializer implements uay<CommonAudioStat$TypeAudioModal>, a9y<CommonAudioStat$TypeAudioModal> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            x9y x9yVar = (x9y) b9yVar;
            return new CommonAudioStat$TypeAudioModal((ModalId) dq.f(x9yVar, "modal_id", tru.a(), ModalId.class), fai.m(x9yVar, "has_subscription"), fai.C(x9yVar, "section_id"));
        }

        @Override // xsna.uay
        public final b9y b(Object obj, tay tayVar) {
            CommonAudioStat$TypeAudioModal commonAudioStat$TypeAudioModal = (CommonAudioStat$TypeAudioModal) obj;
            x9y x9yVar = new x9y();
            x9yVar.o("modal_id", tru.a().toJson(commonAudioStat$TypeAudioModal.b()));
            x9yVar.m(Boolean.valueOf(commonAudioStat$TypeAudioModal.a()), "has_subscription");
            x9yVar.o("section_id", commonAudioStat$TypeAudioModal.a);
            return x9yVar;
        }
    }

    public CommonAudioStat$TypeAudioModal(ModalId modalId, boolean z, String str) {
        this.modalId = modalId;
        this.hasSubscription = z;
        this.a = str;
        FilteredString filteredString = new FilteredString(lhg.b(256));
        this.filteredSectionId = filteredString;
        filteredString.a(str);
    }

    public final boolean a() {
        return this.hasSubscription;
    }

    public final ModalId b() {
        return this.modalId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonAudioStat$TypeAudioModal)) {
            return false;
        }
        CommonAudioStat$TypeAudioModal commonAudioStat$TypeAudioModal = (CommonAudioStat$TypeAudioModal) obj;
        return this.modalId == commonAudioStat$TypeAudioModal.modalId && this.hasSubscription == commonAudioStat$TypeAudioModal.hasSubscription && epx.f(this.a, commonAudioStat$TypeAudioModal.a);
    }

    public final int hashCode() {
        int b = qoy.b(this.modalId.hashCode() * 31, 31, this.hasSubscription);
        String str = this.a;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeAudioModal(modalId=");
        sb.append(this.modalId);
        sb.append(", hasSubscription=");
        sb.append(this.hasSubscription);
        sb.append(", sectionId=");
        return ho8.a(sb, this.a, ')');
    }

    public /* synthetic */ CommonAudioStat$TypeAudioModal(ModalId modalId, boolean z, String str, int i, zcl zclVar) {
        this(modalId, z, (i & 4) != 0 ? null : str);
    }
}
