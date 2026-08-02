package com.my.tracker.personalize;

import androidx.annotation.NonNull;
import com.my.tracker.personalize.PersonalizePlacementsRequest;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class PersonalizeRankingRequest extends PersonalizePlacementsRequest {

    public static final class Builder extends PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> {
        public Builder(String str) {
            super(str);
        }

        @Override // com.my.tracker.personalize.PersonalizePlacementsRequest.Builder
        @NonNull
        public PersonalizeRankingRequest build() {
            return new PersonalizeRankingRequest(this.b, this.a, this.d, this.c);
        }
    }

    public PersonalizeRankingRequest(List list, String str, boolean z, Map map) {
        super(list, str, z, map);
    }

    @NonNull
    public static PersonalizePlacementsRequest.Builder<PersonalizeRankingRequest> newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.my.tracker.personalize.PersonalizeRequest
    public String a() {
        return "/ranking";
    }
}
