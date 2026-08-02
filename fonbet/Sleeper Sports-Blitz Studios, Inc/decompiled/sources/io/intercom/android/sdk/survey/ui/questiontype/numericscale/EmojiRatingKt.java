package io.intercom.android.sdk.survey.ui.questiontype.numericscale;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorMatrix;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Dp;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.compose.AsyncImagePainterKt;
import coil.request.ImageRequest;
import io.intercom.android.sdk.ui.coil.IntercomImageLoaderKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EmojiRating.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"EmojiRating", "", "emojiUrl", "", "contentDescription", "showInColor", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SelectedEmoji", "(Landroidx/compose/runtime/Composer;I)V", "UnSelectedEmoji", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class EmojiRatingKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiRating$lambda$2(String emojiUrl, String contentDescription, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(emojiUrl, "$emojiUrl");
        Intrinsics.checkNotNullParameter(contentDescription, "$contentDescription");
        Intrinsics.checkNotNullParameter(modifier, "$modifier");
        EmojiRating(emojiUrl, contentDescription, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedEmoji$lambda$3(int i, Composer composer, int i2) {
        SelectedEmoji(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnSelectedEmoji$lambda$4(int i, Composer composer, int i2) {
        UnSelectedEmoji(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmojiRating(final String emojiUrl, final String contentDescription, boolean z, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        Composer composer2;
        final boolean z3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(emojiUrl, "emojiUrl");
        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer startRestartGroup = composer.startRestartGroup(-538688650);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(emojiUrl) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(contentDescription) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 256 : 128;
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                i3 |= startRestartGroup.changed(modifier) ? 2048 : 1024;
            }
            if ((i3 & 5851) == 1170 || !startRestartGroup.getSkipping()) {
                boolean z4 = i4 == 0 ? true : z2;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume = startRestartGroup.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ImageLoader imageLoader = IntercomImageLoaderKt.getImageLoader((Context) consume);
                startRestartGroup.startReplaceableGroup(1750824323);
                ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
                Object consume2 = startRestartGroup.consume(localContext2);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ImageRequest.Builder data = new ImageRequest.Builder((Context) consume2).data(emojiUrl);
                data.crossfade(true);
                composer2 = startRestartGroup;
                AsyncImagePainter m10076rememberAsyncImagePainter0YpotYA = AsyncImagePainterKt.m10076rememberAsyncImagePainter0YpotYA(data.build(), imageLoader, null, null, null, 0, null, composer2, 72, 124);
                composer2.endReplaceableGroup();
                AsyncImagePainter asyncImagePainter = m10076rememberAsyncImagePainter0YpotYA;
                ColorFilter.Companion companion = ColorFilter.INSTANCE;
                float[] m6096constructorimpl$default = ColorMatrix.m6096constructorimpl$default(null, 1, null);
                ColorMatrix.m6110setToSaturationimpl(m6096constructorimpl$default, !z4 ? 1.0f : 0.0f);
                Unit unit = Unit.INSTANCE;
                ImageKt.Image(asyncImagePainter, contentDescription, modifier, (Alignment) null, (ContentScale) null, 0.0f, companion.m6081colorMatrixjHGOpc(m6096constructorimpl$default), composer2, (i3 & 112) | ((i3 >> 3) & 896), 56);
                z3 = z4;
            } else {
                startRestartGroup.skipToGroupEnd();
                z3 = z2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit EmojiRating$lambda$2;
                        EmojiRating$lambda$2 = EmojiRatingKt.EmojiRating$lambda$2(emojiUrl, contentDescription, z3, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return EmojiRating$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        z2 = z;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 5851) == 1170) {
        }
        if (i4 == 0) {
        }
        ProvidableCompositionLocal<Context> localContext3 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume3 = startRestartGroup.consume(localContext3);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ImageLoader imageLoader2 = IntercomImageLoaderKt.getImageLoader((Context) consume3);
        startRestartGroup.startReplaceableGroup(1750824323);
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ImageRequest.Builder data2 = new ImageRequest.Builder((Context) consume22).data(emojiUrl);
        data2.crossfade(true);
        composer2 = startRestartGroup;
        AsyncImagePainter m10076rememberAsyncImagePainter0YpotYA2 = AsyncImagePainterKt.m10076rememberAsyncImagePainter0YpotYA(data2.build(), imageLoader2, null, null, null, 0, null, composer2, 72, 124);
        composer2.endReplaceableGroup();
        AsyncImagePainter asyncImagePainter2 = m10076rememberAsyncImagePainter0YpotYA2;
        ColorFilter.Companion companion2 = ColorFilter.INSTANCE;
        float[] m6096constructorimpl$default2 = ColorMatrix.m6096constructorimpl$default(null, 1, null);
        ColorMatrix.m6110setToSaturationimpl(m6096constructorimpl$default2, !z4 ? 1.0f : 0.0f);
        Unit unit2 = Unit.INSTANCE;
        ImageKt.Image(asyncImagePainter2, contentDescription, modifier, (Alignment) null, (ContentScale) null, 0.0f, companion2.m6081colorMatrixjHGOpc(m6096constructorimpl$default2), composer2, (i3 & 112) | ((i3 >> 3) & 896), 56);
        z3 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void SelectedEmoji(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1230381561);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", true, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(44)), startRestartGroup, 3510, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SelectedEmoji$lambda$3;
                    SelectedEmoji$lambda$3 = EmojiRatingKt.SelectedEmoji$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SelectedEmoji$lambda$3;
                }
            });
        }
    }

    public static final void UnSelectedEmoji(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2043776160);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            EmojiRating("https://js.intercomcdn.com/images/emojis/v2/72x72/1f929.png", "🤩", false, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(44)), startRestartGroup, 3510, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.numericscale.EmojiRatingKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit UnSelectedEmoji$lambda$4;
                    UnSelectedEmoji$lambda$4 = EmojiRatingKt.UnSelectedEmoji$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return UnSelectedEmoji$lambda$4;
                }
            });
        }
    }
}
