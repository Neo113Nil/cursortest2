package com.braze.ui.contentcards.managers;

import com.braze.ui.contentcards.listeners.DefaultContentCardsActionListener;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.ironsource.C2608q2;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import com.unity3d.services.core.fid.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: BrazeContentCardsManager.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "", "()V", "value", "Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "contentCardsActionListener", "getContentCardsActionListener", "()Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;", "setContentCardsActionListener", "(Lcom/braze/ui/contentcards/listeners/IContentCardsActionListener;)V", k.M, "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public class BrazeContentCardsManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy<BrazeContentCardsManager> instance$delegate = LazyKt.lazy(new Function0<BrazeContentCardsManager>() { // from class: com.braze.ui.contentcards.managers.BrazeContentCardsManager$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final BrazeContentCardsManager invoke() {
            return new BrazeContentCardsManager();
        }
    });
    private IContentCardsActionListener contentCardsActionListener = new DefaultContentCardsActionListener();

    public static final BrazeContentCardsManager getInstance() {
        return INSTANCE.getInstance();
    }

    public final IContentCardsActionListener getContentCardsActionListener() {
        return this.contentCardsActionListener;
    }

    public final void setContentCardsActionListener(IContentCardsActionListener iContentCardsActionListener) {
        if (iContentCardsActionListener == null) {
            iContentCardsActionListener = new DefaultContentCardsActionListener();
        }
        this.contentCardsActionListener = iContentCardsActionListener;
    }

    /* compiled from: BrazeContentCardsManager.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager$Companion;", "", "()V", C2608q2.p, "Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "getInstance$annotations", Constants.GET_INSTANCE, "()Lcom/braze/ui/contentcards/managers/BrazeContentCardsManager;", "instance$delegate", "Lkotlin/Lazy;", "android-sdk-ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        private Companion() {
        }

        public final BrazeContentCardsManager getInstance() {
            return (BrazeContentCardsManager) BrazeContentCardsManager.instance$delegate.getValue();
        }
    }
}
