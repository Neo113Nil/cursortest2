package bo.app;

import Ph.AbstractC1455i;
import Ph.C1452g0;
import Ph.M0;
import Ph.P;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.widget.ImageView;
import com.braze.R$string;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r4 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Bitmap f25967a;

    /* renamed from: b, reason: collision with root package name */
    public int f25968b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f25969c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f25970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f25971e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BrazeViewBounds f25972f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ImageView f25973g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(DefaultBrazeImageLoader defaultBrazeImageLoader, Context context, String str, BrazeViewBounds brazeViewBounds, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.f25969c = defaultBrazeImageLoader;
        this.f25970d = context;
        this.f25971e = str;
        this.f25972f = brazeViewBounds;
        this.f25973g = imageView;
    }

    public static final String a(String str) {
        return "Failed to retrieve bitmap from url: " + str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r4(this.f25969c, this.f25970d, this.f25971e, this.f25972f, this.f25973g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r4) create((P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f25968b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            TrafficStats.setThreadStatsTag(1337);
            Bitmap bitmapFromUrl = this.f25969c.getBitmapFromUrl(this.f25970d, this.f25971e, this.f25972f);
            if (bitmapFromUrl == null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                str = DefaultBrazeImageLoader.TAG;
                final String str2 = this.f25971e;
                BrazeLogger.brazelog$default(brazeLogger, str, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.ha
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.r4.a(str2);
                    }
                }, 14, (Object) null);
            } else {
                String str3 = this.f25971e;
                Object tag = this.f25973g.getTag(R$string.com_braze_image_lru_cache_image_url_key);
                Intrinsics.checkNotNull(tag, "null cannot be cast to non-null type kotlin.String");
                if (Intrinsics.areEqual(str3, (String) tag)) {
                    M0 c10 = C1452g0.c();
                    p4 p4Var = new p4(this.f25973g, bitmapFromUrl, null);
                    this.f25967a = bitmapFromUrl;
                    this.f25968b = 1;
                    if (AbstractC1455i.g(c10, p4Var, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    bitmap = bitmapFromUrl;
                }
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bitmap = this.f25967a;
        ResultKt.throwOnFailure(obj);
        BrazeViewBounds brazeViewBounds = this.f25972f;
        ImageView imageView = this.f25973g;
        imageView.addOnLayoutChangeListener(new q4(brazeViewBounds, imageView, bitmap));
        return Unit.INSTANCE;
    }
}
