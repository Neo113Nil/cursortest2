package com.vk.api.users;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VKList;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import org.json.JSONObject;
import xsna.aay;
import xsna.asp;
import xsna.rsg0;
import xsna.zrp;

/* compiled from: UsersSearch.kt */
/* loaded from: classes15.dex */
public final class UsersSearch extends rsg0<VKList<SearchProfile>> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UsersSearch.kt */
    public static final class Entrypoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Entrypoint[] $VALUES;
        public static final Entrypoint GroupMembers;
        public static final Entrypoint InviteCallMembersFromCommunity;
        public static final Entrypoint InviteCallMembersFromFriends;
        public static final Entrypoint InviteToGroup;
        public static final Entrypoint MyFriends;
        public static final Entrypoint OtherPersonFriends;
        public static final Entrypoint UnknownFriendsFragment;
        private final String apiName;

        static {
            Entrypoint entrypoint = new Entrypoint("GroupMembers", 0, "community_members");
            GroupMembers = entrypoint;
            Entrypoint entrypoint2 = new Entrypoint("MyFriends", 1, "friends_search");
            MyFriends = entrypoint2;
            Entrypoint entrypoint3 = new Entrypoint("OtherPersonFriends", 2, "profile_user_friends");
            OtherPersonFriends = entrypoint3;
            Entrypoint entrypoint4 = new Entrypoint("InviteCallMembersFromCommunity", 3, "invite_to_call_from_community");
            InviteCallMembersFromCommunity = entrypoint4;
            Entrypoint entrypoint5 = new Entrypoint("InviteCallMembersFromFriends", 4, "invite_to_call");
            InviteCallMembersFromFriends = entrypoint5;
            Entrypoint entrypoint6 = new Entrypoint("InviteToGroup", 5, "invite_to_community");
            InviteToGroup = entrypoint6;
            Entrypoint entrypoint7 = new Entrypoint("UnknownFriendsFragment", 6, "unknown_friends_fragment");
            UnknownFriendsFragment = entrypoint7;
            Entrypoint[] entrypointArr = {entrypoint, entrypoint2, entrypoint3, entrypoint4, entrypoint5, entrypoint6, entrypoint7};
            $VALUES = entrypointArr;
            $ENTRIES = new asp(entrypointArr);
        }

        public Entrypoint(String str, int i, String str2) {
            this.apiName = str2;
        }

        public static Entrypoint valueOf(String str) {
            return (Entrypoint) Enum.valueOf(Entrypoint.class, str);
        }

        public static Entrypoint[] values() {
            return (Entrypoint[]) $VALUES.clone();
        }

        public final String h() {
            return this.apiName;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONObject optJSONObject = jSONObject.getJSONObject("response").optJSONObject("p_id");
            JSONObject optJSONObject2 = jSONObject.getJSONObject("response").optJSONObject("p_domain");
            VKList vKList = new VKList(jSONObject.getJSONObject("response"), SearchProfile.i0);
            if (optJSONObject != null) {
                vKList.add(0, new SearchProfile(optJSONObject));
                vKList.o(vKList.i() + 1);
            }
            if (optJSONObject2 != null) {
                vKList.add(0, new SearchProfile(optJSONObject2));
                vKList.o(vKList.i() + 1);
            }
            return vKList;
        } catch (Exception e) {
            L.C("vk", e);
            return new VKList();
        }
    }

    /* compiled from: UsersSearch.kt */
    public static final class SearchProfile extends UserProfile {
        public static final Serializer.c<SearchProfile> CREATOR = new b();
        public static final a i0 = new a();
        public final int h0;

        /* compiled from: JsonParser.kt */
        public static final class a extends aay<SearchProfile> {
            @Override // xsna.aay
            public final SearchProfile a(JSONObject jSONObject) {
                return new SearchProfile(jSONObject);
            }
        }

        /* compiled from: Serializer.kt */
        public static final class b extends Serializer.c<SearchProfile> {
            @Override // com.vk.core.serialize.Serializer.c
            public final SearchProfile a(Serializer serializer) {
                return new SearchProfile(serializer);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SearchProfile[i];
            }
        }

        public SearchProfile(JSONObject jSONObject) {
            super(jSONObject);
            this.h0 = jSONObject.optInt("common_count", 0);
        }

        @Override // com.vk.dto.user.UserProfile, com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            super.O7(serializer);
            serializer.S(this.h0);
        }

        public SearchProfile(Serializer serializer) {
            super(serializer);
            this.h0 = serializer.u();
        }
    }
}
