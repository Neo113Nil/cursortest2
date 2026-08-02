package com.sofascore.results.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.speech.tts.TextToSpeech;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.results.service.NotificationTextToSpeechService;
import defpackage.bf3;
import defpackage.efd;
import defpackage.eq3;
import defpackage.mhd;
import java.lang.ref.SoftReference;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/service/NotificationTextToSpeechService;", "Landroid/app/Service;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationTextToSpeechService extends Service {
    public static final /* synthetic */ int b = 0;
    public SoftReference a;

    public final synchronized void a() {
        TextToSpeech textToSpeech;
        TextToSpeech textToSpeech2;
        try {
            SoftReference softReference = this.a;
            if (softReference != null && (textToSpeech2 = (TextToSpeech) softReference.get()) != null) {
                textToSpeech2.stop();
            }
            SoftReference softReference2 = this.a;
            if (softReference2 != null && (textToSpeech = (TextToSpeech) softReference2.get()) != null) {
                textToSpeech.shutdown();
            }
        } catch (IllegalArgumentException unused) {
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(String str) {
        TextToSpeech textToSpeech;
        TextToSpeech textToSpeech2;
        Bundle f = bf3.f("streamType", CampaignEx.CLICKMODE_ON);
        SoftReference softReference = this.a;
        if (softReference != null && (textToSpeech2 = (TextToSpeech) softReference.get()) != null) {
            textToSpeech2.speak(str, 1, f, "END_OF_TTS");
        }
        SoftReference softReference2 = this.a;
        if (softReference2 == null || (textToSpeech = (TextToSpeech) softReference2.get()) == null) {
            return;
        }
        textToSpeech.setOnUtteranceProgressListener(new mhd(this));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        a();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        Notification b2 = new efd(this, "channel_text_to_speech").b();
        b2.getClass();
        try {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 29) {
                startForeground(3, b2);
            } else if (i3 >= 34) {
                eq3.W(this, b2);
            } else if (i3 >= 29) {
                eq3.U(this, b2);
            } else {
                startForeground(3, b2);
            }
            final String stringExtra = intent != null ? intent.getStringExtra("TALK_STRING") : null;
            if (stringExtra == null || StringsKt.R(stringExtra)) {
                stopSelf();
                return 2;
            }
            a();
            this.a = new SoftReference(new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() { // from class: lhd
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i4) {
                    TextToSpeech textToSpeech;
                    TextToSpeech textToSpeech2;
                    NotificationTextToSpeechService notificationTextToSpeechService = NotificationTextToSpeechService.this;
                    if (i4 == 0) {
                        SoftReference softReference = notificationTextToSpeechService.a;
                        if (softReference != null) {
                            TextToSpeech textToSpeech3 = (TextToSpeech) softReference.get();
                            Integer num = null;
                            Integer valueOf = textToSpeech3 != null ? Integer.valueOf(textToSpeech3.isLanguageAvailable(Locale.getDefault())) : null;
                            String str = stringExtra;
                            if ((valueOf != null && valueOf.intValue() == 0) || ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2))) {
                                notificationTextToSpeechService.b(str);
                                return;
                            }
                            if ((valueOf != null && valueOf.intValue() == -1) || (valueOf != null && valueOf.intValue() == -2)) {
                                SoftReference softReference2 = notificationTextToSpeechService.a;
                                if (softReference2 != null && (textToSpeech2 = (TextToSpeech) softReference2.get()) != null) {
                                    num = Integer.valueOf(textToSpeech2.isLanguageAvailable(Locale.US));
                                }
                                if ((num != null && num.intValue() == 0) || ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2))) {
                                    SoftReference softReference3 = notificationTextToSpeechService.a;
                                    if (softReference3 != null && (textToSpeech = (TextToSpeech) softReference3.get()) != null) {
                                        textToSpeech.setLanguage(Locale.US);
                                    }
                                    notificationTextToSpeechService.b(str);
                                    return;
                                }
                                if ((num != null && num.intValue() == -1) || (num != null && num.intValue() == -2)) {
                                    notificationTextToSpeechService.a();
                                    notificationTextToSpeechService.stopForeground(1);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        int i5 = NotificationTextToSpeechService.b;
                    }
                    notificationTextToSpeechService.a();
                }
            }));
            return super.onStartCommand(intent, i, i2);
        } catch (Exception unused) {
            stopSelf();
            return 2;
        }
    }
}
