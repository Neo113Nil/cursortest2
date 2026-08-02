package defpackage;

import android.speech.tts.UtteranceProgressListener;
import com.sofascore.results.service.NotificationTextToSpeechService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mhd extends UtteranceProgressListener {
    public final /* synthetic */ NotificationTextToSpeechService a;

    public mhd(NotificationTextToSpeechService notificationTextToSpeechService) {
        this.a = notificationTextToSpeechService;
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        str.getClass();
        if (str.equals("END_OF_TTS")) {
            int i = NotificationTextToSpeechService.b;
            NotificationTextToSpeechService notificationTextToSpeechService = this.a;
            notificationTextToSpeechService.a();
            notificationTextToSpeechService.stopForeground(1);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
        str.getClass();
        if (str.equals("END_OF_TTS")) {
            int i = NotificationTextToSpeechService.b;
            NotificationTextToSpeechService notificationTextToSpeechService = this.a;
            notificationTextToSpeechService.a();
            notificationTextToSpeechService.stopForeground(1);
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
        str.getClass();
    }
}
