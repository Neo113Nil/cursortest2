package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class rsd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ rsd(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                function0.invoke();
                break;
            case 2:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 3:
                File file = (File) function0.invoke();
                if (!d28.h(file).equals("preferences_pb")) {
                    vp2.b(file, " does not match required extension for Preferences file: preferences_pb", "File extension for file: ");
                    break;
                } else {
                    File absoluteFile = file.getAbsoluteFile();
                    absoluteFile.getClass();
                    break;
                }
            case 4:
                float floatValue = ((Number) function0.invoke()).floatValue();
                if (floatValue >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = floatValue;
                }
                break;
            case 5:
                float floatValue2 = ((Number) function0.invoke()).floatValue();
                if (floatValue2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = floatValue2;
                }
                break;
            case 6:
                function0.invoke();
                break;
            case 7:
                function0.invoke();
                break;
            case 8:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 9:
                function0.invoke();
                break;
            case 10:
                function0.invoke();
                break;
            case 11:
                function0.invoke();
                break;
            case 12:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 13:
                function0.invoke();
                break;
            case 14:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            case 15:
                function0.invoke();
                break;
            case 16:
                function0.invoke();
                break;
            case 17:
                function0.invoke();
                break;
            case 18:
                function0.invoke();
                break;
            case 19:
                function0.invoke();
                break;
            case 20:
                function0.invoke();
                break;
            case 21:
                function0.invoke();
                break;
            case 22:
                function0.invoke();
                break;
            case 23:
                function0.invoke();
                break;
            case 24:
                function0.invoke();
                break;
            case 25:
                function0.invoke();
                break;
            case 26:
                function0.invoke();
                break;
            case 27:
                function0.invoke();
                break;
            case 28:
                function0.invoke();
                break;
            default:
                function0.invoke();
                break;
        }
        return Unit.a;
    }
}
