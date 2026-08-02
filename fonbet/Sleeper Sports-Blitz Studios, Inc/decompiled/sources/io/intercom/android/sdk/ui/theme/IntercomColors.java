package io.intercom.android.sdk.ui.theme;

import androidx.compose.material.OutlinedTextFieldKt;
import androidx.compose.ui.graphics.Color;
import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.facebook.react.modules.appstate.AppStateModule;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IntercomColors.kt */
@Metadata(d1 = {"\u0000G\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0003\b\u008a\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u000203¢\u0006\u0004\b4\u00105J\u0010\u0010h\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bi\u00107J\u0010\u0010j\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bk\u00107J\u0010\u0010l\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bm\u00107J\u0010\u0010n\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bo\u00107J\u0010\u0010p\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bq\u00107J\u0010\u0010r\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bs\u00107J\t\u0010t\u001a\u00020\nHÆ\u0003J\t\u0010u\u001a\u00020\fHÆ\u0003J\t\u0010v\u001a\u00020\u000eHÆ\u0003J\t\u0010w\u001a\u00020\u0010HÆ\u0003J\t\u0010x\u001a\u00020\u0012HÆ\u0003J\u0010\u0010y\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bz\u00107J\u0010\u0010{\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b|\u00107J\u0010\u0010}\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b~\u00107J\u0011\u0010\u007f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0080\u0001\u00107J\u0012\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u00107J\u0012\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u00107J\u0012\u0010\u0085\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u00107J\u0012\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0088\u0001\u00107J\u0012\u0010\u0089\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u008a\u0001\u00107J\u0012\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u008c\u0001\u00107J\u0012\u0010\u008d\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u008e\u0001\u00107J\u0012\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0090\u0001\u00107J\u0012\u0010\u0091\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0092\u0001\u00107J\u0012\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0094\u0001\u00107J\u0012\u0010\u0095\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0096\u0001\u00107J\u0012\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u0098\u0001\u00107J\u0012\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u009a\u0001\u00107J\u0012\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u009c\u0001\u00107J\u0012\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b\u009e\u0001\u00107J\u0012\u0010\u009f\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b \u0001\u00107J\u0012\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b¢\u0001\u00107J\u0012\u0010£\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b¤\u0001\u00107J\u0012\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b¦\u0001\u00107J\u0012\u0010§\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b¨\u0001\u00107J\u0012\u0010©\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\bª\u0001\u00107J\u0012\u0010«\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b¬\u0001\u00107J\u0012\u0010\u00ad\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b®\u0001\u00107J\u0012\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b°\u0001\u00107J\u0012\u0010±\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b²\u0001\u00107J\u0012\u0010³\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b´\u0001\u00107J\u0012\u0010µ\u0001\u001a\u00020\u0003HÆ\u0003¢\u0006\u0005\b¶\u0001\u00107J\n\u0010·\u0001\u001a\u000203HÆ\u0003JÁ\u0003\u0010¸\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\u00032\b\b\u0002\u0010-\u001a\u00020\u00032\b\b\u0002\u0010.\u001a\u00020\u00032\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\b\b\u0002\u00101\u001a\u00020\u00032\b\b\u0002\u00102\u001a\u000203HÆ\u0001¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0015\u0010»\u0001\u001a\u0002032\t\u0010¼\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010½\u0001\u001a\u00030¾\u0001HÖ\u0001J\u000b\u0010¿\u0001\u001a\u00030À\u0001HÖ\u0001R\u0013\u0010\u0002\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0013\u0010\u0004\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b9\u00107R\u0013\u0010\u0005\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b:\u00107R\u0013\u0010\u0006\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b;\u00107R\u0013\u0010\u0007\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b<\u00107R\u0013\u0010\b\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b=\u00107R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0013\u0010\u0013\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bH\u00107R\u0013\u0010\u0014\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bI\u00107R\u0013\u0010\u0015\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bJ\u00107R\u0013\u0010\u0016\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bK\u00107R\u0013\u0010\u0017\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bL\u00107R\u0013\u0010\u0018\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bM\u00107R\u0013\u0010\u0019\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bN\u00107R\u0013\u0010\u001a\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bO\u00107R\u0013\u0010\u001b\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bP\u00107R\u0013\u0010\u001c\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bQ\u00107R\u0013\u0010\u001d\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bR\u00107R\u0013\u0010\u001e\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bS\u00107R\u0013\u0010\u001f\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bT\u00107R\u0013\u0010 \u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bU\u00107R\u0013\u0010!\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bV\u00107R\u0013\u0010\"\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bW\u00107R\u0013\u0010#\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bX\u00107R\u0013\u0010$\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bY\u00107R\u0013\u0010%\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bZ\u00107R\u0013\u0010&\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b[\u00107R\u0013\u0010'\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b\\\u00107R\u0013\u0010(\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b]\u00107R\u0013\u0010)\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b^\u00107R\u0013\u0010*\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b_\u00107R\u0013\u0010+\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\b`\u00107R\u0013\u0010,\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\ba\u00107R\u0013\u0010-\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bb\u00107R\u0013\u0010.\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bc\u00107R\u0013\u0010/\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bd\u00107R\u0013\u00100\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\be\u00107R\u0013\u00101\u001a\u00020\u0003¢\u0006\n\n\u0002\u00108\u001a\u0004\bf\u00107R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b2\u0010g¨\u0006Á\u0001"}, d2 = {"Lio/intercom/android/sdk/ui/theme/IntercomColors;", "", "action", "Landroidx/compose/ui/graphics/Color;", "onAction", "actionContrastWhite", "onActionContrastWhite", "header", "onHeader", "base", "Lio/intercom/android/sdk/ui/theme/IntercomBaseColors;", "text", "Lio/intercom/android/sdk/ui/theme/IntercomTextColors;", "icon", "Lio/intercom/android/sdk/ui/theme/IntercomIconColors;", "neutral", "Lio/intercom/android/sdk/ui/theme/IntercomNeutralColor;", "alpha", "Lio/intercom/android/sdk/ui/theme/IntercomAlphaColors;", AppStateModule.APP_STATE_BACKGROUND, "bubbleBackground", "adminBackground", "timestampBackground", "specialNoticeBackground", "sourceBackground", "inputAlt", "poweredByBackgroundColor", "reminderBackgroundColor", "disabled", "primaryText", "descriptionText", "greetingText", "introText", "isTyping", "hintText", "reminderTextColor", "onDisabled", "primaryIcon", OutlinedTextFieldKt.BorderId, "adminBorder", "composerBorder", "collectorBorder", "specialNoticeBorder", "divider", "collectorSelected", MetricTracker.Object.BADGE, MetricTracker.Action.SUBMITTED, "active", "error", "shadow", "isLight", "", "<init>", "(JJJJJJLio/intercom/android/sdk/ui/theme/IntercomBaseColors;Lio/intercom/android/sdk/ui/theme/IntercomTextColors;Lio/intercom/android/sdk/ui/theme/IntercomIconColors;Lio/intercom/android/sdk/ui/theme/IntercomNeutralColor;Lio/intercom/android/sdk/ui/theme/IntercomAlphaColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAction-0d7_KjU", "()J", "J", "getOnAction-0d7_KjU", "getActionContrastWhite-0d7_KjU", "getOnActionContrastWhite-0d7_KjU", "getHeader-0d7_KjU", "getOnHeader-0d7_KjU", "getBase", "()Lio/intercom/android/sdk/ui/theme/IntercomBaseColors;", "getText", "()Lio/intercom/android/sdk/ui/theme/IntercomTextColors;", "getIcon", "()Lio/intercom/android/sdk/ui/theme/IntercomIconColors;", "getNeutral", "()Lio/intercom/android/sdk/ui/theme/IntercomNeutralColor;", "getAlpha", "()Lio/intercom/android/sdk/ui/theme/IntercomAlphaColors;", "getBackground-0d7_KjU", "getBubbleBackground-0d7_KjU", "getAdminBackground-0d7_KjU", "getTimestampBackground-0d7_KjU", "getSpecialNoticeBackground-0d7_KjU", "getSourceBackground-0d7_KjU", "getInputAlt-0d7_KjU", "getPoweredByBackgroundColor-0d7_KjU", "getReminderBackgroundColor-0d7_KjU", "getDisabled-0d7_KjU", "getPrimaryText-0d7_KjU", "getDescriptionText-0d7_KjU", "getGreetingText-0d7_KjU", "getIntroText-0d7_KjU", "isTyping-0d7_KjU", "getHintText-0d7_KjU", "getReminderTextColor-0d7_KjU", "getOnDisabled-0d7_KjU", "getPrimaryIcon-0d7_KjU", "getBorder-0d7_KjU", "getAdminBorder-0d7_KjU", "getComposerBorder-0d7_KjU", "getCollectorBorder-0d7_KjU", "getSpecialNoticeBorder-0d7_KjU", "getDivider-0d7_KjU", "getCollectorSelected-0d7_KjU", "getBadge-0d7_KjU", "getSubmitted-0d7_KjU", "getActive-0d7_KjU", "getError-0d7_KjU", "getShadow-0d7_KjU", "()Z", "component1", "component1-0d7_KjU", "component2", "component2-0d7_KjU", "component3", "component3-0d7_KjU", "component4", "component4-0d7_KjU", "component5", "component5-0d7_KjU", "component6", "component6-0d7_KjU", "component7", "component8", "component9", "component10", "component11", "component12", "component12-0d7_KjU", "component13", "component13-0d7_KjU", "component14", "component14-0d7_KjU", "component15", "component15-0d7_KjU", "component16", "component16-0d7_KjU", "component17", "component17-0d7_KjU", "component18", "component18-0d7_KjU", "component19", "component19-0d7_KjU", "component20", "component20-0d7_KjU", "component21", "component21-0d7_KjU", "component22", "component22-0d7_KjU", "component23", "component23-0d7_KjU", "component24", "component24-0d7_KjU", "component25", "component25-0d7_KjU", "component26", "component26-0d7_KjU", "component27", "component27-0d7_KjU", "component28", "component28-0d7_KjU", "component29", "component29-0d7_KjU", "component30", "component30-0d7_KjU", "component31", "component31-0d7_KjU", "component32", "component32-0d7_KjU", "component33", "component33-0d7_KjU", "component34", "component34-0d7_KjU", "component35", "component35-0d7_KjU", "component36", "component36-0d7_KjU", "component37", "component37-0d7_KjU", "component38", "component38-0d7_KjU", "component39", "component39-0d7_KjU", "component40", "component40-0d7_KjU", "component41", "component41-0d7_KjU", "component42", "component42-0d7_KjU", "component43", "copy", "copy-dXWBkUw", "(JJJJJJLio/intercom/android/sdk/ui/theme/IntercomBaseColors;Lio/intercom/android/sdk/ui/theme/IntercomTextColors;Lio/intercom/android/sdk/ui/theme/IntercomIconColors;Lio/intercom/android/sdk/ui/theme/IntercomNeutralColor;Lio/intercom/android/sdk/ui/theme/IntercomAlphaColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJZ)Lio/intercom/android/sdk/ui/theme/IntercomColors;", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class IntercomColors {
    public static final int $stable = 0;
    private final long action;
    private final long actionContrastWhite;
    private final long active;
    private final long adminBackground;
    private final long adminBorder;
    private final IntercomAlphaColors alpha;
    private final long background;
    private final long badge;
    private final IntercomBaseColors base;
    private final long border;
    private final long bubbleBackground;
    private final long collectorBorder;
    private final long collectorSelected;
    private final long composerBorder;
    private final long descriptionText;
    private final long disabled;
    private final long divider;
    private final long error;
    private final long greetingText;
    private final long header;
    private final long hintText;
    private final IntercomIconColors icon;
    private final long inputAlt;
    private final long introText;
    private final boolean isLight;
    private final long isTyping;
    private final IntercomNeutralColor neutral;
    private final long onAction;
    private final long onActionContrastWhite;
    private final long onDisabled;
    private final long onHeader;
    private final long poweredByBackgroundColor;
    private final long primaryIcon;
    private final long primaryText;
    private final long reminderBackgroundColor;
    private final long reminderTextColor;
    private final long shadow;
    private final long sourceBackground;
    private final long specialNoticeBackground;
    private final long specialNoticeBorder;
    private final long submitted;
    private final IntercomTextColors text;
    private final long timestampBackground;

    public /* synthetic */ IntercomColors(long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors intercomBaseColors, IntercomTextColors intercomTextColors, IntercomIconColors intercomIconColors, IntercomNeutralColor intercomNeutralColor, IntercomAlphaColors intercomAlphaColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, intercomBaseColors, intercomTextColors, intercomIconColors, intercomNeutralColor, intercomAlphaColors, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, z);
    }

    /* renamed from: copy-dXWBkUw$default, reason: not valid java name */
    public static /* synthetic */ IntercomColors m13050copydXWBkUw$default(IntercomColors intercomColors, long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors intercomBaseColors, IntercomTextColors intercomTextColors, IntercomIconColors intercomIconColors, IntercomNeutralColor intercomNeutralColor, IntercomAlphaColors intercomAlphaColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, boolean z, int i, int i2, Object obj) {
        long j38 = (i & 1) != 0 ? intercomColors.action : j;
        return intercomColors.m13088copydXWBkUw(j38, (i & 2) != 0 ? intercomColors.onAction : j2, (i & 4) != 0 ? intercomColors.actionContrastWhite : j3, (i & 8) != 0 ? intercomColors.onActionContrastWhite : j4, (i & 16) != 0 ? intercomColors.header : j5, (i & 32) != 0 ? intercomColors.onHeader : j6, (i & 64) != 0 ? intercomColors.base : intercomBaseColors, (i & 128) != 0 ? intercomColors.text : intercomTextColors, (i & 256) != 0 ? intercomColors.icon : intercomIconColors, (i & 512) != 0 ? intercomColors.neutral : intercomNeutralColor, (i & 1024) != 0 ? intercomColors.alpha : intercomAlphaColors, (i & 2048) != 0 ? intercomColors.background : j7, (i & 4096) != 0 ? intercomColors.bubbleBackground : j8, (i & 8192) != 0 ? intercomColors.adminBackground : j9, (i & 16384) != 0 ? intercomColors.timestampBackground : j10, (i & 32768) != 0 ? intercomColors.specialNoticeBackground : j11, (i & 65536) != 0 ? intercomColors.sourceBackground : j12, (i & 131072) != 0 ? intercomColors.inputAlt : j13, (i & 262144) != 0 ? intercomColors.poweredByBackgroundColor : j14, (i & 524288) != 0 ? intercomColors.reminderBackgroundColor : j15, (i & 1048576) != 0 ? intercomColors.disabled : j16, (i & 2097152) != 0 ? intercomColors.primaryText : j17, (i & 4194304) != 0 ? intercomColors.descriptionText : j18, (i & 8388608) != 0 ? intercomColors.greetingText : j19, (i & 16777216) != 0 ? intercomColors.introText : j20, (i & 33554432) != 0 ? intercomColors.isTyping : j21, (i & 67108864) != 0 ? intercomColors.hintText : j22, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? intercomColors.reminderTextColor : j23, (i & 268435456) != 0 ? intercomColors.onDisabled : j24, (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? intercomColors.primaryIcon : j25, (i & 1073741824) != 0 ? intercomColors.border : j26, (i & Integer.MIN_VALUE) != 0 ? intercomColors.adminBorder : j27, (i2 & 1) != 0 ? intercomColors.composerBorder : j28, (i2 & 2) != 0 ? intercomColors.collectorBorder : j29, (i2 & 4) != 0 ? intercomColors.specialNoticeBorder : j30, (i2 & 8) != 0 ? intercomColors.divider : j31, (i2 & 16) != 0 ? intercomColors.collectorSelected : j32, (i2 & 32) != 0 ? intercomColors.badge : j33, (i2 & 64) != 0 ? intercomColors.submitted : j34, (i2 & 128) != 0 ? intercomColors.active : j35, (i2 & 256) != 0 ? intercomColors.error : j36, (i2 & 512) != 0 ? intercomColors.shadow : j37, (i2 & 1024) != 0 ? intercomColors.isLight : z);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name and from getter */
    public final long getAction() {
        return this.action;
    }

    /* renamed from: component10, reason: from getter */
    public final IntercomNeutralColor getNeutral() {
        return this.neutral;
    }

    /* renamed from: component11, reason: from getter */
    public final IntercomAlphaColors getAlpha() {
        return this.alpha;
    }

    /* renamed from: component12-0d7_KjU, reason: not valid java name and from getter */
    public final long getBackground() {
        return this.background;
    }

    /* renamed from: component13-0d7_KjU, reason: not valid java name and from getter */
    public final long getBubbleBackground() {
        return this.bubbleBackground;
    }

    /* renamed from: component14-0d7_KjU, reason: not valid java name and from getter */
    public final long getAdminBackground() {
        return this.adminBackground;
    }

    /* renamed from: component15-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimestampBackground() {
        return this.timestampBackground;
    }

    /* renamed from: component16-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpecialNoticeBackground() {
        return this.specialNoticeBackground;
    }

    /* renamed from: component17-0d7_KjU, reason: not valid java name and from getter */
    public final long getSourceBackground() {
        return this.sourceBackground;
    }

    /* renamed from: component18-0d7_KjU, reason: not valid java name and from getter */
    public final long getInputAlt() {
        return this.inputAlt;
    }

    /* renamed from: component19-0d7_KjU, reason: not valid java name and from getter */
    public final long getPoweredByBackgroundColor() {
        return this.poweredByBackgroundColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnAction() {
        return this.onAction;
    }

    /* renamed from: component20-0d7_KjU, reason: not valid java name and from getter */
    public final long getReminderBackgroundColor() {
        return this.reminderBackgroundColor;
    }

    /* renamed from: component21-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabled() {
        return this.disabled;
    }

    /* renamed from: component22-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component23-0d7_KjU, reason: not valid java name and from getter */
    public final long getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component24-0d7_KjU, reason: not valid java name and from getter */
    public final long getGreetingText() {
        return this.greetingText;
    }

    /* renamed from: component25-0d7_KjU, reason: not valid java name and from getter */
    public final long getIntroText() {
        return this.introText;
    }

    /* renamed from: component26-0d7_KjU, reason: not valid java name and from getter */
    public final long getIsTyping() {
        return this.isTyping;
    }

    /* renamed from: component27-0d7_KjU, reason: not valid java name and from getter */
    public final long getHintText() {
        return this.hintText;
    }

    /* renamed from: component28-0d7_KjU, reason: not valid java name and from getter */
    public final long getReminderTextColor() {
        return this.reminderTextColor;
    }

    /* renamed from: component29-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnDisabled() {
        return this.onDisabled;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name and from getter */
    public final long getActionContrastWhite() {
        return this.actionContrastWhite;
    }

    /* renamed from: component30-0d7_KjU, reason: not valid java name and from getter */
    public final long getPrimaryIcon() {
        return this.primaryIcon;
    }

    /* renamed from: component31-0d7_KjU, reason: not valid java name and from getter */
    public final long getBorder() {
        return this.border;
    }

    /* renamed from: component32-0d7_KjU, reason: not valid java name and from getter */
    public final long getAdminBorder() {
        return this.adminBorder;
    }

    /* renamed from: component33-0d7_KjU, reason: not valid java name and from getter */
    public final long getComposerBorder() {
        return this.composerBorder;
    }

    /* renamed from: component34-0d7_KjU, reason: not valid java name and from getter */
    public final long getCollectorBorder() {
        return this.collectorBorder;
    }

    /* renamed from: component35-0d7_KjU, reason: not valid java name and from getter */
    public final long getSpecialNoticeBorder() {
        return this.specialNoticeBorder;
    }

    /* renamed from: component36-0d7_KjU, reason: not valid java name and from getter */
    public final long getDivider() {
        return this.divider;
    }

    /* renamed from: component37-0d7_KjU, reason: not valid java name and from getter */
    public final long getCollectorSelected() {
        return this.collectorSelected;
    }

    /* renamed from: component38-0d7_KjU, reason: not valid java name and from getter */
    public final long getBadge() {
        return this.badge;
    }

    /* renamed from: component39-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubmitted() {
        return this.submitted;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnActionContrastWhite() {
        return this.onActionContrastWhite;
    }

    /* renamed from: component40-0d7_KjU, reason: not valid java name and from getter */
    public final long getActive() {
        return this.active;
    }

    /* renamed from: component41-0d7_KjU, reason: not valid java name and from getter */
    public final long getError() {
        return this.error;
    }

    /* renamed from: component42-0d7_KjU, reason: not valid java name and from getter */
    public final long getShadow() {
        return this.shadow;
    }

    /* renamed from: component43, reason: from getter */
    public final boolean getIsLight() {
        return this.isLight;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name and from getter */
    public final long getHeader() {
        return this.header;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name and from getter */
    public final long getOnHeader() {
        return this.onHeader;
    }

    /* renamed from: component7, reason: from getter */
    public final IntercomBaseColors getBase() {
        return this.base;
    }

    /* renamed from: component8, reason: from getter */
    public final IntercomTextColors getText() {
        return this.text;
    }

    /* renamed from: component9, reason: from getter */
    public final IntercomIconColors getIcon() {
        return this.icon;
    }

    /* renamed from: copy-dXWBkUw, reason: not valid java name */
    public final IntercomColors m13088copydXWBkUw(long action, long onAction, long actionContrastWhite, long onActionContrastWhite, long header, long onHeader, IntercomBaseColors base, IntercomTextColors text, IntercomIconColors icon, IntercomNeutralColor neutral, IntercomAlphaColors alpha, long background, long bubbleBackground, long adminBackground, long timestampBackground, long specialNoticeBackground, long sourceBackground, long inputAlt, long poweredByBackgroundColor, long reminderBackgroundColor, long disabled, long primaryText, long descriptionText, long greetingText, long introText, long isTyping, long hintText, long reminderTextColor, long onDisabled, long primaryIcon, long border, long adminBorder, long composerBorder, long collectorBorder, long specialNoticeBorder, long divider, long collectorSelected, long badge, long submitted, long active, long error, long shadow, boolean isLight) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(neutral, "neutral");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        return new IntercomColors(action, onAction, actionContrastWhite, onActionContrastWhite, header, onHeader, base, text, icon, neutral, alpha, background, bubbleBackground, adminBackground, timestampBackground, specialNoticeBackground, sourceBackground, inputAlt, poweredByBackgroundColor, reminderBackgroundColor, disabled, primaryText, descriptionText, greetingText, introText, isTyping, hintText, reminderTextColor, onDisabled, primaryIcon, border, adminBorder, composerBorder, collectorBorder, specialNoticeBorder, divider, collectorSelected, badge, submitted, active, error, shadow, isLight, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntercomColors)) {
            return false;
        }
        IntercomColors intercomColors = (IntercomColors) other;
        return Color.m6040equalsimpl0(this.action, intercomColors.action) && Color.m6040equalsimpl0(this.onAction, intercomColors.onAction) && Color.m6040equalsimpl0(this.actionContrastWhite, intercomColors.actionContrastWhite) && Color.m6040equalsimpl0(this.onActionContrastWhite, intercomColors.onActionContrastWhite) && Color.m6040equalsimpl0(this.header, intercomColors.header) && Color.m6040equalsimpl0(this.onHeader, intercomColors.onHeader) && Intrinsics.areEqual(this.base, intercomColors.base) && Intrinsics.areEqual(this.text, intercomColors.text) && Intrinsics.areEqual(this.icon, intercomColors.icon) && Intrinsics.areEqual(this.neutral, intercomColors.neutral) && Intrinsics.areEqual(this.alpha, intercomColors.alpha) && Color.m6040equalsimpl0(this.background, intercomColors.background) && Color.m6040equalsimpl0(this.bubbleBackground, intercomColors.bubbleBackground) && Color.m6040equalsimpl0(this.adminBackground, intercomColors.adminBackground) && Color.m6040equalsimpl0(this.timestampBackground, intercomColors.timestampBackground) && Color.m6040equalsimpl0(this.specialNoticeBackground, intercomColors.specialNoticeBackground) && Color.m6040equalsimpl0(this.sourceBackground, intercomColors.sourceBackground) && Color.m6040equalsimpl0(this.inputAlt, intercomColors.inputAlt) && Color.m6040equalsimpl0(this.poweredByBackgroundColor, intercomColors.poweredByBackgroundColor) && Color.m6040equalsimpl0(this.reminderBackgroundColor, intercomColors.reminderBackgroundColor) && Color.m6040equalsimpl0(this.disabled, intercomColors.disabled) && Color.m6040equalsimpl0(this.primaryText, intercomColors.primaryText) && Color.m6040equalsimpl0(this.descriptionText, intercomColors.descriptionText) && Color.m6040equalsimpl0(this.greetingText, intercomColors.greetingText) && Color.m6040equalsimpl0(this.introText, intercomColors.introText) && Color.m6040equalsimpl0(this.isTyping, intercomColors.isTyping) && Color.m6040equalsimpl0(this.hintText, intercomColors.hintText) && Color.m6040equalsimpl0(this.reminderTextColor, intercomColors.reminderTextColor) && Color.m6040equalsimpl0(this.onDisabled, intercomColors.onDisabled) && Color.m6040equalsimpl0(this.primaryIcon, intercomColors.primaryIcon) && Color.m6040equalsimpl0(this.border, intercomColors.border) && Color.m6040equalsimpl0(this.adminBorder, intercomColors.adminBorder) && Color.m6040equalsimpl0(this.composerBorder, intercomColors.composerBorder) && Color.m6040equalsimpl0(this.collectorBorder, intercomColors.collectorBorder) && Color.m6040equalsimpl0(this.specialNoticeBorder, intercomColors.specialNoticeBorder) && Color.m6040equalsimpl0(this.divider, intercomColors.divider) && Color.m6040equalsimpl0(this.collectorSelected, intercomColors.collectorSelected) && Color.m6040equalsimpl0(this.badge, intercomColors.badge) && Color.m6040equalsimpl0(this.submitted, intercomColors.submitted) && Color.m6040equalsimpl0(this.active, intercomColors.active) && Color.m6040equalsimpl0(this.error, intercomColors.error) && Color.m6040equalsimpl0(this.shadow, intercomColors.shadow) && this.isLight == intercomColors.isLight;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m6046hashCodeimpl(this.action) * 31) + Color.m6046hashCodeimpl(this.onAction)) * 31) + Color.m6046hashCodeimpl(this.actionContrastWhite)) * 31) + Color.m6046hashCodeimpl(this.onActionContrastWhite)) * 31) + Color.m6046hashCodeimpl(this.header)) * 31) + Color.m6046hashCodeimpl(this.onHeader)) * 31) + this.base.hashCode()) * 31) + this.text.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.neutral.hashCode()) * 31) + this.alpha.hashCode()) * 31) + Color.m6046hashCodeimpl(this.background)) * 31) + Color.m6046hashCodeimpl(this.bubbleBackground)) * 31) + Color.m6046hashCodeimpl(this.adminBackground)) * 31) + Color.m6046hashCodeimpl(this.timestampBackground)) * 31) + Color.m6046hashCodeimpl(this.specialNoticeBackground)) * 31) + Color.m6046hashCodeimpl(this.sourceBackground)) * 31) + Color.m6046hashCodeimpl(this.inputAlt)) * 31) + Color.m6046hashCodeimpl(this.poweredByBackgroundColor)) * 31) + Color.m6046hashCodeimpl(this.reminderBackgroundColor)) * 31) + Color.m6046hashCodeimpl(this.disabled)) * 31) + Color.m6046hashCodeimpl(this.primaryText)) * 31) + Color.m6046hashCodeimpl(this.descriptionText)) * 31) + Color.m6046hashCodeimpl(this.greetingText)) * 31) + Color.m6046hashCodeimpl(this.introText)) * 31) + Color.m6046hashCodeimpl(this.isTyping)) * 31) + Color.m6046hashCodeimpl(this.hintText)) * 31) + Color.m6046hashCodeimpl(this.reminderTextColor)) * 31) + Color.m6046hashCodeimpl(this.onDisabled)) * 31) + Color.m6046hashCodeimpl(this.primaryIcon)) * 31) + Color.m6046hashCodeimpl(this.border)) * 31) + Color.m6046hashCodeimpl(this.adminBorder)) * 31) + Color.m6046hashCodeimpl(this.composerBorder)) * 31) + Color.m6046hashCodeimpl(this.collectorBorder)) * 31) + Color.m6046hashCodeimpl(this.specialNoticeBorder)) * 31) + Color.m6046hashCodeimpl(this.divider)) * 31) + Color.m6046hashCodeimpl(this.collectorSelected)) * 31) + Color.m6046hashCodeimpl(this.badge)) * 31) + Color.m6046hashCodeimpl(this.submitted)) * 31) + Color.m6046hashCodeimpl(this.active)) * 31) + Color.m6046hashCodeimpl(this.error)) * 31) + Color.m6046hashCodeimpl(this.shadow)) * 31) + Boolean.hashCode(this.isLight);
    }

    public String toString() {
        return "IntercomColors(action=" + ((Object) Color.m6047toStringimpl(this.action)) + ", onAction=" + ((Object) Color.m6047toStringimpl(this.onAction)) + ", actionContrastWhite=" + ((Object) Color.m6047toStringimpl(this.actionContrastWhite)) + ", onActionContrastWhite=" + ((Object) Color.m6047toStringimpl(this.onActionContrastWhite)) + ", header=" + ((Object) Color.m6047toStringimpl(this.header)) + ", onHeader=" + ((Object) Color.m6047toStringimpl(this.onHeader)) + ", base=" + this.base + ", text=" + this.text + ", icon=" + this.icon + ", neutral=" + this.neutral + ", alpha=" + this.alpha + ", background=" + ((Object) Color.m6047toStringimpl(this.background)) + ", bubbleBackground=" + ((Object) Color.m6047toStringimpl(this.bubbleBackground)) + ", adminBackground=" + ((Object) Color.m6047toStringimpl(this.adminBackground)) + ", timestampBackground=" + ((Object) Color.m6047toStringimpl(this.timestampBackground)) + ", specialNoticeBackground=" + ((Object) Color.m6047toStringimpl(this.specialNoticeBackground)) + ", sourceBackground=" + ((Object) Color.m6047toStringimpl(this.sourceBackground)) + ", inputAlt=" + ((Object) Color.m6047toStringimpl(this.inputAlt)) + ", poweredByBackgroundColor=" + ((Object) Color.m6047toStringimpl(this.poweredByBackgroundColor)) + ", reminderBackgroundColor=" + ((Object) Color.m6047toStringimpl(this.reminderBackgroundColor)) + ", disabled=" + ((Object) Color.m6047toStringimpl(this.disabled)) + ", primaryText=" + ((Object) Color.m6047toStringimpl(this.primaryText)) + ", descriptionText=" + ((Object) Color.m6047toStringimpl(this.descriptionText)) + ", greetingText=" + ((Object) Color.m6047toStringimpl(this.greetingText)) + ", introText=" + ((Object) Color.m6047toStringimpl(this.introText)) + ", isTyping=" + ((Object) Color.m6047toStringimpl(this.isTyping)) + ", hintText=" + ((Object) Color.m6047toStringimpl(this.hintText)) + ", reminderTextColor=" + ((Object) Color.m6047toStringimpl(this.reminderTextColor)) + ", onDisabled=" + ((Object) Color.m6047toStringimpl(this.onDisabled)) + ", primaryIcon=" + ((Object) Color.m6047toStringimpl(this.primaryIcon)) + ", border=" + ((Object) Color.m6047toStringimpl(this.border)) + ", adminBorder=" + ((Object) Color.m6047toStringimpl(this.adminBorder)) + ", composerBorder=" + ((Object) Color.m6047toStringimpl(this.composerBorder)) + ", collectorBorder=" + ((Object) Color.m6047toStringimpl(this.collectorBorder)) + ", specialNoticeBorder=" + ((Object) Color.m6047toStringimpl(this.specialNoticeBorder)) + ", divider=" + ((Object) Color.m6047toStringimpl(this.divider)) + ", collectorSelected=" + ((Object) Color.m6047toStringimpl(this.collectorSelected)) + ", badge=" + ((Object) Color.m6047toStringimpl(this.badge)) + ", submitted=" + ((Object) Color.m6047toStringimpl(this.submitted)) + ", active=" + ((Object) Color.m6047toStringimpl(this.active)) + ", error=" + ((Object) Color.m6047toStringimpl(this.error)) + ", shadow=" + ((Object) Color.m6047toStringimpl(this.shadow)) + ", isLight=" + this.isLight + ')';
    }

    private IntercomColors(long j, long j2, long j3, long j4, long j5, long j6, IntercomBaseColors base, IntercomTextColors text, IntercomIconColors icon, IntercomNeutralColor neutral, IntercomAlphaColors alpha, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, boolean z) {
        Intrinsics.checkNotNullParameter(base, "base");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(neutral, "neutral");
        Intrinsics.checkNotNullParameter(alpha, "alpha");
        this.action = j;
        this.onAction = j2;
        this.actionContrastWhite = j3;
        this.onActionContrastWhite = j4;
        this.header = j5;
        this.onHeader = j6;
        this.base = base;
        this.text = text;
        this.icon = icon;
        this.neutral = neutral;
        this.alpha = alpha;
        this.background = j7;
        this.bubbleBackground = j8;
        this.adminBackground = j9;
        this.timestampBackground = j10;
        this.specialNoticeBackground = j11;
        this.sourceBackground = j12;
        this.inputAlt = j13;
        this.poweredByBackgroundColor = j14;
        this.reminderBackgroundColor = j15;
        this.disabled = j16;
        this.primaryText = j17;
        this.descriptionText = j18;
        this.greetingText = j19;
        this.introText = j20;
        this.isTyping = j21;
        this.hintText = j22;
        this.reminderTextColor = j23;
        this.onDisabled = j24;
        this.primaryIcon = j25;
        this.border = j26;
        this.adminBorder = j27;
        this.composerBorder = j28;
        this.collectorBorder = j29;
        this.specialNoticeBorder = j30;
        this.divider = j31;
        this.collectorSelected = j32;
        this.badge = j33;
        this.submitted = j34;
        this.active = j35;
        this.error = j36;
        this.shadow = j37;
        this.isLight = z;
    }

    /* renamed from: getAction-0d7_KjU, reason: not valid java name */
    public final long m13089getAction0d7_KjU() {
        return this.action;
    }

    /* renamed from: getOnAction-0d7_KjU, reason: not valid java name */
    public final long m13110getOnAction0d7_KjU() {
        return this.onAction;
    }

    /* renamed from: getActionContrastWhite-0d7_KjU, reason: not valid java name */
    public final long m13090getActionContrastWhite0d7_KjU() {
        return this.actionContrastWhite;
    }

    /* renamed from: getOnActionContrastWhite-0d7_KjU, reason: not valid java name */
    public final long m13111getOnActionContrastWhite0d7_KjU() {
        return this.onActionContrastWhite;
    }

    /* renamed from: getHeader-0d7_KjU, reason: not valid java name */
    public final long m13106getHeader0d7_KjU() {
        return this.header;
    }

    /* renamed from: getOnHeader-0d7_KjU, reason: not valid java name */
    public final long m13113getOnHeader0d7_KjU() {
        return this.onHeader;
    }

    public final IntercomBaseColors getBase() {
        return this.base;
    }

    public final IntercomTextColors getText() {
        return this.text;
    }

    public final IntercomIconColors getIcon() {
        return this.icon;
    }

    public final IntercomNeutralColor getNeutral() {
        return this.neutral;
    }

    public final IntercomAlphaColors getAlpha() {
        return this.alpha;
    }

    /* renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m13094getBackground0d7_KjU() {
        return this.background;
    }

    /* renamed from: getBubbleBackground-0d7_KjU, reason: not valid java name */
    public final long m13097getBubbleBackground0d7_KjU() {
        return this.bubbleBackground;
    }

    /* renamed from: getAdminBackground-0d7_KjU, reason: not valid java name */
    public final long m13092getAdminBackground0d7_KjU() {
        return this.adminBackground;
    }

    /* renamed from: getTimestampBackground-0d7_KjU, reason: not valid java name */
    public final long m13124getTimestampBackground0d7_KjU() {
        return this.timestampBackground;
    }

    /* renamed from: getSpecialNoticeBackground-0d7_KjU, reason: not valid java name */
    public final long m13121getSpecialNoticeBackground0d7_KjU() {
        return this.specialNoticeBackground;
    }

    /* renamed from: getSourceBackground-0d7_KjU, reason: not valid java name */
    public final long m13120getSourceBackground0d7_KjU() {
        return this.sourceBackground;
    }

    /* renamed from: getInputAlt-0d7_KjU, reason: not valid java name */
    public final long m13108getInputAlt0d7_KjU() {
        return this.inputAlt;
    }

    /* renamed from: getPoweredByBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m13114getPoweredByBackgroundColor0d7_KjU() {
        return this.poweredByBackgroundColor;
    }

    /* renamed from: getReminderBackgroundColor-0d7_KjU, reason: not valid java name */
    public final long m13117getReminderBackgroundColor0d7_KjU() {
        return this.reminderBackgroundColor;
    }

    /* renamed from: getDisabled-0d7_KjU, reason: not valid java name */
    public final long m13102getDisabled0d7_KjU() {
        return this.disabled;
    }

    /* renamed from: getPrimaryText-0d7_KjU, reason: not valid java name */
    public final long m13116getPrimaryText0d7_KjU() {
        return this.primaryText;
    }

    /* renamed from: getDescriptionText-0d7_KjU, reason: not valid java name */
    public final long m13101getDescriptionText0d7_KjU() {
        return this.descriptionText;
    }

    /* renamed from: getGreetingText-0d7_KjU, reason: not valid java name */
    public final long m13105getGreetingText0d7_KjU() {
        return this.greetingText;
    }

    /* renamed from: getIntroText-0d7_KjU, reason: not valid java name */
    public final long m13109getIntroText0d7_KjU() {
        return this.introText;
    }

    /* renamed from: isTyping-0d7_KjU, reason: not valid java name */
    public final long m13125isTyping0d7_KjU() {
        return this.isTyping;
    }

    /* renamed from: getHintText-0d7_KjU, reason: not valid java name */
    public final long m13107getHintText0d7_KjU() {
        return this.hintText;
    }

    /* renamed from: getReminderTextColor-0d7_KjU, reason: not valid java name */
    public final long m13118getReminderTextColor0d7_KjU() {
        return this.reminderTextColor;
    }

    /* renamed from: getOnDisabled-0d7_KjU, reason: not valid java name */
    public final long m13112getOnDisabled0d7_KjU() {
        return this.onDisabled;
    }

    /* renamed from: getPrimaryIcon-0d7_KjU, reason: not valid java name */
    public final long m13115getPrimaryIcon0d7_KjU() {
        return this.primaryIcon;
    }

    /* renamed from: getBorder-0d7_KjU, reason: not valid java name */
    public final long m13096getBorder0d7_KjU() {
        return this.border;
    }

    /* renamed from: getAdminBorder-0d7_KjU, reason: not valid java name */
    public final long m13093getAdminBorder0d7_KjU() {
        return this.adminBorder;
    }

    /* renamed from: getComposerBorder-0d7_KjU, reason: not valid java name */
    public final long m13100getComposerBorder0d7_KjU() {
        return this.composerBorder;
    }

    /* renamed from: getCollectorBorder-0d7_KjU, reason: not valid java name */
    public final long m13098getCollectorBorder0d7_KjU() {
        return this.collectorBorder;
    }

    /* renamed from: getSpecialNoticeBorder-0d7_KjU, reason: not valid java name */
    public final long m13122getSpecialNoticeBorder0d7_KjU() {
        return this.specialNoticeBorder;
    }

    /* renamed from: getDivider-0d7_KjU, reason: not valid java name */
    public final long m13103getDivider0d7_KjU() {
        return this.divider;
    }

    /* renamed from: getCollectorSelected-0d7_KjU, reason: not valid java name */
    public final long m13099getCollectorSelected0d7_KjU() {
        return this.collectorSelected;
    }

    /* renamed from: getBadge-0d7_KjU, reason: not valid java name */
    public final long m13095getBadge0d7_KjU() {
        return this.badge;
    }

    /* renamed from: getSubmitted-0d7_KjU, reason: not valid java name */
    public final long m13123getSubmitted0d7_KjU() {
        return this.submitted;
    }

    /* renamed from: getActive-0d7_KjU, reason: not valid java name */
    public final long m13091getActive0d7_KjU() {
        return this.active;
    }

    /* renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m13104getError0d7_KjU() {
        return this.error;
    }

    /* renamed from: getShadow-0d7_KjU, reason: not valid java name */
    public final long m13119getShadow0d7_KjU() {
        return this.shadow;
    }

    public final boolean isLight() {
        return this.isLight;
    }
}
