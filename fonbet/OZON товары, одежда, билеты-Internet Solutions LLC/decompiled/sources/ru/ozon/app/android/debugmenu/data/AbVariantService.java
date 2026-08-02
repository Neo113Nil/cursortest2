package ru.ozon.app.android.debugmenu.data;

import Sc.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debugmenu.data.DebugToolAction;
import ru.ozon.app.android.storage.debug.DebugToolsService;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/debugmenu/data/AbVariantService;", "", "service", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "<init>", "(Lru/ozon/app/android/storage/debug/DebugToolsService;)V", "updateAbVariant", "", "action", "Lru/ozon/app/android/debugmenu/data/DebugToolAction$ActionName;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "appendAbVariants", "abValue", "clearOrRemoveAbVariant", "abVariants", "append", "", "replaceAbVariant", "newAbVariant", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbVariantService {

    @NotNull
    private final DebugToolsService service;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DebugToolAction.ActionName.values().length];
            try {
                iArr[DebugToolAction.ActionName.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DebugToolAction.ActionName.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DebugToolAction.ActionName.REPLACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbVariantService(@NotNull DebugToolsService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
    }

    private final void appendAbVariants(String abValue) {
        if (abValue == null || h.K(abValue)) {
            return;
        }
        String abVariant = this.service.getAbVariant();
        if (abVariant == null) {
            abVariant = "";
        }
        if (h.K(abVariant)) {
            this.service.setAbVariant(abValue);
        } else {
            updateAbVariant(abVariant, abValue, true);
        }
    }

    private final void clearOrRemoveAbVariant(String abValue) {
        String abVariant = this.service.getAbVariant();
        if (abVariant == null || h.K(abVariant)) {
            return;
        }
        if (abValue == null || h.K(abValue)) {
            this.service.setAbVariant(null);
        } else {
            updateAbVariant(abVariant, abValue, false);
        }
    }

    private final void replaceAbVariant(String newAbVariant) {
        DebugToolsService debugToolsService = this.service;
        if (newAbVariant == null || h.K(newAbVariant)) {
            newAbVariant = null;
        }
        debugToolsService.setAbVariant(newAbVariant);
    }

    public final void updateAbVariant(@NotNull DebugToolAction.ActionName action, String value) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i11 = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i11 == 1) {
            appendAbVariants(value);
        } else if (i11 == 2) {
            clearOrRemoveAbVariant(value);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            replaceAbVariant(value);
        }
    }

    private final void updateAbVariant(String abVariants, String abValue, boolean append) {
        LinkedHashSet X02 = C7714v.X0(h.l(abVariants, new char[]{','}, 0, 6));
        Set Y02 = C7714v.Y0(h.l(abValue, new char[]{','}, 0, 6));
        if (append) {
            X02.addAll(Y02);
        } else {
            X02.removeAll(Y02);
        }
        this.service.setAbVariant(C7714v.V(X02, ",", null, null, null, 62));
    }
}
