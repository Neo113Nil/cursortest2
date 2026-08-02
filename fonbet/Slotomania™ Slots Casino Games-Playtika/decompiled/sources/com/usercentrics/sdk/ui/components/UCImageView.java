package com.usercentrics.sdk.ui.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.usercentrics.sdk.UsercentricsImage;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.ui.PredefinedUIDependencyManager;
import com.usercentrics.sdk.ui.image.UCRemoteImage;
import com.usercentrics.sdk.ui.image.UCRemoteImageService;
import com.usercentrics.sdk.ui.theme.UCThemeData;
import io.sentry.SentryEvent;
import io.sentry.Session;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.YieldKt;

/* compiled from: UCImageView.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001>B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0082@¢\u0006\u0002\u0010$J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\u0010\u0010*\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020,H\u0014J\u000e\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020/J\u0016\u00100\u001a\u00020\u001f2\u0006\u00101\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\u0010\u00102\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(H\u0002J\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u000205J\u0018\u00106\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\u001e\u00107\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u00108\u001a\u00020#H\u0082@¢\u0006\u0002\u00109J\u001e\u0010:\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020(2\u0006\u00108\u001a\u00020#H\u0082@¢\u0006\u0002\u00109J\u001c\u0010;\u001a\u00020\u001f*\u00020\u00142\u0006\u0010'\u001a\u00020(2\u0006\u0010<\u001a\u00020=H\u0002R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001b\u0010\u001c¨\u0006?"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", Session.JsonKeys.ATTRS, "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cornerSettings", "Lcom/usercentrics/sdk/ui/components/UCImageView$CornerRadiusSettings;", "getCornerSettings", "()Lcom/usercentrics/sdk/ui/components/UCImageView$CornerRadiusSettings;", "setCornerSettings", "(Lcom/usercentrics/sdk/ui/components/UCImageView$CornerRadiusSettings;)V", "job", "Lkotlinx/coroutines/Job;", SentryEvent.JsonKeys.LOGGER, "Lcom/usercentrics/sdk/log/UsercentricsLogger;", "getLogger", "()Lcom/usercentrics/sdk/log/UsercentricsLogger;", "logger$delegate", "Lkotlin/Lazy;", "remoteImageService", "Lcom/usercentrics/sdk/ui/image/UCRemoteImageService;", "getRemoteImageService", "()Lcom/usercentrics/sdk/ui/image/UCRemoteImageService;", "remoteImageService$delegate", "cancelJob", "", "decodeBitmap", "Landroid/graphics/Bitmap;", "bytes", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadImage", "Lcom/usercentrics/sdk/ui/image/UCRemoteImage;", "imageUrl", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setImage", "image", "Lcom/usercentrics/sdk/UsercentricsImage;", "setImageSVG", "svg", "setImageUrl", "styleIcon", "theme", "Lcom/usercentrics/sdk/ui/theme/UCThemeData;", "tryToDownloadImage", "tryToSetImageBitmap", "payload", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryToSetImageSVG", "svgError", "cause", "", "CornerRadiusSettings", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UCImageView extends AppCompatImageView {
    private CornerRadiusSettings cornerSettings;
    private Job job;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    private final Lazy logger;

    /* renamed from: remoteImageService$delegate, reason: from kotlin metadata */
    private final Lazy remoteImageService;

    /* JADX INFO: Access modifiers changed from: private */
    public final UCRemoteImageService getRemoteImageService() {
        return (UCRemoteImageService) this.remoteImageService.getValue();
    }

    private final UsercentricsLogger getLogger() {
        return (UsercentricsLogger) this.logger.getValue();
    }

    public final CornerRadiusSettings getCornerSettings() {
        return this.cornerSettings;
    }

    public final void setCornerSettings(CornerRadiusSettings cornerRadiusSettings) {
        this.cornerSettings = cornerRadiusSettings;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UCImageView(Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UCImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UCImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.remoteImageService = LazyKt.lazy(new Function0<UCRemoteImageService>() { // from class: com.usercentrics.sdk.ui.components.UCImageView$remoteImageService$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final UCRemoteImageService invoke() {
                return PredefinedUIDependencyManager.INSTANCE.getRemoteImageService().getValue();
            }
        });
        this.logger = LazyKt.lazy(new Function0<UsercentricsLogger>() { // from class: com.usercentrics.sdk.ui.components.UCImageView$logger$2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final UsercentricsLogger invoke() {
                return PredefinedUIDependencyManager.INSTANCE.getLogger();
            }
        });
    }

    public final void setImage(UsercentricsImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        if (image instanceof UsercentricsImage.ImageDrawableId) {
            setImageResource(((UsercentricsImage.ImageDrawableId) image).getDrawableResId());
            return;
        }
        if (image instanceof UsercentricsImage.ImageBitmap) {
            setImageBitmap(((UsercentricsImage.ImageBitmap) image).getBitmap());
        } else if (image instanceof UsercentricsImage.ImageUrl) {
            setImageUrl(((UsercentricsImage.ImageUrl) image).getImageUrl());
        } else if (image instanceof UsercentricsImage.ImageDrawable) {
            setImageDrawable(((UsercentricsImage.ImageDrawable) image).getDrawable());
        }
    }

    public final void cancelJob() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
    }

    private final void setImageUrl(String imageUrl) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new UCImageView$setImageUrl$1(this, imageUrl, null), 3, null);
        this.job = launch$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToDownloadImage(String str, Continuation<? super UCRemoteImage> continuation) {
        UCImageView$tryToDownloadImage$1 uCImageView$tryToDownloadImage$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        UCImageView uCImageView;
        UCImageView uCImageView2;
        String str2;
        UCImageView uCImageView3;
        Object m11180constructorimpl;
        Throwable m11183exceptionOrNullimpl;
        Object obj2;
        UCImageView uCImageView4;
        String str3;
        Throwable th;
        UsercentricsLogger logger;
        if (continuation instanceof UCImageView$tryToDownloadImage$1) {
            uCImageView$tryToDownloadImage$1 = (UCImageView$tryToDownloadImage$1) continuation;
            if ((uCImageView$tryToDownloadImage$1.label & Integer.MIN_VALUE) != 0) {
                uCImageView$tryToDownloadImage$1.label -= Integer.MIN_VALUE;
                obj = uCImageView$tryToDownloadImage$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uCImageView$tryToDownloadImage$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        UCImageView uCImageView5 = this;
                        uCImageView$tryToDownloadImage$1.L$0 = this;
                        uCImageView$tryToDownloadImage$1.L$1 = str;
                        uCImageView$tryToDownloadImage$1.L$2 = this;
                        uCImageView$tryToDownloadImage$1.label = 1;
                        if (YieldKt.yield(uCImageView$tryToDownloadImage$1) != coroutine_suspended) {
                            uCImageView2 = this;
                            str2 = str;
                            uCImageView3 = uCImageView2;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        uCImageView = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                        }
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    uCImageView3 = (UCImageView) uCImageView$tryToDownloadImage$1.L$2;
                    str2 = (String) uCImageView$tryToDownloadImage$1.L$1;
                    uCImageView2 = (UCImageView) uCImageView$tryToDownloadImage$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        str = str2;
                        uCImageView = uCImageView2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                        }
                    }
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) uCImageView$tryToDownloadImage$1.L$3;
                        obj2 = uCImageView$tryToDownloadImage$1.L$2;
                        str3 = (String) uCImageView$tryToDownloadImage$1.L$1;
                        uCImageView4 = (UCImageView) uCImageView$tryToDownloadImage$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        logger = uCImageView4.getLogger();
                        if (logger != null) {
                            logger.error("Error when loading image with URL<" + str3 + ">, please make sure that you are proving a https:// URL in the Admin Interface", th);
                        }
                        m11180constructorimpl = obj2;
                        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                            return m11180constructorimpl;
                        }
                        return null;
                    }
                    str = (String) uCImageView$tryToDownloadImage$1.L$1;
                    uCImageView = (UCImageView) uCImageView$tryToDownloadImage$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        m11180constructorimpl = Result.m11180constructorimpl((UCRemoteImage) obj);
                    } catch (Throwable th4) {
                        th = th4;
                        Result.Companion companion222 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                        }
                    }
                    m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                    if (m11183exceptionOrNullimpl != null) {
                        uCImageView$tryToDownloadImage$1.L$0 = uCImageView;
                        uCImageView$tryToDownloadImage$1.L$1 = str;
                        uCImageView$tryToDownloadImage$1.L$2 = m11180constructorimpl;
                        uCImageView$tryToDownloadImage$1.L$3 = m11183exceptionOrNullimpl;
                        uCImageView$tryToDownloadImage$1.label = 3;
                        if (YieldKt.yield(uCImageView$tryToDownloadImage$1) != coroutine_suspended) {
                            obj2 = m11180constructorimpl;
                            uCImageView4 = uCImageView;
                            str3 = str;
                            th = m11183exceptionOrNullimpl;
                            logger = uCImageView4.getLogger();
                            if (logger != null) {
                            }
                            m11180constructorimpl = obj2;
                        }
                        return coroutine_suspended;
                    }
                    if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                    }
                }
                uCImageView$tryToDownloadImage$1.L$0 = uCImageView2;
                uCImageView$tryToDownloadImage$1.L$1 = str2;
                uCImageView$tryToDownloadImage$1.L$2 = null;
                uCImageView$tryToDownloadImage$1.label = 2;
                obj = uCImageView3.downloadImage(str2, uCImageView$tryToDownloadImage$1);
                if (obj != coroutine_suspended) {
                    str = str2;
                    uCImageView = uCImageView2;
                    m11180constructorimpl = Result.m11180constructorimpl((UCRemoteImage) obj);
                    m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                    if (m11183exceptionOrNullimpl != null) {
                    }
                    if (Result.m11186isFailureimpl(m11180constructorimpl)) {
                    }
                }
                return coroutine_suspended;
            }
        }
        uCImageView$tryToDownloadImage$1 = new UCImageView$tryToDownloadImage$1(this, continuation);
        obj = uCImageView$tryToDownloadImage$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uCImageView$tryToDownloadImage$1.label;
        if (i != 0) {
        }
        uCImageView$tryToDownloadImage$1.L$0 = uCImageView2;
        uCImageView$tryToDownloadImage$1.L$1 = str2;
        uCImageView$tryToDownloadImage$1.L$2 = null;
        uCImageView$tryToDownloadImage$1.label = 2;
        obj = uCImageView3.downloadImage(str2, uCImageView$tryToDownloadImage$1);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadImage(String str, Continuation<? super UCRemoteImage> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UCImageView$downloadImage$2(this, str, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToSetImageSVG(String str, byte[] bArr, Continuation<? super Unit> continuation) {
        UCImageView$tryToSetImageSVG$1 uCImageView$tryToSetImageSVG$1;
        int i;
        UCImageView uCImageView;
        Object m11180constructorimpl;
        Throwable m11183exceptionOrNullimpl;
        UsercentricsLogger logger;
        if (continuation instanceof UCImageView$tryToSetImageSVG$1) {
            uCImageView$tryToSetImageSVG$1 = (UCImageView$tryToSetImageSVG$1) continuation;
            if ((uCImageView$tryToSetImageSVG$1.label & Integer.MIN_VALUE) != 0) {
                uCImageView$tryToSetImageSVG$1.label -= Integer.MIN_VALUE;
                Object obj = uCImageView$tryToSetImageSVG$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uCImageView$tryToSetImageSVG$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        UCImageView uCImageView2 = this;
                        String str2 = new String(bArr, Charsets.UTF_8);
                        uCImageView$tryToSetImageSVG$1.L$0 = this;
                        uCImageView$tryToSetImageSVG$1.L$1 = str;
                        uCImageView$tryToSetImageSVG$1.label = 1;
                        if (setImageSVG(str2, uCImageView$tryToSetImageSVG$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        uCImageView = this;
                    } catch (Throwable th) {
                        th = th;
                        uCImageView = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) uCImageView$tryToSetImageSVG$1.L$1;
                    uCImageView = (UCImageView) uCImageView$tryToSetImageSVG$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        Result.Companion companion22 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                if (m11183exceptionOrNullimpl != null && (logger = uCImageView.getLogger()) != null) {
                    uCImageView.svgError(logger, str, m11183exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        }
        uCImageView$tryToSetImageSVG$1 = new UCImageView$tryToSetImageSVG$1(this, continuation);
        Object obj2 = uCImageView$tryToSetImageSVG$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uCImageView$tryToSetImageSVG$1.label;
        if (i != 0) {
        }
        m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            uCImageView.svgError(logger, str, m11183exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setImageSVG(String str, Continuation<? super Unit> continuation) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new UCImageView$setImageSVG$2(str, this, null), continuation);
        return withContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : Unit.INSTANCE;
    }

    private final void svgError(UsercentricsLogger usercentricsLogger, String str, Throwable th) {
        if (th instanceof NoClassDefFoundError) {
            UsercentricsLogger.DefaultImpls.error$default(usercentricsLogger, "Error when trying to use image with URL<" + str + "> as a SVG because the optional SVG module is not present. Please add this module to your application: 'com.pixplicity.sharp'", null, 2, null);
        } else {
            usercentricsLogger.error("Error when trying to use image with URL<" + str + "> as a SVG", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tryToSetImageBitmap(String str, byte[] bArr, Continuation<? super Unit> continuation) {
        UCImageView$tryToSetImageBitmap$1 uCImageView$tryToSetImageBitmap$1;
        int i;
        String str2;
        Throwable th;
        UCImageView uCImageView;
        UCImageView uCImageView2;
        Object m11180constructorimpl;
        Throwable m11183exceptionOrNullimpl;
        UsercentricsLogger logger;
        if (continuation instanceof UCImageView$tryToSetImageBitmap$1) {
            uCImageView$tryToSetImageBitmap$1 = (UCImageView$tryToSetImageBitmap$1) continuation;
            if ((uCImageView$tryToSetImageBitmap$1.label & Integer.MIN_VALUE) != 0) {
                uCImageView$tryToSetImageBitmap$1.label -= Integer.MIN_VALUE;
                Object obj = uCImageView$tryToSetImageBitmap$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = uCImageView$tryToSetImageBitmap$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        UCImageView uCImageView3 = this;
                        uCImageView$tryToSetImageBitmap$1.L$0 = this;
                        uCImageView$tryToSetImageBitmap$1.L$1 = str;
                        uCImageView$tryToSetImageBitmap$1.L$2 = this;
                        uCImageView$tryToSetImageBitmap$1.label = 1;
                        obj = decodeBitmap(bArr, uCImageView$tryToSetImageBitmap$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        uCImageView = this;
                        str2 = str;
                        uCImageView2 = uCImageView;
                    } catch (Throwable th2) {
                        str2 = str;
                        th = th2;
                        uCImageView = this;
                        Result.Companion companion2 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uCImageView2 = (UCImageView) uCImageView$tryToSetImageBitmap$1.L$2;
                    str2 = (String) uCImageView$tryToSetImageBitmap$1.L$1;
                    uCImageView = (UCImageView) uCImageView$tryToSetImageBitmap$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion22 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
                        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                        if (m11183exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                }
                uCImageView2.setImageBitmap((Bitmap) obj);
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                if (m11183exceptionOrNullimpl != null && (logger = uCImageView.getLogger()) != null) {
                    logger.error("Error when trying to use image with URL<" + str2 + "> as a Bitmap", m11183exceptionOrNullimpl);
                }
                return Unit.INSTANCE;
            }
        }
        uCImageView$tryToSetImageBitmap$1 = new UCImageView$tryToSetImageBitmap$1(this, continuation);
        Object obj2 = uCImageView$tryToSetImageBitmap$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uCImageView$tryToSetImageBitmap$1.label;
        if (i != 0) {
        }
        uCImageView2.setImageBitmap((Bitmap) obj2);
        m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
        m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
        if (m11183exceptionOrNullimpl != null) {
            logger.error("Error when trying to use image with URL<" + str2 + "> as a Bitmap", m11183exceptionOrNullimpl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object decodeBitmap(byte[] bArr, Continuation<? super Bitmap> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new UCImageView$decodeBitmap$2(bArr, null), continuation);
    }

    public final void styleIcon(UCThemeData theme) {
        Intrinsics.checkNotNullParameter(theme, "theme");
        Integer text80 = theme.getColorPalette().getText80();
        if (text80 != null) {
            setColorFilter(text80.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        Path path;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        CornerRadiusSettings cornerRadiusSettings = this.cornerSettings;
        if (cornerRadiusSettings != null && (path = cornerRadiusSettings.getPath(getWidth(), getHeight())) != null) {
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    /* compiled from: UCImageView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\r"}, d2 = {"Lcom/usercentrics/sdk/ui/components/UCImageView$CornerRadiusSettings;", "", "topLeft", "", "topRight", "bottomRight", "bottomLeft", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;)V", "Ljava/lang/Float;", "getPath", "Landroid/graphics/Path;", "width", "height", "usercentrics-ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CornerRadiusSettings {
        private final Float bottomLeft;
        private final Float bottomRight;
        private final Float topLeft;
        private final Float topRight;

        public CornerRadiusSettings() {
            this(null, null, null, null, 15, null);
        }

        public CornerRadiusSettings(Float f, Float f2, Float f3, Float f4) {
            this.topLeft = f;
            this.topRight = f2;
            this.bottomRight = f3;
            this.bottomLeft = f4;
        }

        public /* synthetic */ CornerRadiusSettings(Float f, Float f2, Float f3, Float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3, (i & 8) != 0 ? null : f4);
        }

        public final Path getPath(float width, float height) {
            float[] fArr = new float[8];
            Float f = this.topLeft;
            if (f != null) {
                fArr[0] = f.floatValue();
                fArr[1] = this.topLeft.floatValue();
            }
            Float f2 = this.topRight;
            if (f2 != null) {
                fArr[2] = f2.floatValue();
                fArr[3] = this.topRight.floatValue();
            }
            Float f3 = this.bottomRight;
            if (f3 != null) {
                fArr[4] = f3.floatValue();
                fArr[5] = this.bottomRight.floatValue();
            }
            Float f4 = this.bottomLeft;
            if (f4 != null) {
                fArr[6] = f4.floatValue();
                fArr[7] = this.bottomLeft.floatValue();
            }
            Path path = new Path();
            path.addRoundRect(new RectF(0.0f, 0.0f, width, height), fArr, Path.Direction.CW);
            return path;
        }
    }
}
