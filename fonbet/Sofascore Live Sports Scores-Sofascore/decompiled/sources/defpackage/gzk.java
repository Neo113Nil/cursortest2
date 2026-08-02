package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.BlazePlayerInInlineDelegate;
import com.blaze.blazesdk.delegates.BlazePlayerSourceDelegate;
import com.blaze.blazesdk.delegates.models.BlazeCTAActionType;
import com.blaze.blazesdk.delegates.models.BlazePlayerEvent;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.delegates.models.BlazeShareParams;
import com.blaze.blazesdk.delegates.models.b;
import com.blaze.blazesdk.delegates.models.d;
import com.blaze.blazesdk.features.search.models.BlazeSearchHandleType;
import com.blaze.blazesdk.features.search.models.BlazeSearchScreenParams;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLinkActionHandleType;
import com.blaze.blazesdk.features.shared.models.ui_shared.i;
import com.blaze.blazesdk.logger.ShareLogId;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.BlazeScreens;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.ErrorDomain;
import com.blaze.blazesdk.shared.results.ErrorReason;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class gzk {
    public static final gzk a = new gzk();
    public static final CopyOnWriteArrayList b = new CopyOnWriteArrayList(new ArrayList());

    public static final void a(Intent intent, String str, yql yqlVar) {
        Parcelable parcelable;
        Object obj;
        if (yqlVar != null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("internal_player_broadcast_event_type", b.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("internal_player_broadcast_event_type");
                if (!(parcelableExtra instanceof b)) {
                    parcelableExtra = null;
                }
                parcelable = (b) parcelableExtra;
            }
            b bVar = (b) parcelable;
            if (bVar != null) {
                int ordinal = bVar.ordinal();
                if (ordinal == 0) {
                    zl6 zl6Var = new zl6(yqlVar);
                    intent.getClass();
                    str.getClass();
                    try {
                        if (i > 33) {
                            obj = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                        } else {
                            Parcelable parcelableExtra2 = intent.getParcelableExtra("player_type");
                            if (!(parcelableExtra2 instanceof BlazePlayerType)) {
                                parcelableExtra2 = null;
                            }
                            obj = (BlazePlayerType) parcelableExtra2;
                        }
                        BlazePlayerType blazePlayerType = (BlazePlayerType) obj;
                        if (blazePlayerType == null) {
                            return;
                        }
                        zl6Var.invoke(blazePlayerType, wyd.a(str, intent, false), Boolean.valueOf(intent.getBooleanExtra("on_player_minimized_maximize_change", false)));
                        return;
                    } catch (Throwable th) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                        return;
                    }
                }
                if (ordinal == 1) {
                    fu8 fu8Var = new fu8(yqlVar);
                    intent.getClass();
                    str.getClass();
                    try {
                        fu8Var.invoke(wyd.a(str, intent, false));
                        return;
                    } catch (Throwable th2) {
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                        return;
                    }
                }
                if (ordinal != 2) {
                    zzl.b();
                    return;
                }
                q59 q59Var = new q59(yqlVar);
                intent.getClass();
                try {
                    String stringExtra = intent.getStringExtra("internal_share_result_link_key");
                    if (stringExtra == null) {
                        return;
                    }
                    q59Var.invoke(stringExtra);
                } catch (Throwable th3) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                }
            }
        }
    }

    public static final void b(Intent intent, String str, BlazePlayerSourceDelegate blazePlayerSourceDelegate, ErrorDomain errorDomain, Context context) {
        Parcelable parcelable;
        Parcelable parcelable2;
        BlazeCTAActionType blazeCTAActionType;
        Parcelable parcelable3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Parcelable parcelable4;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Parcelable parcelable5;
        Parcelable parcelable6;
        if (blazePlayerSourceDelegate != null) {
            int i = Build.VERSION.SDK_INT;
            if (i > 33) {
                parcelable = (Parcelable) intent.getParcelableExtra("player_broadcast_event_type", d.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra("player_broadcast_event_type");
                if (!(parcelableExtra instanceof d)) {
                    parcelableExtra = null;
                }
                parcelable = (d) parcelableExtra;
            }
            d dVar = (d) parcelable;
            if (dVar != null) {
                int i2 = 2;
                switch (dVar.ordinal()) {
                    case 0:
                        r2d r2dVar = new r2d(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                parcelable2 = (Parcelable) intent.getParcelableExtra("on_trigger_cta_key_cta_model", i.class);
                            } else {
                                Parcelable parcelableExtra2 = intent.getParcelableExtra("on_trigger_cta_key_cta_model");
                                if (!(parcelableExtra2 instanceof i)) {
                                    parcelableExtra2 = null;
                                }
                                parcelable2 = (i) parcelableExtra2;
                            }
                            i iVar = (i) parcelable2;
                            if (iVar == null) {
                                return;
                            }
                            String str2 = iVar.c;
                            BlazeLinkActionHandleType blazeLinkActionHandleType = iVar.a;
                            if (blazeLinkActionHandleType != null) {
                                int i3 = tzl.a[blazeLinkActionHandleType.ordinal()];
                                if (i3 == 1) {
                                    blazeCTAActionType = BlazeCTAActionType.WEB;
                                } else if (i3 != 2) {
                                    if (i3 != 3 && i3 != 4) {
                                        throw new ndd();
                                    }
                                    blazeCTAActionType = null;
                                } else {
                                    blazeCTAActionType = BlazeCTAActionType.DEEPLINK;
                                }
                                if (blazeCTAActionType == null) {
                                    return;
                                }
                                if (i > 33) {
                                    parcelable3 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                                } else {
                                    Parcelable parcelableExtra3 = intent.getParcelableExtra("player_type");
                                    if (!(parcelableExtra3 instanceof BlazePlayerType)) {
                                        parcelableExtra3 = null;
                                    }
                                    parcelable3 = (BlazePlayerType) parcelableExtra3;
                                }
                                BlazePlayerType blazePlayerType = (BlazePlayerType) parcelable3;
                                if (blazePlayerType == null || ((Boolean) r2dVar.invoke(blazePlayerType, wyd.a(str, intent, false), blazeCTAActionType, str2)).booleanValue()) {
                                    return;
                                }
                                int i4 = fjd.a[blazeLinkActionHandleType.ordinal()];
                                if (i4 == 1) {
                                    if (context != null) {
                                        cnb.d(context, str2);
                                        return;
                                    }
                                    return;
                                } else {
                                    if (i4 == 2 && context != null) {
                                        cnb.e(context, str2, iVar.b);
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                            return;
                        }
                    case 1:
                        jjd jjdVar = new jjd(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            String stringExtra = intent.getStringExtra("on_trigger_body_text_link_key");
                            if (stringExtra == null) {
                                return;
                            }
                            if (i > 33) {
                                obj = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra4 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra4 instanceof BlazePlayerType)) {
                                    parcelableExtra4 = null;
                                }
                                obj = (BlazePlayerType) parcelableExtra4;
                            }
                            BlazePlayerType blazePlayerType2 = (BlazePlayerType) obj;
                            if (blazePlayerType2 == null) {
                                return;
                            }
                            int i5 = fjd.a[((BlazeLinkActionHandleType) jjdVar.invoke(blazePlayerType2, wyd.a(str, intent, false), stringExtra)).ordinal()];
                            if (i5 == -1 || i5 == 1) {
                                if (context != null) {
                                    cnb.d(context, stringExtra);
                                    return;
                                }
                                return;
                            } else if (i5 != 2) {
                                if (i5 != 3 && i5 != 4) {
                                    throw new ndd();
                                }
                                return;
                            } else {
                                if (context != null) {
                                    cnb.openWebLink$default(context, stringExtra, null, 2, null);
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th2) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                            return;
                        }
                    case 2:
                        gnb gnbVar = new gnb(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                obj2 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra5 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra5 instanceof BlazePlayerType)) {
                                    parcelableExtra5 = null;
                                }
                                obj2 = (BlazePlayerType) parcelableExtra5;
                            }
                            BlazePlayerType blazePlayerType3 = (BlazePlayerType) obj2;
                            if (blazePlayerType3 == null) {
                                return;
                            }
                            gnbVar.invoke(blazePlayerType3, wyd.a(str, intent, false));
                            return;
                        } catch (Throwable th3) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th3, null);
                            return;
                        }
                    case 3:
                        qka qkaVar = new qka(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                obj3 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra6 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra6 instanceof BlazePlayerType)) {
                                    parcelableExtra6 = null;
                                }
                                obj3 = (BlazePlayerType) parcelableExtra6;
                            }
                            BlazePlayerType blazePlayerType4 = (BlazePlayerType) obj3;
                            if (blazePlayerType4 == null) {
                                return;
                            }
                            qkaVar.invoke(blazePlayerType4, wyd.a(str, intent, false));
                            return;
                        } catch (Throwable th4) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th4, null);
                            return;
                        }
                    case 4:
                        azd azdVar = new azd(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                obj4 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra7 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra7 instanceof BlazePlayerType)) {
                                    parcelableExtra7 = null;
                                }
                                obj4 = (BlazePlayerType) parcelableExtra7;
                            }
                            BlazePlayerType blazePlayerType5 = (BlazePlayerType) obj4;
                            if (blazePlayerType5 == null) {
                                return;
                            }
                            azdVar.invoke(blazePlayerType5, wyd.a(str, intent, true));
                            return;
                        } catch (Throwable th5) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th5, null);
                            return;
                        }
                    case 5:
                        fif fifVar = new fif(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        errorDomain.getClass();
                        try {
                            if (i > 33) {
                                obj5 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra8 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra8 instanceof BlazePlayerType)) {
                                    parcelableExtra8 = null;
                                }
                                obj5 = (BlazePlayerType) parcelableExtra8;
                            }
                            BlazePlayerType blazePlayerType6 = (BlazePlayerType) obj5;
                            if (blazePlayerType6 == null) {
                                return;
                            }
                            int intExtra = intent.getIntExtra("on_trigger_data_load_completed_item_counts_key", 0);
                            if (i > 33) {
                                parcelable4 = (Parcelable) intent.getParcelableExtra("on_trigger_data_load_completed_error_reason_key", ErrorReason.class);
                            } else {
                                Parcelable parcelableExtra9 = intent.getParcelableExtra("on_trigger_data_load_completed_error_reason_key");
                                if (!(parcelableExtra9 instanceof ErrorReason)) {
                                    parcelableExtra9 = null;
                                }
                                parcelable4 = (ErrorReason) parcelableExtra9;
                            }
                            ErrorReason errorReason = (ErrorReason) parcelable4;
                            fifVar.invoke(blazePlayerType6, wyd.a(str, intent, true), Integer.valueOf(intExtra), errorReason != null ? new BlazeResult.Error(null, errorDomain, errorReason, intent.getStringExtra("on_trigger_data_load_completed_error_message_key"), null, null, 49, null) : new BlazeResult.Success(Unit.a));
                            return;
                        } catch (Throwable th6) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th6, null);
                            return;
                        }
                    case 6:
                        gag gagVar = new gag(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                obj6 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra10 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra10 instanceof BlazePlayerType)) {
                                    parcelableExtra10 = null;
                                }
                                obj6 = (BlazePlayerType) parcelableExtra10;
                            }
                            BlazePlayerType blazePlayerType7 = (BlazePlayerType) obj6;
                            if (blazePlayerType7 == null) {
                                return;
                            }
                            if (i > 33) {
                                obj7 = (Parcelable) intent.getParcelableExtra("player_broadcast_on_event_triggered", BlazePlayerEvent.class);
                            } else {
                                Parcelable parcelableExtra11 = intent.getParcelableExtra("player_broadcast_on_event_triggered");
                                if (!(parcelableExtra11 instanceof BlazePlayerEvent)) {
                                    parcelableExtra11 = null;
                                }
                                obj7 = (BlazePlayerEvent) parcelableExtra11;
                            }
                            BlazePlayerEvent blazePlayerEvent = (BlazePlayerEvent) obj7;
                            if (blazePlayerEvent == null) {
                                return;
                            }
                            gagVar.invoke(blazePlayerType7, wyd.a(str, intent, false), blazePlayerEvent);
                            return;
                        } catch (Throwable th7) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th7, null);
                            return;
                        }
                    case 7:
                        nri nriVar = new nri(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                obj8 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra12 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra12 instanceof BlazePlayerType)) {
                                    parcelableExtra12 = null;
                                }
                                obj8 = (BlazePlayerType) parcelableExtra12;
                            }
                            BlazePlayerType blazePlayerType8 = (BlazePlayerType) obj8;
                            if (blazePlayerType8 == null) {
                                return;
                            }
                            if (i > 33) {
                                obj9 = (Parcelable) intent.getParcelableExtra("on_custom_action_button_params_key", BlazePlayerCustomActionButtonParams.class);
                            } else {
                                Parcelable parcelableExtra13 = intent.getParcelableExtra("on_custom_action_button_params_key");
                                if (!(parcelableExtra13 instanceof BlazePlayerCustomActionButtonParams)) {
                                    parcelableExtra13 = null;
                                }
                                obj9 = (BlazePlayerCustomActionButtonParams) parcelableExtra13;
                            }
                            BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams = (BlazePlayerCustomActionButtonParams) obj9;
                            if (blazePlayerCustomActionButtonParams == null) {
                                return;
                            }
                            nriVar.invoke(blazePlayerType8, wyd.a(str, intent, false), blazePlayerCustomActionButtonParams);
                            return;
                        } catch (Throwable th8) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th8, null);
                            return;
                        }
                    case 8:
                        m7k m7kVar = new m7k(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                obj10 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra14 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra14 instanceof BlazePlayerType)) {
                                    parcelableExtra14 = null;
                                }
                                obj10 = (BlazePlayerType) parcelableExtra14;
                            }
                            BlazePlayerType blazePlayerType9 = (BlazePlayerType) obj10;
                            if (blazePlayerType9 == null) {
                                return;
                            }
                            String a2 = wyd.a(str, intent, false);
                            String stringExtra2 = intent.getStringExtra("on_search_button_data_source_registry_key");
                            BlazeDataSourceType blazeDataSourceType = stringExtra2 != null ? (BlazeDataSourceType) q6m.a.remove(stringExtra2) : null;
                            BlazeSearchHandleType blazeSearchHandleType = (BlazeSearchHandleType) m7kVar.invoke(blazePlayerType9, a2);
                            if (blazeSearchHandleType instanceof BlazeSearchHandleType.BySDK) {
                                BlazeScreens.showSearchScreen$default(BlazeSDK.INSTANCE.getScreens(), ((BlazeSearchHandleType.BySDK) blazeSearchHandleType).getSearchScreenParams(), null, 2, null);
                                return;
                            }
                            if (blazeSearchHandleType instanceof BlazeSearchHandleType.ByApp) {
                                return;
                            }
                            if (blazeSearchHandleType != null) {
                                throw new ndd();
                            }
                            if (blazeDataSourceType != null) {
                                BlazeScreens.showSearchScreen$default(BlazeSDK.INSTANCE.getScreens(), new BlazeSearchScreenParams(blazeDataSourceType), null, 2, null);
                                return;
                            }
                            return;
                        } catch (Throwable th9) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th9, null);
                            return;
                        }
                    case 9:
                        BlazePlayerInInlineDelegate blazePlayerInInlineDelegate = blazePlayerSourceDelegate instanceof BlazePlayerInInlineDelegate ? (BlazePlayerInInlineDelegate) blazePlayerSourceDelegate : null;
                        if (blazePlayerInInlineDelegate != null) {
                            wl9 wl9Var = new wl9(blazePlayerInInlineDelegate);
                            intent.getClass();
                            str.getClass();
                            try {
                                if (i > 33) {
                                    obj11 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                                } else {
                                    Parcelable parcelableExtra15 = intent.getParcelableExtra("player_type");
                                    if (!(parcelableExtra15 instanceof BlazePlayerType)) {
                                        parcelableExtra15 = null;
                                    }
                                    obj11 = (BlazePlayerType) parcelableExtra15;
                                }
                                BlazePlayerType blazePlayerType10 = (BlazePlayerType) obj11;
                                if (blazePlayerType10 == null) {
                                    return;
                                }
                                wl9Var.invoke(blazePlayerType10, wyd.a(str, intent, false));
                                return;
                            } catch (Throwable th10) {
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th10, null);
                                return;
                            }
                        }
                        return;
                    case 10:
                        BlazePlayerInInlineDelegate blazePlayerInInlineDelegate2 = blazePlayerSourceDelegate instanceof BlazePlayerInInlineDelegate ? (BlazePlayerInInlineDelegate) blazePlayerSourceDelegate : null;
                        if (blazePlayerInInlineDelegate2 != null) {
                            bda bdaVar = new bda(blazePlayerInInlineDelegate2);
                            intent.getClass();
                            str.getClass();
                            try {
                                if (i > 33) {
                                    obj12 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                                } else {
                                    Parcelable parcelableExtra16 = intent.getParcelableExtra("player_type");
                                    if (!(parcelableExtra16 instanceof BlazePlayerType)) {
                                        parcelableExtra16 = null;
                                    }
                                    obj12 = (BlazePlayerType) parcelableExtra16;
                                }
                                BlazePlayerType blazePlayerType11 = (BlazePlayerType) obj12;
                                if (blazePlayerType11 == null) {
                                    return;
                                }
                                bdaVar.invoke(blazePlayerType11, wyd.a(str, intent, false));
                                return;
                            } catch (Throwable th11) {
                                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th11, null);
                                return;
                            }
                        }
                        return;
                    case 11:
                        cia ciaVar = new cia(blazePlayerSourceDelegate);
                        intent.getClass();
                        str.getClass();
                        try {
                            if (i > 33) {
                                parcelable5 = (Parcelable) intent.getParcelableExtra("on_trigger_share_key_share_params", BlazeShareParams.class);
                            } else {
                                Parcelable parcelableExtra17 = intent.getParcelableExtra("on_trigger_share_key_share_params");
                                if (!(parcelableExtra17 instanceof BlazeShareParams)) {
                                    parcelableExtra17 = null;
                                }
                                parcelable5 = (BlazeShareParams) parcelableExtra17;
                            }
                            BlazeShareParams blazeShareParams = (BlazeShareParams) parcelable5;
                            if (blazeShareParams == null) {
                                return;
                            }
                            if (i > 33) {
                                parcelable6 = (Parcelable) intent.getParcelableExtra("player_type", BlazePlayerType.class);
                            } else {
                                Parcelable parcelableExtra18 = intent.getParcelableExtra("player_type");
                                if (!(parcelableExtra18 instanceof BlazePlayerType)) {
                                    parcelableExtra18 = null;
                                }
                                parcelable6 = (BlazePlayerType) parcelableExtra18;
                            }
                            BlazePlayerType blazePlayerType12 = (BlazePlayerType) parcelable6;
                            if (blazePlayerType12 == null) {
                                return;
                            }
                            String str3 = (String) ciaVar.invoke(blazePlayerType12, wyd.a(str, intent, false), blazeShareParams);
                            String sdkGeneratedLink = str3 == null ? blazeShareParams.getSdkGeneratedLink() : str3;
                            if (str3 != null) {
                                ShareLogId shareLogId = ShareLogId.APP_OVERRIDDEN_LINK;
                                o40 o40Var = new o40(sdkGeneratedLink, i2);
                                shareLogId.getClass();
                                lwl.a(shareLogId, vul.INFO, o40Var);
                            }
                            if (context != null) {
                                Intent intent2 = new Intent("player_broadcast");
                                intent2.putExtra("on_trigger_key_broadcaster_id", str);
                                intent2.putExtra("internal_player_broadcast_event_type", (Parcelable) b.SHARE_RESULT);
                                intent2.putExtra("internal_share_result_link_key", sdkGeneratedLink);
                                LocalBroadcastManager.getInstance(context).sendBroadcast(intent2);
                                return;
                            }
                            return;
                        } catch (Throwable th12) {
                            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th12, null);
                            return;
                        }
                    default:
                        zzl.b();
                        return;
                }
            }
        }
    }

    public static void c(BlazePlayerType blazePlayerType, String str, String str2) {
        blazePlayerType.getClass();
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        Application application$blazesdk_release = blazeSDK.getApplication$blazesdk_release();
        if (application$blazesdk_release == null) {
            blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(otl.a, null);
            return;
        }
        try {
            Intent intent = new Intent("player_broadcast");
            intent.putExtra("player_broadcast_client_source_id", str2);
            intent.putExtra("on_trigger_key_broadcaster_id", str);
            intent.putExtra("player_type", (Parcelable) blazePlayerType);
            intent.putExtra("player_broadcast_event_type", (Parcelable) d.PLAYER_DISMISSED);
            LocalBroadcastManager.getInstance(application$blazesdk_release).sendBroadcast(intent);
            b.add(intent);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static BroadcastReceiver createPlayerBroadcastReceiver$blazesdk_release$default(gzk gzkVar, String str, BlazePlayerSourceDelegate blazePlayerSourceDelegate, ErrorDomain errorDomain, yql yqlVar, int i, Object obj) {
        if ((i & 8) != 0) {
            yqlVar = null;
        }
        gzkVar.getClass();
        str.getClass();
        errorDomain.getClass();
        return new nf5(str, blazePlayerSourceDelegate, errorDomain, yqlVar);
    }

    public static void d(String str, BlazePlayerSourceDelegate blazePlayerSourceDelegate, ErrorDomain errorDomain, Intent intent, Context context, yql yqlVar) {
        str.getClass();
        errorDomain.getClass();
        if (Intrinsics.c(intent != null ? intent.getAction() : null, "player_broadcast") && Intrinsics.c(intent.getStringExtra("on_trigger_key_broadcaster_id"), str)) {
            b.remove(intent);
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, null, new sjk(intent, str, blazePlayerSourceDelegate, errorDomain, context, yqlVar, null), 1, null);
        }
    }

    public static void e(String str, BlazePlayerType blazePlayerType, BlazePlayerEvent blazePlayerEvent, String str2) {
        blazePlayerType.getClass();
        try {
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            if (application$blazesdk_release != null) {
                Intent intent = new Intent("player_broadcast");
                intent.putExtra("player_broadcast_client_source_id", str2);
                intent.putExtra("on_trigger_key_broadcaster_id", str);
                intent.putExtra("player_type", (Parcelable) blazePlayerType);
                intent.putExtra("player_broadcast_event_type", (Parcelable) d.ON_PLAYER_EVENT_TRIGGERED);
                intent.putExtra("player_broadcast_on_event_triggered", blazePlayerEvent);
                LocalBroadcastManager.getInstance(application$blazesdk_release).sendBroadcast(intent);
                b.add(intent);
            }
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void f(String str, String str2, BlazePlayerType blazePlayerType, int i, String str3, ErrorReason errorReason, String str4) {
        str.getClass();
        str2.getClass();
        blazePlayerType.getClass();
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        Application application$blazesdk_release = blazeSDK.getApplication$blazesdk_release();
        if (application$blazesdk_release == null) {
            blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(otl.a, null);
            return;
        }
        try {
            Intent intent = new Intent("player_broadcast");
            intent.putExtra("player_broadcast_client_source_id", str3);
            intent.putExtra("on_trigger_key_broadcaster_id", str);
            intent.putExtra("player_broadcast_data_source_representation", str2);
            if (blazePlayerType == null) {
                blazePlayerType = null;
            }
            intent.putExtra("player_type", (Parcelable) blazePlayerType);
            intent.putExtra("on_trigger_data_load_completed_item_counts_key", i);
            if (errorReason == null) {
                errorReason = null;
            }
            intent.putExtra("on_trigger_data_load_completed_error_reason_key", (Parcelable) errorReason);
            intent.putExtra("on_trigger_data_load_completed_error_message_key", str4);
            intent.putExtra("player_broadcast_event_type", (Parcelable) d.DATA_LOAD_COMPLETED);
            LocalBroadcastManager.getInstance(application$blazesdk_release).sendBroadcast(intent);
            b.add(intent);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static void g(String str, String str2, BlazePlayerType blazePlayerType, String str3) {
        str.getClass();
        str2.getClass();
        blazePlayerType.getClass();
        BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
        Application application$blazesdk_release = blazeSDK.getApplication$blazesdk_release();
        if (application$blazesdk_release == null) {
            blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(otl.a, null);
            return;
        }
        try {
            Intent intent = new Intent("player_broadcast");
            intent.putExtra("player_broadcast_client_source_id", str3);
            intent.putExtra("on_trigger_key_broadcaster_id", str);
            intent.putExtra("player_broadcast_data_source_representation", str2);
            if (blazePlayerType == null) {
                blazePlayerType = null;
            }
            intent.putExtra("player_type", (Parcelable) blazePlayerType);
            intent.putExtra("player_broadcast_event_type", (Parcelable) d.DATA_LOAD_STARTED);
            LocalBroadcastManager.getInstance(application$blazesdk_release).sendBroadcast(intent);
            b.add(intent);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    public static /* synthetic */ void globalBroadcastDataLoadCompleted$default(gzk gzkVar, String str, String str2, BlazePlayerType blazePlayerType, int i, String str3, ErrorReason errorReason, String str4, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            errorReason = null;
        }
        if ((i2 & 64) != 0) {
            str4 = null;
        }
        gzkVar.getClass();
        f(str, str2, blazePlayerType, i, str3, errorReason, str4);
    }

    public static void handleUnhandledEvents$blazesdk_release$default(gzk gzkVar, String str, BlazePlayerSourceDelegate blazePlayerSourceDelegate, ErrorDomain errorDomain, Context context, yql yqlVar, int i, Object obj) {
        if ((i & 16) != 0) {
            yqlVar = null;
        }
        yql yqlVar2 = yqlVar;
        gzkVar.getClass();
        str.getClass();
        errorDomain.getClass();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            d(str, blazePlayerSourceDelegate, errorDomain, (Intent) it.next(), context, yqlVar2);
        }
    }
}
