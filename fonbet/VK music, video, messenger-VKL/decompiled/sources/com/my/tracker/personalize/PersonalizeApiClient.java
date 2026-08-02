package com.my.tracker.personalize;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.m;
import com.my.tracker.obfuscated.s0;
import com.my.tracker.obfuscated.x2;
import com.my.tracker.obfuscated.y2;
import com.my.tracker.personalize.PersonalizeApiClient;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import xsna.m5k;
import xsna.tdj;
import xsna.xi80;

/* loaded from: classes14.dex */
public final class PersonalizeApiClient {
    private final a a;

    public static final class Builder {
        private List a;
        private Context b;

        @Nullable
        public PersonalizeApiClient build() {
            y2 y2Var = MyTracker.a.a;
            String g = y2Var.g();
            if (TextUtils.isEmpty(g)) {
                x2.a("Builder: MyTracker hasn't been initialized. Initialize it before using Personalize API");
                return null;
            }
            Context context = this.b;
            String instanceId = context != null ? MyTracker.getInstanceId(context) : null;
            List list = this.a;
            return new PersonalizeApiClient(new a(g, (list == null || instanceId == null || !list.contains(instanceId)) ? y2Var.l() : y2Var.k()));
        }

        @NonNull
        public Builder withTestDevices(@Nullable Context context, @Nullable List<String> list) {
            this.a = list;
            this.b = context;
            return this;
        }
    }

    public interface OnCompleteListener<T> {
        void onRequestComplete(@NonNull PersonalizeApiClient personalizeApiClient, @NonNull PersonalizeRequest<T> personalizeRequest, @NonNull PersonalizeResponse<T> personalizeResponse);
    }

    public PersonalizeApiClient(a aVar) {
        this.a = aVar;
    }

    @NonNull
    public static Builder newBuilder() {
        return new Builder();
    }

    public <T> void sendRequest(@NonNull final PersonalizeRequest<T> personalizeRequest, @Nullable final Handler handler, @NonNull final OnCompleteListener<T> onCompleteListener) {
        final String a = a(personalizeRequest, this.a);
        m.b(new Runnable() { // from class: xsna.x1a0
            @Override // java.lang.Runnable
            public final void run() {
                PersonalizeApiClient.this.a(a, personalizeRequest, handler, onCompleteListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, PersonalizeRequest personalizeRequest, Handler handler, OnCompleteListener onCompleteListener) {
        a(personalizeRequest, s0.a((MyTrackerConfig.OkHttpClientProvider) null).a(str), handler, onCompleteListener);
    }

    private void a(final PersonalizeRequest personalizeRequest, Object obj, String str, Handler handler, final String str2, final OnCompleteListener onCompleteListener) {
        if (handler == null) {
            handler = m.a;
        }
        if (!TextUtils.isEmpty(str2)) {
            x2.b("PersonalizeApiClient: " + str2);
            handler.post(new Runnable() { // from class: xsna.y1a0
                @Override // java.lang.Runnable
                public final void run() {
                    PersonalizeApiClient.this.a(onCompleteListener, personalizeRequest, str2);
                }
            });
            return;
        }
        handler.post(new xi80(this, onCompleteListener, personalizeRequest, new PersonalizeResponse(obj, null, str), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, String str) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, new PersonalizeResponse(null, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(OnCompleteListener onCompleteListener, PersonalizeRequest personalizeRequest, PersonalizeResponse personalizeResponse) {
        onCompleteListener.onRequestComplete(this, personalizeRequest, personalizeResponse);
    }

    private void a(PersonalizeRequest personalizeRequest, s0.b bVar, Handler handler, OnCompleteListener onCompleteListener) {
        if (bVar == null) {
            x2.a("PersonalizeApiClient: MyTracker hasn't been initialized yet");
            a(personalizeRequest, null, null, handler, "MyTracker hasn't been initialized yet", onCompleteListener);
            return;
        }
        String str = (String) bVar.b();
        if (TextUtils.isEmpty(str)) {
            x2.a("PersonalizeApiClient: HTTP response is empty");
            a(personalizeRequest, null, null, handler, "HTTP response is empty", onCompleteListener);
            return;
        }
        try {
            c a = personalizeRequest.c().a(new JSONObject(str));
            String a2 = a.a();
            if (a2 != null) {
                a(personalizeRequest, null, null, handler, a2, onCompleteListener);
            } else {
                a(personalizeRequest, a.b(), str, handler, null, onCompleteListener);
            }
        } catch (Throwable th) {
            String b = m5k.b(th, new StringBuilder("Can't parse JSON with error: "));
            x2.a("PersonalizeApiClient: " + b);
            a(personalizeRequest, null, null, handler, b, onCompleteListener);
        }
    }

    private String a(PersonalizeRequest personalizeRequest, a aVar) {
        String a = tdj.a(new StringBuilder(), aVar.b, "/api/v1/recommendation", personalizeRequest.a());
        Map b = personalizeRequest.b();
        b.remove("sdk_key");
        if (b.isEmpty()) {
            return a;
        }
        Uri.Builder buildUpon = Uri.parse(a).buildUpon();
        for (Map.Entry entry : b.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                buildUpon.appendQueryParameter(str, (String) it.next());
            }
        }
        buildUpon.appendQueryParameter("sdk_key", aVar.a);
        return buildUpon.toString();
    }
}
