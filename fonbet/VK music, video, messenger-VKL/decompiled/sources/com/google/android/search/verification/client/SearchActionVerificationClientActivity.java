package com.google.android.search.verification.client;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vkontakte.android.AssistantVerificationService;

/* loaded from: classes13.dex */
public abstract class SearchActionVerificationClientActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, (Class<?>) AssistantVerificationService.class);
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        startForegroundService(intent);
        finish();
    }
}
