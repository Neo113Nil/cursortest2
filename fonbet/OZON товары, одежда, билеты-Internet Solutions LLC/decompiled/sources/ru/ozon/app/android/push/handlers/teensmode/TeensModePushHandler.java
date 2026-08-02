package ru.ozon.app.android.push.handlers.teensmode;

import Sc.InterfaceC4008j;
import Sc.k;
import android.app.Application;
import eh0.c;
import eh0.d;
import fh0.AbstractC6566a;
import fh0.C6568c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.teensMode.TeensModeStorage;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/push/handlers/teensmode/TeensModePushHandler;", "Leh0/d;", "Landroid/app/Application;", "application", "<init>", "(Landroid/app/Application;)V", "Lfh0/c;", "pushModel", "", "shouldHandle", "(Lfh0/c;)Z", "Leh0/c;", "handle", "(Lfh0/c;)Leh0/c;", "Landroid/app/Application;", "Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage$delegate", "LSc/j;", "getTeensModeStorage", "()Lru/ozon/app/android/storage/teensMode/TeensModeStorage;", "teensModeStorage", "push_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TeensModePushHandler implements d {

    @NotNull
    private final Application application;

    /* renamed from: teensModeStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j teensModeStorage;

    public TeensModePushHandler(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.application = application;
        this.teensModeStorage = k.b(new TeensModePushHandler$teensModeStorage$2(this));
    }

    private final TeensModeStorage getTeensModeStorage() {
        return (TeensModeStorage) this.teensModeStorage.getValue();
    }

    @Override // eh0.d
    @NotNull
    public c handle(@NotNull C6568c pushModel) {
        boolean z11;
        Object obj;
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        c.b bVar = new c.b(pushModel);
        String str = pushModel.p().b().get("teens_mode");
        if (str != null) {
            Iterator<E> it = TeensMode.getEntries().iterator();
            while (true) {
                z11 = true;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (h.D(((TeensMode) obj).getValue(), str, true)) {
                    break;
                }
            }
            TeensMode teensMode = (TeensMode) obj;
            if (teensMode != null) {
                boolean isTeensModeEnabled = getTeensModeStorage().isTeensModeEnabled();
                if ((!isTeensModeEnabled || teensMode == TeensMode.TEENS_MODE_ADULT_ONLY) && (isTeensModeEnabled || teensMode == TeensMode.TEENS_MODE_KIDS_ONLY)) {
                    z11 = false;
                }
                AbstractC6566a abstractC6566a = z11 ? AbstractC6566a.c.f63438b : AbstractC6566a.b.f63437b;
                C6568c.a aVar = new C6568c.a(pushModel);
                aVar.c(abstractC6566a);
                C6568c a11 = aVar.a();
                return z11 ? new c.b(a11) : new c.a(a11);
            }
        }
        return bVar;
    }

    @Override // eh0.d
    public boolean shouldHandle(@NotNull C6568c pushModel) {
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        return pushModel.p().b().containsKey("teens_mode");
    }
}
