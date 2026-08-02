package com.vk.dto.group.creation_onboarding;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingModal;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.j5g;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: GroupCreationOnboarding.kt */
/* loaded from: classes18.dex */
public final class GroupCreationOnboarding extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupCreationOnboarding> CREATOR = new b();
    public final OnboardingType b;
    public final String c;
    public final boolean d;
    public final GroupCreationOnboardingBlock e;
    public final GroupCreationOnboardingTooltip f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GroupCreationOnboarding.kt */
    public static final class OnboardingType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OnboardingType[] $VALUES;
        public static final OnboardingType BUSINESS;
        public static final OnboardingType CONTENT;
        public static final OnboardingType UNKNOWN;
        private final int type;

        static {
            OnboardingType onboardingType = new OnboardingType(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, 0);
            UNKNOWN = onboardingType;
            OnboardingType onboardingType2 = new OnboardingType("CONTENT", 1, 1);
            CONTENT = onboardingType2;
            OnboardingType onboardingType3 = new OnboardingType("BUSINESS", 2, 2);
            BUSINESS = onboardingType3;
            OnboardingType[] onboardingTypeArr = {onboardingType, onboardingType2, onboardingType3};
            $VALUES = onboardingTypeArr;
            $ENTRIES = new asp(onboardingTypeArr);
        }

        public OnboardingType(String str, int i, int i2) {
            this.type = i2;
        }

        public static zrp<OnboardingType> h() {
            return $ENTRIES;
        }

        public static OnboardingType valueOf(String str) {
            return (OnboardingType) Enum.valueOf(OnboardingType.class, str);
        }

        public static OnboardingType[] values() {
            return (OnboardingType[]) $VALUES.clone();
        }

        public final int i() {
            return this.type;
        }
    }

    /* compiled from: GroupCreationOnboarding.kt */
    public static final class a {
        public static GroupCreationOnboarding a(JSONObject jSONObject) {
            Object obj;
            GroupCreationOnboardingTooltip groupCreationOnboardingTooltip;
            Object obj2;
            int optInt = jSONObject.optInt("type", -1);
            String optString = jSONObject.optString("active_screen");
            JSONObject optJSONObject = jSONObject.optJSONObject(optString);
            if (optJSONObject == null) {
                return null;
            }
            String optString2 = optJSONObject.optString("title");
            String optString3 = optJSONObject.optString("subtitle");
            String optString4 = optJSONObject.optString("image");
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("value");
            GroupCreationOnboardingBlock.Progress progress = optJSONObject2 == null ? null : new GroupCreationOnboardingBlock.Progress(optJSONObject2.optInt("max_count"), optJSONObject2.optInt("current_value"));
            JSONObject optJSONObject3 = optJSONObject.optJSONObject("button");
            String optString5 = optJSONObject3 != null ? optJSONObject3.optString("title") : null;
            Serializer.c<GroupCreationOnboardingModal> cVar = GroupCreationOnboardingModal.CREATOR;
            GroupCreationOnboardingModal a = GroupCreationOnboardingModal.a.a(optJSONObject.optJSONObject("modal"));
            GroupCreationOnboardingModal a2 = GroupCreationOnboardingModal.a.a(optJSONObject.optJSONObject("additional_modal"));
            List a3 = GroupCreationOnboardingBlock.a.a(optJSONObject.optJSONArray(SignalingProtocol.KEY_OPTIONS));
            List a4 = GroupCreationOnboardingBlock.a.a(optJSONObject.optJSONArray("conditions"));
            GroupCreationOnboardingBlock.Step.Companion.getClass();
            Iterator<E> it = GroupCreationOnboardingBlock.Step.h().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((GroupCreationOnboardingBlock.Step) obj).i(), optString)) {
                    break;
                }
            }
            GroupCreationOnboardingBlock.Step step = (GroupCreationOnboardingBlock.Step) obj;
            if (step == null) {
                step = GroupCreationOnboardingBlock.Step.UNKNOWN;
            }
            GroupCreationOnboardingBlock groupCreationOnboardingBlock = new GroupCreationOnboardingBlock(step, optString2, optString3, optString4, progress, j5g.u0(a4, a3), optString5, a, a2);
            boolean optBoolean = jSONObject.optBoolean("is_skippable");
            Serializer.c<GroupCreationOnboardingTooltip> cVar2 = GroupCreationOnboardingTooltip.CREATOR;
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("tooltip");
            if (optJSONObject4 != null) {
                GroupCreationOnboardingTooltip.Type.a aVar = GroupCreationOnboardingTooltip.Type.Companion;
                String optString6 = optJSONObject4.optString("type");
                aVar.getClass();
                groupCreationOnboardingTooltip = new GroupCreationOnboardingTooltip(GroupCreationOnboardingTooltip.Type.a.a(optString6), optJSONObject4.optString("text"));
            } else {
                groupCreationOnboardingTooltip = null;
            }
            Iterator<E> it2 = OnboardingType.h().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                Object next = it2.next();
                if (((OnboardingType) next).i() == optInt) {
                    obj2 = next;
                    break;
                }
            }
            OnboardingType onboardingType = (OnboardingType) obj2;
            if (onboardingType == null) {
                onboardingType = OnboardingType.UNKNOWN;
            }
            return new GroupCreationOnboarding(onboardingType, optString, optBoolean, groupCreationOnboardingBlock, groupCreationOnboardingTooltip);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupCreationOnboarding> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupCreationOnboarding a(Serializer serializer) {
            return new GroupCreationOnboarding(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCreationOnboarding[i];
        }
    }

    public GroupCreationOnboarding(OnboardingType onboardingType, String str, boolean z, GroupCreationOnboardingBlock groupCreationOnboardingBlock, GroupCreationOnboardingTooltip groupCreationOnboardingTooltip) {
        this.b = onboardingType;
        this.c = str;
        this.d = z;
        this.e = groupCreationOnboardingBlock;
        this.f = groupCreationOnboardingTooltip;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b.i());
        serializer.j0(this.c);
        serializer.L(this.d ? (byte) 1 : (byte) 0);
        serializer.e0(this.e);
        serializer.e0(this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupCreationOnboarding)) {
            return false;
        }
        GroupCreationOnboarding groupCreationOnboarding = (GroupCreationOnboarding) obj;
        return this.b == groupCreationOnboarding.b && epx.f(this.c, groupCreationOnboarding.c) && this.d == groupCreationOnboarding.d && epx.f(this.e, groupCreationOnboarding.e) && epx.f(this.f, groupCreationOnboarding.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + qoy.b(urd0.a(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31;
        GroupCreationOnboardingTooltip groupCreationOnboardingTooltip = this.f;
        return hashCode + (groupCreationOnboardingTooltip == null ? 0 : groupCreationOnboardingTooltip.hashCode());
    }

    public final String toString() {
        return "GroupCreationOnboarding(type=" + this.b + ", activeScreen=" + this.c + ", isSkippable=" + this.d + ", block=" + this.e + ", tooltip=" + this.f + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GroupCreationOnboarding(Serializer serializer) {
        this(r3, r0 == null ? "" : r0, serializer.m(), (GroupCreationOnboardingBlock) serializer.A(GroupCreationOnboardingBlock.class.getClassLoader()), (GroupCreationOnboardingTooltip) serializer.A(GroupCreationOnboardingTooltip.class.getClassLoader()));
        String H = serializer.H();
        OnboardingType valueOf = OnboardingType.valueOf(H == null ? "" : H);
        String H2 = serializer.H();
    }
}
