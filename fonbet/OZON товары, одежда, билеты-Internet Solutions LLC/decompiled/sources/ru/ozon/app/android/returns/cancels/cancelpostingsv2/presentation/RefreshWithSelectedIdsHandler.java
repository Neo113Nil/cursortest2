package ru.ozon.app.android.returns.cancels.cancelpostingsv2.presentation;

import Tl.b;
import i10.h;
import i10.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "<init>", "(Lru/ozon/app/android/composer/ComposerReferences;)V", "handle", "", "action", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "selectedIds", "", "Companion", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RefreshWithSelectedIdsHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final ComposerReferences refs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/returns/cancels/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler$Companion;", "", "<init>", "()V", "ACTION_REFRESH_WITH_SELECTED_IDS", "", "PARAM_SELECTED_IDS", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public RefreshWithSelectedIdsHandler(@NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.refs = refs;
    }

    public final void handle(@NotNull AtomAction.Click action, String selectedIds) {
        if (b.i(action, "action", "refreshWithSelectedIds")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, String> params = action.getParams();
            if (params != null) {
                linkedHashMap.putAll(params);
            }
            if (selectedIds != null) {
                linkedHashMap.put("selectedIds", selectedIds);
            }
            InterfaceC7851b.a.a(this.refs.getController(), null, linkedHashMap, null, new h.b(null, new l.a.b(0L, null, 3), 1), 5);
        }
    }
}
