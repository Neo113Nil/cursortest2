package k5;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* loaded from: classes8.dex */
final class l3 implements g3 {

    /* renamed from: a, reason: collision with root package name */
    private DisplayManager f70780a;

    l3(@NonNull Context context) {
        this.f70780a = (DisplayManager) context.getSystemService("display");
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList(1);
        DisplayManager displayManager = this.f70780a;
        if (displayManager != null) {
            for (Display display : displayManager.getDisplays()) {
                int displayId = display.getDisplayId();
                if (displayId != 0 && displayId != -1) {
                    arrayList.add(new x2.d(Integer.valueOf(displayId), display.getName()));
                }
            }
        }
        return arrayList;
    }

    public final boolean b() {
        DisplayManager displayManager = this.f70780a;
        return displayManager != null && displayManager.getDisplays().length > 1;
    }
}
