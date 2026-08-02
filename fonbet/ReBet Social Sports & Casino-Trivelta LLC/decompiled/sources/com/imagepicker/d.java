package com.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import io.agora.rtc2.internal.RtcEngineEvent;
import j.f;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executors;
import k.f;

/* loaded from: classes3.dex */
public class d implements ActivityEventListener {

    /* renamed from: a, reason: collision with root package name */
    public Uri f39016a;

    /* renamed from: b, reason: collision with root package name */
    public ReactApplicationContext f39017b;

    /* renamed from: c, reason: collision with root package name */
    public Callback f39018c;

    /* renamed from: d, reason: collision with root package name */
    public j f39019d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f39020e;

    public d(ReactApplicationContext reactApplicationContext) {
        this.f39017b = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(this);
    }

    public final /* synthetic */ void b(List list) {
        try {
            this.f39018c.invoke(l.w(list, this.f39019d, this.f39017b));
        } catch (RuntimeException e10) {
            this.f39018c.invoke(l.j(l.f39040d, e10.getMessage()));
        } finally {
            this.f39018c = null;
        }
    }

    public void c(ReadableMap readableMap, Callback callback) {
        Intent intent;
        File c10;
        int i10;
        if (!l.z(this.f39017b)) {
            callback.invoke(l.j(l.f39038b, null));
            return;
        }
        Activity currentActivity = this.f39017b.getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(l.j(l.f39040d, "Activity error"));
            return;
        }
        if (!l.A(this.f39017b, currentActivity)) {
            callback.invoke(l.j(l.f39040d, l.f39043g));
            return;
        }
        this.f39018c = callback;
        j jVar = new j(readableMap);
        this.f39019d = jVar;
        if (jVar.f39033j.booleanValue() && Build.VERSION.SDK_INT <= 28 && !l.y(currentActivity)) {
            callback.invoke(l.j(l.f39039c, null));
            return;
        }
        if (this.f39019d.f39036m.equals(l.f39042f)) {
            intent = new Intent("android.media.action.VIDEO_CAPTURE");
            intent.putExtra("android.intent.extra.videoQuality", this.f39019d.f39027d);
            int i11 = this.f39019d.f39034k;
            if (i11 > 0) {
                intent.putExtra("android.intent.extra.durationLimit", i11);
            }
            c10 = l.c(this.f39017b, "mp4");
            this.f39020e = l.d(c10, this.f39017b);
            i10 = 13002;
        } else {
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            c10 = l.c(this.f39017b, "jpg");
            this.f39020e = l.d(c10, this.f39017b);
            i10 = RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS;
        }
        if (this.f39019d.f39035l.booleanValue()) {
            l.I(intent);
        }
        this.f39016a = Uri.fromFile(c10);
        intent.putExtra("output", this.f39020e);
        intent.addFlags(3);
        try {
            currentActivity.startActivityForResult(intent, i10);
        } catch (ActivityNotFoundException e10) {
            callback.invoke(l.j(l.f39040d, e10.getMessage()));
            this.f39018c = null;
        }
    }

    public void d(ReadableMap readableMap, Callback callback) {
        Intent createIntent;
        Activity currentActivity = this.f39017b.getCurrentActivity();
        if (currentActivity == null) {
            callback.invoke(l.j(l.f39040d, "Activity error"));
            return;
        }
        this.f39018c = callback;
        j jVar = new j(readableMap);
        this.f39019d = jVar;
        int i10 = jVar.f39024a;
        boolean z10 = i10 == 1;
        j.f a10 = new f.a().e(jVar.f39036m.equals(l.f39041e) ? f.d.f54002a : this.f39019d.f39036m.equals(l.f39042f) ? f.e.f54003a : f.c.f54001a).a();
        if (z10) {
            createIntent = new k.f().createIntent(this.f39017b.getApplicationContext(), a10);
        } else {
            createIntent = (i10 > 1 ? new k.d(i10) : new k.d()).createIntent(this.f39017b.getApplicationContext(), a10);
        }
        String[] strArr = this.f39019d.restrictMimeTypes;
        if (strArr.length > 0) {
            createIntent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        try {
            currentActivity.startActivityForResult(createIntent, 13003);
        } catch (ActivityNotFoundException e10) {
            callback.invoke(l.j(l.f39040d, e10.getMessage()));
            this.f39018c = null;
        }
    }

    public void e(final List list) {
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: com.imagepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                d.this.b(list);
            }
        });
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i10, int i11, Intent intent) {
        if (!l.D(i10) || this.f39018c == null) {
            return;
        }
        if (i11 != -1) {
            if (i10 == 13001) {
                l.e(this.f39016a);
            }
            try {
                this.f39018c.invoke(l.i());
                return;
            } catch (RuntimeException e10) {
                this.f39018c.invoke(l.j(l.f39040d, e10.getMessage()));
            } finally {
                this.f39018c = null;
            }
        }
        switch (i10) {
            case RtcEngineEvent.EvtType.EVT_OPEN_CHANNEL_SUCCESS /* 13001 */:
                if (this.f39019d.f39033j.booleanValue()) {
                    l.H(this.f39020e, this.f39017b, "photo");
                }
                e(Collections.singletonList(this.f39016a));
                return;
            case 13002:
                if (this.f39019d.f39033j.booleanValue()) {
                    l.H(this.f39020e, this.f39017b, "video");
                }
                e(Collections.singletonList(this.f39016a));
                return;
            case 13003:
                e(l.a(intent));
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }
}
