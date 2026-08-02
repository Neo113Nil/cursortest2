package com.my.tracker.personalize;

import androidx.annotation.NonNull;

/* loaded from: classes14.dex */
public final class PersonalizePlacement {
    public final int groupId;

    @NonNull
    public final String id;

    @NonNull
    public final PersonalizeOffer offer;
    public final int testId;

    public PersonalizePlacement(String str, int i, int i2, PersonalizeOffer personalizeOffer) {
        this.id = str;
        this.groupId = i;
        this.testId = i2;
        this.offer = personalizeOffer;
    }
}
