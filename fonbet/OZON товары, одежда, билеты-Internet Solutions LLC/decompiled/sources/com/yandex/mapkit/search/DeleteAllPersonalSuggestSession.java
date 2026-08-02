package com.yandex.mapkit.search;

import androidx.annotation.NonNull;
import com.yandex.runtime.Error;

/* loaded from: classes9.dex */
public interface DeleteAllPersonalSuggestSession {

    public interface PersonalSuggestListener {
        void onPersonalSuggestError(@NonNull Error error);

        void onPersonalSuggestSuccess();
    }

    void cancel();

    void retry(@NonNull PersonalSuggestListener personalSuggestListener);
}
