package com.my.tracker.personalize;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes14.dex */
public final class PersonalizeOffer {
    public final int id;

    @NonNull
    public final List<PersonalizeItem> items;

    public PersonalizeOffer(int i, ArrayList arrayList) {
        this.id = i;
        this.items = arrayList;
    }
}
