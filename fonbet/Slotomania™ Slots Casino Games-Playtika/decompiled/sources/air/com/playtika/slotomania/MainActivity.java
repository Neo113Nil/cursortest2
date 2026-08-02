package air.com.playtika.slotomania;

import air.com.playtika.android.common.GameActivity;
import android.view.MotionEvent;
import com.capacitor.google.play.games.services.GooglePlayGamesServicesPlugin;
import com.getcapacitor.Plugin;
import io.capawesome.capacitorjs.plugins.agesignals.AgeSignalsPlugin;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public class MainActivity extends GameActivity {
    private native void nativeWheel(float f, float f2, float f3, float f4);

    @Override // android.app.Activity
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 8 && (motionEvent.getSource() & 2) != 0) {
            nativeWheel(motionEvent.getX(), motionEvent.getY(), -motionEvent.getAxisValue(10), -motionEvent.getAxisValue(9));
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // air.com.playtika.android.common.GameActivity
    protected String GetSentryDsn() {
        return "https://21cc249aa60246e6b59c80da6c618afc@o283670.ingest.sentry.io/6041461";
    }

    @Override // air.com.playtika.android.common.GameActivity
    protected String GetSentryMarket() {
        return "googleplay";
    }

    @Override // air.com.playtika.android.common.GameActivity
    protected ArrayList<Class<? extends Plugin>> GetPlugins() {
        ArrayList<Class<? extends Plugin>> GetPlugins = super.GetPlugins();
        GetPlugins.add(GooglePlayGamesServicesPlugin.class);
        GetPlugins.add(AgeSignalsPlugin.class);
        return GetPlugins;
    }
}
