package ru.ozon.app.android.common.actionHandlers.shareSellerLink;

import G.g;
import Sc.s;
import Wc.a;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.L0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.common.actionHandlers.shareSellerLink.ShareSellerLinkActionHandler$handleAction$1", f = "ShareSellerLinkActionHandler.kt", l = {51, 52}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ShareSellerLinkActionHandler$handleAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.Click $action;
    final /* synthetic */ String $actionLink;
    final /* synthetic */ String $actionTitle;
    final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
    int label;
    final /* synthetic */ ShareSellerLinkActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.common.actionHandlers.shareSellerLink.ShareSellerLinkActionHandler$handleAction$1$1", f = "ShareSellerLinkActionHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.common.actionHandlers.shareSellerLink.ShareSellerLinkActionHandler$handleAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ String $actionLink;
        final /* synthetic */ String $actionTitle;
        final /* synthetic */ CustomActionHandler.HandlerReferences $handlerRefs;
        final /* synthetic */ String $shortLink;
        int label;
        final /* synthetic */ ShareSellerLinkActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(CustomActionHandler.HandlerReferences handlerReferences, String str, String str2, String str3, ShareSellerLinkActionHandler shareSellerLinkActionHandler, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$handlerRefs = handlerReferences;
            this.$shortLink = str;
            this.$actionLink = str2;
            this.$actionTitle = str3;
            this.this$0 = shareSellerLinkActionHandler;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$handlerRefs, this.$shortLink, this.$actionLink, this.$actionTitle, this.this$0, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            r a11 = this.$handlerRefs.getRefs().getContainer().a();
            if (a11 == null) {
                return Unit.f71690a;
            }
            String str = this.$shortLink;
            if (str == null) {
                str = this.$actionLink;
            }
            String str2 = this.$actionTitle;
            this.this$0.share(a11, str, str2 == null ? str : g.c(str2, "\n", str));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareSellerLinkActionHandler$handleAction$1(ShareSellerLinkActionHandler shareSellerLinkActionHandler, AtomAction.Click click, CustomActionHandler.HandlerReferences handlerReferences, String str, String str2, d<? super ShareSellerLinkActionHandler$handleAction$1> dVar) {
        super(2, dVar);
        this.this$0 = shareSellerLinkActionHandler;
        this.$action = click;
        this.$handlerRefs = handlerReferences;
        this.$actionLink = str;
        this.$actionTitle = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ShareSellerLinkActionHandler$handleAction$1(this.this$0, this.$action, this.$handlerRefs, this.$actionLink, this.$actionTitle, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (xe.C10727i.f(r11, r3, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ShareSellerLinkActionHandler shareSellerLinkActionHandler = this.this$0;
            AtomAction.Click click = this.$action;
            this.label = 1;
            obj = shareSellerLinkActionHandler.requestShortLink(click, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        String str = (String) obj;
        C10720e0 c10720e0 = C10720e0.f105451a;
        L0 l02 = De.s.f6650a;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$handlerRefs, str, this.$actionLink, this.$actionTitle, this.this$0, null);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ShareSellerLinkActionHandler$handleAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
