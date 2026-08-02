package com.socure.docv.capturesdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UnstructuredModuleModel.kt */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0003\b\u008b\u0001\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\bØ\u0001Ù\u0001Ú\u0001Û\u0001Bé\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010*\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0005\u0012\b\u00100\u001a\u0004\u0018\u00010\u0005\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\u00102\u001a\u0004\u0018\u00010\u0005\u0012\b\u00103\u001a\u0004\u0018\u00010\u0005\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\b\u00105\u001a\u0004\u0018\u00010\u0005\u0012\b\u00106\u001a\u0004\u0018\u00010\u0005\u0012\b\u00107\u001a\u0004\u0018\u00010\u0005\u0012\b\u00108\u001a\u0004\u0018\u00010\u0005\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010B\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010C\u001a\u0004\u0018\u00010D\u0012\b\u0010E\u001a\u0004\u0018\u00010\f\u0012\b\u0010F\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010HJ\n\u0010\u008f\u0001\u001a\u00020\u0005HÆ\u0003J\f\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\f\u0010\u009f\u0001\u001a\u0004\u0018\u00010 HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¡\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¢\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010£\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¤\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010¥\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010®\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010³\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010´\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010µ\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¶\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010·\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¸\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¹\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010º\u0001\u001a\u0004\u0018\u00010:HÆ\u0003J\u0010\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\f\u0010¼\u0001\u001a\u0004\u0018\u00010<HÆ\u0003J\f\u0010½\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¾\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010À\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Â\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010Ã\u0001\u001a\u0004\u0018\u00010DHÆ\u0003¢\u0006\u0003\u0010\u008a\u0001J\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010VJ\u0011\u0010Å\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010VJ\u0011\u0010Æ\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010VJ\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010È\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010VJ\f\u0010É\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010Ê\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jê\u0005\u0010Ë\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00109\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010C\u001a\u0004\u0018\u00010D2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0003\u0010Ì\u0001J\n\u0010Í\u0001\u001a\u00020\fHÖ\u0001J\u0016\u0010Î\u0001\u001a\u00020D2\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u0001HÖ\u0003J\n\u0010Ñ\u0001\u001a\u00020\fHÖ\u0001J\n\u0010Ò\u0001\u001a\u00020\u0005HÖ\u0001J\u001e\u0010Ó\u0001\u001a\u00030Ô\u00012\b\u0010Õ\u0001\u001a\u00030Ö\u00012\u0007\u0010×\u0001\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010,\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bK\u0010JR\u0013\u00107\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bL\u0010JR\u0013\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010JR\u0013\u0010'\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bN\u0010JR\u0013\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bO\u0010JR\u0013\u0010*\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bP\u0010JR\u0013\u0010/\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010JR\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bR\u0010JR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010W\u001a\u0004\bU\u0010VR\u0013\u0010+\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bX\u0010JR\u0013\u00100\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bY\u0010JR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010JR\u0015\u0010E\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010W\u001a\u0004\b[\u0010VR\u0013\u00104\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010JR\u0013\u0010.\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010JR\u0013\u00108\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b^\u0010JR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b_\u0010JR\u0013\u0010=\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b`\u0010JR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\ba\u0010JR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bb\u0010JR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010JR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\bd\u0010TR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010JR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0013\u00102\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bh\u0010JR\u0013\u00105\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bi\u0010JR\u0013\u0010$\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bj\u0010JR\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bk\u0010JR\u0013\u00106\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bl\u0010JR\u0013\u0010&\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bm\u0010JR\u0013\u0010\u001f\u001a\u0004\u0018\u00010 ¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bp\u0010JR\u0013\u00103\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bq\u0010JR\u0013\u0010>\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\br\u0010JR\u0013\u0010@\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bs\u0010JR\u0013\u0010B\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bt\u0010JR\u0013\u0010A\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bu\u0010JR\u0013\u0010?\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bv\u0010JR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bw\u0010JR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bx\u0010yR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bz\u0010JR\u0013\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b{\u0010JR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b|\u0010JR\u0013\u0010)\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b}\u0010JR\u0016\u0010G\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010JR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010JR\u0015\u0010;\u001a\u0004\u0018\u00010<¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010JR\u0014\u00101\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010JR\u0016\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u000b\n\u0002\u0010W\u001a\u0005\b\u0084\u0001\u0010VR\u0016\u0010F\u001a\u0004\u0018\u00010\f¢\u0006\u000b\n\u0002\u0010W\u001a\u0005\b\u0085\u0001\u0010VR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010JR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010JR\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010JR\u0018\u0010C\u001a\u0004\u0018\u00010D¢\u0006\r\n\u0003\u0010\u008b\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0014\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010JR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010TR\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010J¨\u0006Ü\u0001"}, d2 = {"Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "Lcom/socure/docv/capturesdk/models/ModuleModel;", "Landroid/os/Parcelable;", "Lcom/socure/docv/capturesdk/models/ScannerModel;", "moduleId", "", "sessionToken", "documentTypes", "", "collectionMethods", "uploadFileTypes", "completedModuleCount", "", "totalModuleCount", "currentDocument", "documentNumber", "documentUploadCounter", "numOfDocuments", "document", "submitButton", "retryButton", "uploading", "success", "additionalInstructions", "documentCollectionTitle", "documentPreviewTitle", "transitionHeaderText", "transitionInstructionsPrimaryText", "transitionInstructionsSecondaryText", "error", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$ErrorLabels;", "mobile", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$MobileLabels;", "captureSuccess", "scanning", "tryPhotoManually", "haveDocReady", "keepSteady", "manualSecondary", "cameraLoading", "cameraIssue", "startMode", "captureMode", "confirmMode", "backToScanning", "captureCompatibilityCheck", "defaultDocumentTitle", "capturePageTitle", "confirmPageTitle", "toGetStarted", "errorMessage", "moveAreaError", "darkImageError", "glareError", "manualPrimary", "blurErrorSecondary", "defaultIvsError", "previewMessages", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$PreviewMessages;", "submitButtonMessages", "Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$SubmitButtonMessages;", "documentCameraPermission", "movePhoneBack", "movePhoneUp", "movePhoneDown", "movePhoneRight", "movePhoneLeft", "transitionScreenEnabled", "", "currentVerificationCount", "totalVerificationCount", "submissionErrorMessage", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$ErrorLabels;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$MobileLabels;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$PreviewMessages;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$SubmitButtonMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getAdditionalInstructions", "()Ljava/lang/String;", "getBackToScanning", "getBlurErrorSecondary", "getCameraIssue", "getCameraLoading", "getCaptureCompatibilityCheck", "getCaptureMode", "getCapturePageTitle", "getCaptureSuccess", "getCollectionMethods", "()Ljava/util/List;", "getCompletedModuleCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getConfirmMode", "getConfirmPageTitle", "getCurrentDocument", "getCurrentVerificationCount", "getDarkImageError", "getDefaultDocumentTitle", "getDefaultIvsError", "getDocument", "getDocumentCameraPermission", "getDocumentCollectionTitle", "getDocumentNumber", "getDocumentPreviewTitle", "getDocumentTypes", "getDocumentUploadCounter", "getError", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$ErrorLabels;", "getErrorMessage", "getGlareError", "getHaveDocReady", "getKeepSteady", "getManualPrimary", "getManualSecondary", "getMobile", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$MobileLabels;", "getModuleId", "getMoveAreaError", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneLeft", "getMovePhoneRight", "getMovePhoneUp", "getNumOfDocuments", "getPreviewMessages", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$PreviewMessages;", "getRetryButton", "getScanning", "getSessionToken", "getStartMode", "getSubmissionErrorMessage", "getSubmitButton", "getSubmitButtonMessages", "()Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$SubmitButtonMessages;", "getSuccess", "getToGetStarted", "getTotalModuleCount", "getTotalVerificationCount", "getTransitionHeaderText", "getTransitionInstructionsPrimaryText", "getTransitionInstructionsSecondaryText", "getTransitionScreenEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTryPhotoManually", "getUploadFileTypes", "getUploading", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$ErrorLabels;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$MobileLabels;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$PreviewMessages;Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$SubmitButtonMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel;", "describeContents", "equals", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "ErrorLabels", "MobileLabels", "PreviewMessages", "SubmitButtonMessages", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UnstructuredModuleModel implements ModuleModel, Parcelable, ScannerModel {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnstructuredModuleModel> CREATOR = new Creator();
    private final String additionalInstructions;
    private final String backToScanning;
    private final String blurErrorSecondary;
    private final String cameraIssue;
    private final String cameraLoading;
    private final String captureCompatibilityCheck;
    private final String captureMode;
    private final String capturePageTitle;
    private final String captureSuccess;
    private final List<String> collectionMethods;
    private final Integer completedModuleCount;
    private final String confirmMode;
    private final String confirmPageTitle;
    private final String currentDocument;
    private final Integer currentVerificationCount;
    private final String darkImageError;
    private final String defaultDocumentTitle;
    private final String defaultIvsError;
    private final String document;
    private final String documentCameraPermission;
    private final String documentCollectionTitle;
    private final String documentNumber;
    private final String documentPreviewTitle;
    private final List<String> documentTypes;
    private final String documentUploadCounter;
    private final ErrorLabels error;
    private final String errorMessage;
    private final String glareError;
    private final String haveDocReady;
    private final String keepSteady;
    private final String manualPrimary;
    private final String manualSecondary;
    private final MobileLabels mobile;
    private final String moduleId;
    private final String moveAreaError;
    private final String movePhoneBack;
    private final String movePhoneDown;
    private final String movePhoneLeft;
    private final String movePhoneRight;
    private final String movePhoneUp;
    private final String numOfDocuments;
    private final PreviewMessages previewMessages;
    private final String retryButton;
    private final String scanning;
    private final String sessionToken;
    private final String startMode;
    private final String submissionErrorMessage;
    private final String submitButton;
    private final SubmitButtonMessages submitButtonMessages;
    private final String success;
    private final String toGetStarted;
    private final Integer totalModuleCount;
    private final Integer totalVerificationCount;
    private final String transitionHeaderText;
    private final String transitionInstructionsPrimaryText;
    private final String transitionInstructionsSecondaryText;
    private final Boolean transitionScreenEnabled;
    private final String tryPhotoManually;
    private final List<String> uploadFileTypes;
    private final String uploading;

    /* compiled from: UnstructuredModuleModel.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UnstructuredModuleModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnstructuredModuleModel createFromParcel(Parcel parcel) {
            Integer num;
            MobileLabels createFromParcel;
            MobileLabels mobileLabels;
            PreviewMessages createFromParcel2;
            PreviewMessages previewMessages;
            SubmitButtonMessages createFromParcel3;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            String readString12 = parcel.readString();
            String readString13 = parcel.readString();
            String readString14 = parcel.readString();
            String readString15 = parcel.readString();
            String readString16 = parcel.readString();
            String readString17 = parcel.readString();
            ErrorLabels createFromParcel4 = parcel.readInt() == 0 ? null : ErrorLabels.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                num = valueOf2;
                createFromParcel = null;
            } else {
                num = valueOf2;
                createFromParcel = MobileLabels.CREATOR.createFromParcel(parcel);
            }
            MobileLabels mobileLabels2 = createFromParcel;
            String readString18 = parcel.readString();
            String readString19 = parcel.readString();
            String readString20 = parcel.readString();
            String readString21 = parcel.readString();
            String readString22 = parcel.readString();
            String readString23 = parcel.readString();
            String readString24 = parcel.readString();
            String readString25 = parcel.readString();
            String readString26 = parcel.readString();
            String readString27 = parcel.readString();
            String readString28 = parcel.readString();
            String readString29 = parcel.readString();
            String readString30 = parcel.readString();
            String readString31 = parcel.readString();
            String readString32 = parcel.readString();
            String readString33 = parcel.readString();
            String readString34 = parcel.readString();
            String readString35 = parcel.readString();
            String readString36 = parcel.readString();
            String readString37 = parcel.readString();
            String readString38 = parcel.readString();
            String readString39 = parcel.readString();
            String readString40 = parcel.readString();
            String readString41 = parcel.readString();
            if (parcel.readInt() == 0) {
                mobileLabels = mobileLabels2;
                createFromParcel2 = null;
            } else {
                mobileLabels = mobileLabels2;
                createFromParcel2 = PreviewMessages.CREATOR.createFromParcel(parcel);
            }
            PreviewMessages previewMessages2 = createFromParcel2;
            if (parcel.readInt() == 0) {
                previewMessages = previewMessages2;
                createFromParcel3 = null;
            } else {
                previewMessages = previewMessages2;
                createFromParcel3 = SubmitButtonMessages.CREATOR.createFromParcel(parcel);
            }
            SubmitButtonMessages submitButtonMessages = createFromParcel3;
            String readString42 = parcel.readString();
            String readString43 = parcel.readString();
            String readString44 = parcel.readString();
            String readString45 = parcel.readString();
            String readString46 = parcel.readString();
            String readString47 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UnstructuredModuleModel(readString, readString2, createStringArrayList, createStringArrayList2, createStringArrayList3, num, valueOf3, readString3, readString4, readString5, readString6, readString7, readString8, readString9, readString10, readString11, readString12, readString13, readString14, readString15, readString16, readString17, createFromParcel4, mobileLabels, readString18, readString19, readString20, readString21, readString22, readString23, readString24, readString25, readString26, readString27, readString28, readString29, readString30, readString31, readString32, readString33, readString34, readString35, readString36, readString37, readString38, readString39, readString40, readString41, previewMessages, submitButtonMessages, readString42, readString43, readString44, readString45, readString46, readString47, valueOf, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnstructuredModuleModel[] newArray(int i) {
            return new UnstructuredModuleModel[i];
        }
    }

    public static /* synthetic */ UnstructuredModuleModel copy$default(UnstructuredModuleModel unstructuredModuleModel, String str, String str2, List list, List list2, List list3, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ErrorLabels errorLabels, MobileLabels mobileLabels, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str42, String str43, String str44, String str45, String str46, String str47, Boolean bool, Integer num3, Integer num4, String str48, int i, int i2, Object obj) {
        String moduleId = (i & 1) != 0 ? unstructuredModuleModel.getModuleId() : str;
        return unstructuredModuleModel.copy(moduleId, (i & 2) != 0 ? unstructuredModuleModel.getSessionToken() : str2, (i & 4) != 0 ? unstructuredModuleModel.documentTypes : list, (i & 8) != 0 ? unstructuredModuleModel.collectionMethods : list2, (i & 16) != 0 ? unstructuredModuleModel.uploadFileTypes : list3, (i & 32) != 0 ? unstructuredModuleModel.completedModuleCount : num, (i & 64) != 0 ? unstructuredModuleModel.totalModuleCount : num2, (i & 128) != 0 ? unstructuredModuleModel.currentDocument : str3, (i & 256) != 0 ? unstructuredModuleModel.documentNumber : str4, (i & 512) != 0 ? unstructuredModuleModel.documentUploadCounter : str5, (i & 1024) != 0 ? unstructuredModuleModel.numOfDocuments : str6, (i & 2048) != 0 ? unstructuredModuleModel.document : str7, (i & 4096) != 0 ? unstructuredModuleModel.submitButton : str8, (i & 8192) != 0 ? unstructuredModuleModel.retryButton : str9, (i & 16384) != 0 ? unstructuredModuleModel.uploading : str10, (i & 32768) != 0 ? unstructuredModuleModel.success : str11, (i & 65536) != 0 ? unstructuredModuleModel.additionalInstructions : str12, (i & 131072) != 0 ? unstructuredModuleModel.documentCollectionTitle : str13, (i & 262144) != 0 ? unstructuredModuleModel.documentPreviewTitle : str14, (i & 524288) != 0 ? unstructuredModuleModel.transitionHeaderText : str15, (i & 1048576) != 0 ? unstructuredModuleModel.transitionInstructionsPrimaryText : str16, (i & 2097152) != 0 ? unstructuredModuleModel.transitionInstructionsSecondaryText : str17, (i & 4194304) != 0 ? unstructuredModuleModel.error : errorLabels, (i & 8388608) != 0 ? unstructuredModuleModel.mobile : mobileLabels, (i & 16777216) != 0 ? unstructuredModuleModel.captureSuccess : str18, (i & 33554432) != 0 ? unstructuredModuleModel.scanning : str19, (i & 67108864) != 0 ? unstructuredModuleModel.tryPhotoManually : str20, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? unstructuredModuleModel.haveDocReady : str21, (i & 268435456) != 0 ? unstructuredModuleModel.keepSteady : str22, (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? unstructuredModuleModel.manualSecondary : str23, (i & 1073741824) != 0 ? unstructuredModuleModel.cameraLoading : str24, (i & Integer.MIN_VALUE) != 0 ? unstructuredModuleModel.cameraIssue : str25, (i2 & 1) != 0 ? unstructuredModuleModel.startMode : str26, (i2 & 2) != 0 ? unstructuredModuleModel.captureMode : str27, (i2 & 4) != 0 ? unstructuredModuleModel.confirmMode : str28, (i2 & 8) != 0 ? unstructuredModuleModel.backToScanning : str29, (i2 & 16) != 0 ? unstructuredModuleModel.captureCompatibilityCheck : str30, (i2 & 32) != 0 ? unstructuredModuleModel.defaultDocumentTitle : str31, (i2 & 64) != 0 ? unstructuredModuleModel.capturePageTitle : str32, (i2 & 128) != 0 ? unstructuredModuleModel.confirmPageTitle : str33, (i2 & 256) != 0 ? unstructuredModuleModel.toGetStarted : str34, (i2 & 512) != 0 ? unstructuredModuleModel.errorMessage : str35, (i2 & 1024) != 0 ? unstructuredModuleModel.moveAreaError : str36, (i2 & 2048) != 0 ? unstructuredModuleModel.darkImageError : str37, (i2 & 4096) != 0 ? unstructuredModuleModel.glareError : str38, (i2 & 8192) != 0 ? unstructuredModuleModel.manualPrimary : str39, (i2 & 16384) != 0 ? unstructuredModuleModel.blurErrorSecondary : str40, (i2 & 32768) != 0 ? unstructuredModuleModel.defaultIvsError : str41, (i2 & 65536) != 0 ? unstructuredModuleModel.previewMessages : previewMessages, (i2 & 131072) != 0 ? unstructuredModuleModel.submitButtonMessages : submitButtonMessages, (i2 & 262144) != 0 ? unstructuredModuleModel.documentCameraPermission : str42, (i2 & 524288) != 0 ? unstructuredModuleModel.movePhoneBack : str43, (i2 & 1048576) != 0 ? unstructuredModuleModel.movePhoneUp : str44, (i2 & 2097152) != 0 ? unstructuredModuleModel.movePhoneDown : str45, (i2 & 4194304) != 0 ? unstructuredModuleModel.movePhoneRight : str46, (i2 & 8388608) != 0 ? unstructuredModuleModel.movePhoneLeft : str47, (i2 & 16777216) != 0 ? unstructuredModuleModel.transitionScreenEnabled : bool, (i2 & 33554432) != 0 ? unstructuredModuleModel.currentVerificationCount : num3, (i2 & 67108864) != 0 ? unstructuredModuleModel.totalVerificationCount : num4, (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? unstructuredModuleModel.getSubmissionErrorMessage() : str48);
    }

    public final String component1() {
        return getModuleId();
    }

    /* renamed from: component10, reason: from getter */
    public final String getDocumentUploadCounter() {
        return this.documentUploadCounter;
    }

    /* renamed from: component11, reason: from getter */
    public final String getNumOfDocuments() {
        return this.numOfDocuments;
    }

    /* renamed from: component12, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    /* renamed from: component13, reason: from getter */
    public final String getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component14, reason: from getter */
    public final String getRetryButton() {
        return this.retryButton;
    }

    /* renamed from: component15, reason: from getter */
    public final String getUploading() {
        return this.uploading;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAdditionalInstructions() {
        return this.additionalInstructions;
    }

    /* renamed from: component18, reason: from getter */
    public final String getDocumentCollectionTitle() {
        return this.documentCollectionTitle;
    }

    /* renamed from: component19, reason: from getter */
    public final String getDocumentPreviewTitle() {
        return this.documentPreviewTitle;
    }

    public final String component2() {
        return getSessionToken();
    }

    /* renamed from: component20, reason: from getter */
    public final String getTransitionHeaderText() {
        return this.transitionHeaderText;
    }

    /* renamed from: component21, reason: from getter */
    public final String getTransitionInstructionsPrimaryText() {
        return this.transitionInstructionsPrimaryText;
    }

    /* renamed from: component22, reason: from getter */
    public final String getTransitionInstructionsSecondaryText() {
        return this.transitionInstructionsSecondaryText;
    }

    /* renamed from: component23, reason: from getter */
    public final ErrorLabels getError() {
        return this.error;
    }

    /* renamed from: component24, reason: from getter */
    public final MobileLabels getMobile() {
        return this.mobile;
    }

    /* renamed from: component25, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component26, reason: from getter */
    public final String getScanning() {
        return this.scanning;
    }

    /* renamed from: component27, reason: from getter */
    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
    }

    /* renamed from: component28, reason: from getter */
    public final String getHaveDocReady() {
        return this.haveDocReady;
    }

    /* renamed from: component29, reason: from getter */
    public final String getKeepSteady() {
        return this.keepSteady;
    }

    public final List<String> component3() {
        return this.documentTypes;
    }

    /* renamed from: component30, reason: from getter */
    public final String getManualSecondary() {
        return this.manualSecondary;
    }

    /* renamed from: component31, reason: from getter */
    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    /* renamed from: component32, reason: from getter */
    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    /* renamed from: component33, reason: from getter */
    public final String getStartMode() {
        return this.startMode;
    }

    /* renamed from: component34, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component35, reason: from getter */
    public final String getConfirmMode() {
        return this.confirmMode;
    }

    /* renamed from: component36, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component37, reason: from getter */
    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    /* renamed from: component38, reason: from getter */
    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    /* renamed from: component39, reason: from getter */
    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    public final List<String> component4() {
        return this.collectionMethods;
    }

    /* renamed from: component40, reason: from getter */
    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    /* renamed from: component41, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    /* renamed from: component42, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component43, reason: from getter */
    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    /* renamed from: component44, reason: from getter */
    public final String getDarkImageError() {
        return this.darkImageError;
    }

    /* renamed from: component45, reason: from getter */
    public final String getGlareError() {
        return this.glareError;
    }

    /* renamed from: component46, reason: from getter */
    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    /* renamed from: component47, reason: from getter */
    public final String getBlurErrorSecondary() {
        return this.blurErrorSecondary;
    }

    /* renamed from: component48, reason: from getter */
    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    /* renamed from: component49, reason: from getter */
    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    public final List<String> component5() {
        return this.uploadFileTypes;
    }

    /* renamed from: component50, reason: from getter */
    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    /* renamed from: component51, reason: from getter */
    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    /* renamed from: component52, reason: from getter */
    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    /* renamed from: component53, reason: from getter */
    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    /* renamed from: component54, reason: from getter */
    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    /* renamed from: component55, reason: from getter */
    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    /* renamed from: component56, reason: from getter */
    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    /* renamed from: component57, reason: from getter */
    public final Boolean getTransitionScreenEnabled() {
        return this.transitionScreenEnabled;
    }

    /* renamed from: component58, reason: from getter */
    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    /* renamed from: component59, reason: from getter */
    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final String component60() {
        return getSubmissionErrorMessage();
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getTotalModuleCount() {
        return this.totalModuleCount;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCurrentDocument() {
        return this.currentDocument;
    }

    /* renamed from: component9, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final UnstructuredModuleModel copy(String moduleId, String sessionToken, List<String> documentTypes, List<String> collectionMethods, List<String> uploadFileTypes, Integer completedModuleCount, Integer totalModuleCount, String currentDocument, String documentNumber, String documentUploadCounter, String numOfDocuments, String document, String submitButton, String retryButton, String uploading, String success, String additionalInstructions, String documentCollectionTitle, String documentPreviewTitle, String transitionHeaderText, String transitionInstructionsPrimaryText, String transitionInstructionsSecondaryText, ErrorLabels error, MobileLabels mobile, String captureSuccess, String scanning, String tryPhotoManually, String haveDocReady, String keepSteady, String manualSecondary, String cameraLoading, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String errorMessage, String moveAreaError, String darkImageError, String glareError, String manualPrimary, String blurErrorSecondary, String defaultIvsError, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String documentCameraPermission, String movePhoneBack, String movePhoneUp, String movePhoneDown, String movePhoneRight, String movePhoneLeft, Boolean transitionScreenEnabled, Integer currentVerificationCount, Integer totalVerificationCount, String submissionErrorMessage) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        Intrinsics.checkNotNullParameter(collectionMethods, "collectionMethods");
        Intrinsics.checkNotNullParameter(uploadFileTypes, "uploadFileTypes");
        return new UnstructuredModuleModel(moduleId, sessionToken, documentTypes, collectionMethods, uploadFileTypes, completedModuleCount, totalModuleCount, currentDocument, documentNumber, documentUploadCounter, numOfDocuments, document, submitButton, retryButton, uploading, success, additionalInstructions, documentCollectionTitle, documentPreviewTitle, transitionHeaderText, transitionInstructionsPrimaryText, transitionInstructionsSecondaryText, error, mobile, captureSuccess, scanning, tryPhotoManually, haveDocReady, keepSteady, manualSecondary, cameraLoading, cameraIssue, startMode, captureMode, confirmMode, backToScanning, captureCompatibilityCheck, defaultDocumentTitle, capturePageTitle, confirmPageTitle, toGetStarted, errorMessage, moveAreaError, darkImageError, glareError, manualPrimary, blurErrorSecondary, defaultIvsError, previewMessages, submitButtonMessages, documentCameraPermission, movePhoneBack, movePhoneUp, movePhoneDown, movePhoneRight, movePhoneLeft, transitionScreenEnabled, currentVerificationCount, totalVerificationCount, submissionErrorMessage);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnstructuredModuleModel)) {
            return false;
        }
        UnstructuredModuleModel unstructuredModuleModel = (UnstructuredModuleModel) other;
        return Intrinsics.areEqual(getModuleId(), unstructuredModuleModel.getModuleId()) && Intrinsics.areEqual(getSessionToken(), unstructuredModuleModel.getSessionToken()) && Intrinsics.areEqual(this.documentTypes, unstructuredModuleModel.documentTypes) && Intrinsics.areEqual(this.collectionMethods, unstructuredModuleModel.collectionMethods) && Intrinsics.areEqual(this.uploadFileTypes, unstructuredModuleModel.uploadFileTypes) && Intrinsics.areEqual(this.completedModuleCount, unstructuredModuleModel.completedModuleCount) && Intrinsics.areEqual(this.totalModuleCount, unstructuredModuleModel.totalModuleCount) && Intrinsics.areEqual(this.currentDocument, unstructuredModuleModel.currentDocument) && Intrinsics.areEqual(this.documentNumber, unstructuredModuleModel.documentNumber) && Intrinsics.areEqual(this.documentUploadCounter, unstructuredModuleModel.documentUploadCounter) && Intrinsics.areEqual(this.numOfDocuments, unstructuredModuleModel.numOfDocuments) && Intrinsics.areEqual(this.document, unstructuredModuleModel.document) && Intrinsics.areEqual(this.submitButton, unstructuredModuleModel.submitButton) && Intrinsics.areEqual(this.retryButton, unstructuredModuleModel.retryButton) && Intrinsics.areEqual(this.uploading, unstructuredModuleModel.uploading) && Intrinsics.areEqual(this.success, unstructuredModuleModel.success) && Intrinsics.areEqual(this.additionalInstructions, unstructuredModuleModel.additionalInstructions) && Intrinsics.areEqual(this.documentCollectionTitle, unstructuredModuleModel.documentCollectionTitle) && Intrinsics.areEqual(this.documentPreviewTitle, unstructuredModuleModel.documentPreviewTitle) && Intrinsics.areEqual(this.transitionHeaderText, unstructuredModuleModel.transitionHeaderText) && Intrinsics.areEqual(this.transitionInstructionsPrimaryText, unstructuredModuleModel.transitionInstructionsPrimaryText) && Intrinsics.areEqual(this.transitionInstructionsSecondaryText, unstructuredModuleModel.transitionInstructionsSecondaryText) && Intrinsics.areEqual(this.error, unstructuredModuleModel.error) && Intrinsics.areEqual(this.mobile, unstructuredModuleModel.mobile) && Intrinsics.areEqual(this.captureSuccess, unstructuredModuleModel.captureSuccess) && Intrinsics.areEqual(this.scanning, unstructuredModuleModel.scanning) && Intrinsics.areEqual(this.tryPhotoManually, unstructuredModuleModel.tryPhotoManually) && Intrinsics.areEqual(this.haveDocReady, unstructuredModuleModel.haveDocReady) && Intrinsics.areEqual(this.keepSteady, unstructuredModuleModel.keepSteady) && Intrinsics.areEqual(this.manualSecondary, unstructuredModuleModel.manualSecondary) && Intrinsics.areEqual(this.cameraLoading, unstructuredModuleModel.cameraLoading) && Intrinsics.areEqual(this.cameraIssue, unstructuredModuleModel.cameraIssue) && Intrinsics.areEqual(this.startMode, unstructuredModuleModel.startMode) && Intrinsics.areEqual(this.captureMode, unstructuredModuleModel.captureMode) && Intrinsics.areEqual(this.confirmMode, unstructuredModuleModel.confirmMode) && Intrinsics.areEqual(this.backToScanning, unstructuredModuleModel.backToScanning) && Intrinsics.areEqual(this.captureCompatibilityCheck, unstructuredModuleModel.captureCompatibilityCheck) && Intrinsics.areEqual(this.defaultDocumentTitle, unstructuredModuleModel.defaultDocumentTitle) && Intrinsics.areEqual(this.capturePageTitle, unstructuredModuleModel.capturePageTitle) && Intrinsics.areEqual(this.confirmPageTitle, unstructuredModuleModel.confirmPageTitle) && Intrinsics.areEqual(this.toGetStarted, unstructuredModuleModel.toGetStarted) && Intrinsics.areEqual(this.errorMessage, unstructuredModuleModel.errorMessage) && Intrinsics.areEqual(this.moveAreaError, unstructuredModuleModel.moveAreaError) && Intrinsics.areEqual(this.darkImageError, unstructuredModuleModel.darkImageError) && Intrinsics.areEqual(this.glareError, unstructuredModuleModel.glareError) && Intrinsics.areEqual(this.manualPrimary, unstructuredModuleModel.manualPrimary) && Intrinsics.areEqual(this.blurErrorSecondary, unstructuredModuleModel.blurErrorSecondary) && Intrinsics.areEqual(this.defaultIvsError, unstructuredModuleModel.defaultIvsError) && Intrinsics.areEqual(this.previewMessages, unstructuredModuleModel.previewMessages) && Intrinsics.areEqual(this.submitButtonMessages, unstructuredModuleModel.submitButtonMessages) && Intrinsics.areEqual(this.documentCameraPermission, unstructuredModuleModel.documentCameraPermission) && Intrinsics.areEqual(this.movePhoneBack, unstructuredModuleModel.movePhoneBack) && Intrinsics.areEqual(this.movePhoneUp, unstructuredModuleModel.movePhoneUp) && Intrinsics.areEqual(this.movePhoneDown, unstructuredModuleModel.movePhoneDown) && Intrinsics.areEqual(this.movePhoneRight, unstructuredModuleModel.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, unstructuredModuleModel.movePhoneLeft) && Intrinsics.areEqual(this.transitionScreenEnabled, unstructuredModuleModel.transitionScreenEnabled) && Intrinsics.areEqual(this.currentVerificationCount, unstructuredModuleModel.currentVerificationCount) && Intrinsics.areEqual(this.totalVerificationCount, unstructuredModuleModel.totalVerificationCount) && Intrinsics.areEqual(getSubmissionErrorMessage(), unstructuredModuleModel.getSubmissionErrorMessage());
    }

    public int hashCode() {
        int hashCode = ((((((((getModuleId().hashCode() * 31) + (getSessionToken() == null ? 0 : getSessionToken().hashCode())) * 31) + this.documentTypes.hashCode()) * 31) + this.collectionMethods.hashCode()) * 31) + this.uploadFileTypes.hashCode()) * 31;
        Integer num = this.completedModuleCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalModuleCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.currentDocument;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.documentNumber;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentUploadCounter;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.numOfDocuments;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.document;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.submitButton;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.retryButton;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.uploading;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.success;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.additionalInstructions;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.documentCollectionTitle;
        int hashCode14 = (hashCode13 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.documentPreviewTitle;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.transitionHeaderText;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.transitionInstructionsPrimaryText;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.transitionInstructionsSecondaryText;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        ErrorLabels errorLabels = this.error;
        int hashCode19 = (hashCode18 + (errorLabels == null ? 0 : errorLabels.hashCode())) * 31;
        MobileLabels mobileLabels = this.mobile;
        int hashCode20 = (hashCode19 + (mobileLabels == null ? 0 : mobileLabels.hashCode())) * 31;
        String str16 = this.captureSuccess;
        int hashCode21 = (hashCode20 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.scanning;
        int hashCode22 = (hashCode21 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.tryPhotoManually;
        int hashCode23 = (hashCode22 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.haveDocReady;
        int hashCode24 = (hashCode23 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.keepSteady;
        int hashCode25 = (hashCode24 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.manualSecondary;
        int hashCode26 = (hashCode25 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.cameraLoading;
        int hashCode27 = (hashCode26 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.cameraIssue;
        int hashCode28 = (hashCode27 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.startMode;
        int hashCode29 = (hashCode28 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.captureMode;
        int hashCode30 = (hashCode29 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.confirmMode;
        int hashCode31 = (hashCode30 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.backToScanning;
        int hashCode32 = (hashCode31 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.captureCompatibilityCheck;
        int hashCode33 = (hashCode32 + (str28 == null ? 0 : str28.hashCode())) * 31;
        String str29 = this.defaultDocumentTitle;
        int hashCode34 = (hashCode33 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.capturePageTitle;
        int hashCode35 = (hashCode34 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.confirmPageTitle;
        int hashCode36 = (hashCode35 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.toGetStarted;
        int hashCode37 = (hashCode36 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.errorMessage;
        int hashCode38 = (hashCode37 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.moveAreaError;
        int hashCode39 = (hashCode38 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.darkImageError;
        int hashCode40 = (hashCode39 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.glareError;
        int hashCode41 = (hashCode40 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.manualPrimary;
        int hashCode42 = (hashCode41 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.blurErrorSecondary;
        int hashCode43 = (hashCode42 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.defaultIvsError;
        int hashCode44 = (hashCode43 + (str39 == null ? 0 : str39.hashCode())) * 31;
        PreviewMessages previewMessages = this.previewMessages;
        int hashCode45 = (hashCode44 + (previewMessages == null ? 0 : previewMessages.hashCode())) * 31;
        SubmitButtonMessages submitButtonMessages = this.submitButtonMessages;
        int hashCode46 = (hashCode45 + (submitButtonMessages == null ? 0 : submitButtonMessages.hashCode())) * 31;
        String str40 = this.documentCameraPermission;
        int hashCode47 = (hashCode46 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.movePhoneBack;
        int hashCode48 = (hashCode47 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.movePhoneUp;
        int hashCode49 = (hashCode48 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.movePhoneDown;
        int hashCode50 = (hashCode49 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.movePhoneRight;
        int hashCode51 = (hashCode50 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.movePhoneLeft;
        int hashCode52 = (hashCode51 + (str45 == null ? 0 : str45.hashCode())) * 31;
        Boolean bool = this.transitionScreenEnabled;
        int hashCode53 = (hashCode52 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.currentVerificationCount;
        int hashCode54 = (hashCode53 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.totalVerificationCount;
        return ((hashCode54 + (num4 == null ? 0 : num4.hashCode())) * 31) + (getSubmissionErrorMessage() != null ? getSubmissionErrorMessage().hashCode() : 0);
    }

    public String toString() {
        return "UnstructuredModuleModel(moduleId=" + getModuleId() + ", sessionToken=" + getSessionToken() + ", documentTypes=" + this.documentTypes + ", collectionMethods=" + this.collectionMethods + ", uploadFileTypes=" + this.uploadFileTypes + ", completedModuleCount=" + this.completedModuleCount + ", totalModuleCount=" + this.totalModuleCount + ", currentDocument=" + this.currentDocument + ", documentNumber=" + this.documentNumber + ", documentUploadCounter=" + this.documentUploadCounter + ", numOfDocuments=" + this.numOfDocuments + ", document=" + this.document + ", submitButton=" + this.submitButton + ", retryButton=" + this.retryButton + ", uploading=" + this.uploading + ", success=" + this.success + ", additionalInstructions=" + this.additionalInstructions + ", documentCollectionTitle=" + this.documentCollectionTitle + ", documentPreviewTitle=" + this.documentPreviewTitle + ", transitionHeaderText=" + this.transitionHeaderText + ", transitionInstructionsPrimaryText=" + this.transitionInstructionsPrimaryText + ", transitionInstructionsSecondaryText=" + this.transitionInstructionsSecondaryText + ", error=" + this.error + ", mobile=" + this.mobile + ", captureSuccess=" + this.captureSuccess + ", scanning=" + this.scanning + ", tryPhotoManually=" + this.tryPhotoManually + ", haveDocReady=" + this.haveDocReady + ", keepSteady=" + this.keepSteady + ", manualSecondary=" + this.manualSecondary + ", cameraLoading=" + this.cameraLoading + ", cameraIssue=" + this.cameraIssue + ", startMode=" + this.startMode + ", captureMode=" + this.captureMode + ", confirmMode=" + this.confirmMode + ", backToScanning=" + this.backToScanning + ", captureCompatibilityCheck=" + this.captureCompatibilityCheck + ", defaultDocumentTitle=" + this.defaultDocumentTitle + ", capturePageTitle=" + this.capturePageTitle + ", confirmPageTitle=" + this.confirmPageTitle + ", toGetStarted=" + this.toGetStarted + ", errorMessage=" + this.errorMessage + ", moveAreaError=" + this.moveAreaError + ", darkImageError=" + this.darkImageError + ", glareError=" + this.glareError + ", manualPrimary=" + this.manualPrimary + ", blurErrorSecondary=" + this.blurErrorSecondary + ", defaultIvsError=" + this.defaultIvsError + ", previewMessages=" + this.previewMessages + ", submitButtonMessages=" + this.submitButtonMessages + ", documentCameraPermission=" + this.documentCameraPermission + ", movePhoneBack=" + this.movePhoneBack + ", movePhoneUp=" + this.movePhoneUp + ", movePhoneDown=" + this.movePhoneDown + ", movePhoneRight=" + this.movePhoneRight + ", movePhoneLeft=" + this.movePhoneLeft + ", transitionScreenEnabled=" + this.transitionScreenEnabled + ", currentVerificationCount=" + this.currentVerificationCount + ", totalVerificationCount=" + this.totalVerificationCount + ", submissionErrorMessage=" + getSubmissionErrorMessage() + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.moduleId);
        parcel.writeString(this.sessionToken);
        parcel.writeStringList(this.documentTypes);
        parcel.writeStringList(this.collectionMethods);
        parcel.writeStringList(this.uploadFileTypes);
        Integer num = this.completedModuleCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.totalModuleCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.currentDocument);
        parcel.writeString(this.documentNumber);
        parcel.writeString(this.documentUploadCounter);
        parcel.writeString(this.numOfDocuments);
        parcel.writeString(this.document);
        parcel.writeString(this.submitButton);
        parcel.writeString(this.retryButton);
        parcel.writeString(this.uploading);
        parcel.writeString(this.success);
        parcel.writeString(this.additionalInstructions);
        parcel.writeString(this.documentCollectionTitle);
        parcel.writeString(this.documentPreviewTitle);
        parcel.writeString(this.transitionHeaderText);
        parcel.writeString(this.transitionInstructionsPrimaryText);
        parcel.writeString(this.transitionInstructionsSecondaryText);
        ErrorLabels errorLabels = this.error;
        if (errorLabels == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            errorLabels.writeToParcel(parcel, flags);
        }
        MobileLabels mobileLabels = this.mobile;
        if (mobileLabels == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mobileLabels.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.captureSuccess);
        parcel.writeString(this.scanning);
        parcel.writeString(this.tryPhotoManually);
        parcel.writeString(this.haveDocReady);
        parcel.writeString(this.keepSteady);
        parcel.writeString(this.manualSecondary);
        parcel.writeString(this.cameraLoading);
        parcel.writeString(this.cameraIssue);
        parcel.writeString(this.startMode);
        parcel.writeString(this.captureMode);
        parcel.writeString(this.confirmMode);
        parcel.writeString(this.backToScanning);
        parcel.writeString(this.captureCompatibilityCheck);
        parcel.writeString(this.defaultDocumentTitle);
        parcel.writeString(this.capturePageTitle);
        parcel.writeString(this.confirmPageTitle);
        parcel.writeString(this.toGetStarted);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.moveAreaError);
        parcel.writeString(this.darkImageError);
        parcel.writeString(this.glareError);
        parcel.writeString(this.manualPrimary);
        parcel.writeString(this.blurErrorSecondary);
        parcel.writeString(this.defaultIvsError);
        PreviewMessages previewMessages = this.previewMessages;
        if (previewMessages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            previewMessages.writeToParcel(parcel, flags);
        }
        SubmitButtonMessages submitButtonMessages = this.submitButtonMessages;
        if (submitButtonMessages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            submitButtonMessages.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.documentCameraPermission);
        parcel.writeString(this.movePhoneBack);
        parcel.writeString(this.movePhoneUp);
        parcel.writeString(this.movePhoneDown);
        parcel.writeString(this.movePhoneRight);
        parcel.writeString(this.movePhoneLeft);
        Boolean bool = this.transitionScreenEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.currentVerificationCount;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.totalVerificationCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.submissionErrorMessage);
    }

    public UnstructuredModuleModel(String moduleId, String str, List<String> documentTypes, List<String> collectionMethods, List<String> uploadFileTypes, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, ErrorLabels errorLabels, MobileLabels mobileLabels, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str41, String str42, String str43, String str44, String str45, String str46, Boolean bool, Integer num3, Integer num4, String str47) {
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(documentTypes, "documentTypes");
        Intrinsics.checkNotNullParameter(collectionMethods, "collectionMethods");
        Intrinsics.checkNotNullParameter(uploadFileTypes, "uploadFileTypes");
        this.moduleId = moduleId;
        this.sessionToken = str;
        this.documentTypes = documentTypes;
        this.collectionMethods = collectionMethods;
        this.uploadFileTypes = uploadFileTypes;
        this.completedModuleCount = num;
        this.totalModuleCount = num2;
        this.currentDocument = str2;
        this.documentNumber = str3;
        this.documentUploadCounter = str4;
        this.numOfDocuments = str5;
        this.document = str6;
        this.submitButton = str7;
        this.retryButton = str8;
        this.uploading = str9;
        this.success = str10;
        this.additionalInstructions = str11;
        this.documentCollectionTitle = str12;
        this.documentPreviewTitle = str13;
        this.transitionHeaderText = str14;
        this.transitionInstructionsPrimaryText = str15;
        this.transitionInstructionsSecondaryText = str16;
        this.error = errorLabels;
        this.mobile = mobileLabels;
        this.captureSuccess = str17;
        this.scanning = str18;
        this.tryPhotoManually = str19;
        this.haveDocReady = str20;
        this.keepSteady = str21;
        this.manualSecondary = str22;
        this.cameraLoading = str23;
        this.cameraIssue = str24;
        this.startMode = str25;
        this.captureMode = str26;
        this.confirmMode = str27;
        this.backToScanning = str28;
        this.captureCompatibilityCheck = str29;
        this.defaultDocumentTitle = str30;
        this.capturePageTitle = str31;
        this.confirmPageTitle = str32;
        this.toGetStarted = str33;
        this.errorMessage = str34;
        this.moveAreaError = str35;
        this.darkImageError = str36;
        this.glareError = str37;
        this.manualPrimary = str38;
        this.blurErrorSecondary = str39;
        this.defaultIvsError = str40;
        this.previewMessages = previewMessages;
        this.submitButtonMessages = submitButtonMessages;
        this.documentCameraPermission = str41;
        this.movePhoneBack = str42;
        this.movePhoneUp = str43;
        this.movePhoneDown = str44;
        this.movePhoneRight = str45;
        this.movePhoneLeft = str46;
        this.transitionScreenEnabled = bool;
        this.currentVerificationCount = num3;
        this.totalVerificationCount = num4;
        this.submissionErrorMessage = str47;
    }

    public /* synthetic */ UnstructuredModuleModel(String str, String str2, List list, List list2, List list3, Integer num, Integer num2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, ErrorLabels errorLabels, MobileLabels mobileLabels, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str42, String str43, String str44, String str45, String str46, String str47, Boolean bool, Integer num3, Integer num4, String str48, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, list, list2, list3, num, num2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, errorLabels, mobileLabels, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, previewMessages, submitButtonMessages, str42, str43, str44, str45, str46, str47, bool, num3, num4, (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str48);
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getModuleId() {
        return this.moduleId;
    }

    @Override // com.socure.docv.capturesdk.models.ModuleModel
    public String getSessionToken() {
        return this.sessionToken;
    }

    public final List<String> getDocumentTypes() {
        return this.documentTypes;
    }

    public final List<String> getCollectionMethods() {
        return this.collectionMethods;
    }

    public final List<String> getUploadFileTypes() {
        return this.uploadFileTypes;
    }

    public final Integer getCompletedModuleCount() {
        return this.completedModuleCount;
    }

    public final Integer getTotalModuleCount() {
        return this.totalModuleCount;
    }

    public final String getCurrentDocument() {
        return this.currentDocument;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final String getDocumentUploadCounter() {
        return this.documentUploadCounter;
    }

    public final String getNumOfDocuments() {
        return this.numOfDocuments;
    }

    public final String getDocument() {
        return this.document;
    }

    public final String getSubmitButton() {
        return this.submitButton;
    }

    public final String getRetryButton() {
        return this.retryButton;
    }

    public final String getUploading() {
        return this.uploading;
    }

    public final String getSuccess() {
        return this.success;
    }

    public final String getAdditionalInstructions() {
        return this.additionalInstructions;
    }

    public final String getDocumentCollectionTitle() {
        return this.documentCollectionTitle;
    }

    public final String getDocumentPreviewTitle() {
        return this.documentPreviewTitle;
    }

    public final String getTransitionHeaderText() {
        return this.transitionHeaderText;
    }

    public final String getTransitionInstructionsPrimaryText() {
        return this.transitionInstructionsPrimaryText;
    }

    public final String getTransitionInstructionsSecondaryText() {
        return this.transitionInstructionsSecondaryText;
    }

    public final ErrorLabels getError() {
        return this.error;
    }

    public final MobileLabels getMobile() {
        return this.mobile;
    }

    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    public final String getScanning() {
        return this.scanning;
    }

    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
    }

    public final String getHaveDocReady() {
        return this.haveDocReady;
    }

    public final String getKeepSteady() {
        return this.keepSteady;
    }

    public final String getManualSecondary() {
        return this.manualSecondary;
    }

    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    public final String getStartMode() {
        return this.startMode;
    }

    public final String getCaptureMode() {
        return this.captureMode;
    }

    public final String getConfirmMode() {
        return this.confirmMode;
    }

    public final String getBackToScanning() {
        return this.backToScanning;
    }

    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    public final String getDarkImageError() {
        return this.darkImageError;
    }

    public final String getGlareError() {
        return this.glareError;
    }

    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    public final String getBlurErrorSecondary() {
        return this.blurErrorSecondary;
    }

    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    public final Boolean getTransitionScreenEnabled() {
        return this.transitionScreenEnabled;
    }

    public final Integer getCurrentVerificationCount() {
        return this.currentVerificationCount;
    }

    public final Integer getTotalVerificationCount() {
        return this.totalVerificationCount;
    }

    @Override // com.socure.docv.capturesdk.models.ScannerModel
    public String getSubmissionErrorMessage() {
        return this.submissionErrorMessage;
    }

    /* compiled from: UnstructuredModuleModel.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$ErrorLabels;", "Landroid/os/Parcelable;", "headerText", "", "fileSizeDescription", "fileTypeDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFileSizeDescription", "()Ljava/lang/String;", "getFileTypeDescription", "getHeaderText", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class ErrorLabels implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<ErrorLabels> CREATOR = new Creator();
        private final String fileSizeDescription;
        private final String fileTypeDescription;
        private final String headerText;

        /* compiled from: UnstructuredModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ErrorLabels> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ErrorLabels createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ErrorLabels(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ErrorLabels[] newArray(int i) {
                return new ErrorLabels[i];
            }
        }

        public static /* synthetic */ ErrorLabels copy$default(ErrorLabels errorLabels, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = errorLabels.headerText;
            }
            if ((i & 2) != 0) {
                str2 = errorLabels.fileSizeDescription;
            }
            if ((i & 4) != 0) {
                str3 = errorLabels.fileTypeDescription;
            }
            return errorLabels.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHeaderText() {
            return this.headerText;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFileSizeDescription() {
            return this.fileSizeDescription;
        }

        /* renamed from: component3, reason: from getter */
        public final String getFileTypeDescription() {
            return this.fileTypeDescription;
        }

        public final ErrorLabels copy(String headerText, String fileSizeDescription, String fileTypeDescription) {
            return new ErrorLabels(headerText, fileSizeDescription, fileTypeDescription);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorLabels)) {
                return false;
            }
            ErrorLabels errorLabels = (ErrorLabels) other;
            return Intrinsics.areEqual(this.headerText, errorLabels.headerText) && Intrinsics.areEqual(this.fileSizeDescription, errorLabels.fileSizeDescription) && Intrinsics.areEqual(this.fileTypeDescription, errorLabels.fileTypeDescription);
        }

        public int hashCode() {
            String str = this.headerText;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fileSizeDescription;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.fileTypeDescription;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "ErrorLabels(headerText=" + this.headerText + ", fileSizeDescription=" + this.fileSizeDescription + ", fileTypeDescription=" + this.fileTypeDescription + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.headerText);
            parcel.writeString(this.fileSizeDescription);
            parcel.writeString(this.fileTypeDescription);
        }

        public ErrorLabels(String str, String str2, String str3) {
            this.headerText = str;
            this.fileSizeDescription = str2;
            this.fileTypeDescription = str3;
        }

        public final String getHeaderText() {
            return this.headerText;
        }

        public final String getFileSizeDescription() {
            return this.fileSizeDescription;
        }

        public final String getFileTypeDescription() {
            return this.fileTypeDescription;
        }
    }

    /* compiled from: UnstructuredModuleModel.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006%"}, d2 = {"Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$MobileLabels;", "Landroid/os/Parcelable;", "documentDescription", "", "optionsFileSize", "uploadDocumentButton", "scanDocumentButton", "previewWarning", "nextDocument", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDocumentDescription", "()Ljava/lang/String;", "getNextDocument", "getOptionsFileSize", "getPreviewWarning", "getScanDocumentButton", "getUploadDocumentButton", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class MobileLabels implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<MobileLabels> CREATOR = new Creator();
        private final String documentDescription;
        private final String nextDocument;
        private final String optionsFileSize;
        private final String previewWarning;
        private final String scanDocumentButton;
        private final String uploadDocumentButton;

        /* compiled from: UnstructuredModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<MobileLabels> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MobileLabels createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MobileLabels(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final MobileLabels[] newArray(int i) {
                return new MobileLabels[i];
            }
        }

        public static /* synthetic */ MobileLabels copy$default(MobileLabels mobileLabels, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mobileLabels.documentDescription;
            }
            if ((i & 2) != 0) {
                str2 = mobileLabels.optionsFileSize;
            }
            if ((i & 4) != 0) {
                str3 = mobileLabels.uploadDocumentButton;
            }
            if ((i & 8) != 0) {
                str4 = mobileLabels.scanDocumentButton;
            }
            if ((i & 16) != 0) {
                str5 = mobileLabels.previewWarning;
            }
            if ((i & 32) != 0) {
                str6 = mobileLabels.nextDocument;
            }
            String str7 = str5;
            String str8 = str6;
            return mobileLabels.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDocumentDescription() {
            return this.documentDescription;
        }

        /* renamed from: component2, reason: from getter */
        public final String getOptionsFileSize() {
            return this.optionsFileSize;
        }

        /* renamed from: component3, reason: from getter */
        public final String getUploadDocumentButton() {
            return this.uploadDocumentButton;
        }

        /* renamed from: component4, reason: from getter */
        public final String getScanDocumentButton() {
            return this.scanDocumentButton;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPreviewWarning() {
            return this.previewWarning;
        }

        /* renamed from: component6, reason: from getter */
        public final String getNextDocument() {
            return this.nextDocument;
        }

        public final MobileLabels copy(String documentDescription, String optionsFileSize, String uploadDocumentButton, String scanDocumentButton, String previewWarning, String nextDocument) {
            return new MobileLabels(documentDescription, optionsFileSize, uploadDocumentButton, scanDocumentButton, previewWarning, nextDocument);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MobileLabels)) {
                return false;
            }
            MobileLabels mobileLabels = (MobileLabels) other;
            return Intrinsics.areEqual(this.documentDescription, mobileLabels.documentDescription) && Intrinsics.areEqual(this.optionsFileSize, mobileLabels.optionsFileSize) && Intrinsics.areEqual(this.uploadDocumentButton, mobileLabels.uploadDocumentButton) && Intrinsics.areEqual(this.scanDocumentButton, mobileLabels.scanDocumentButton) && Intrinsics.areEqual(this.previewWarning, mobileLabels.previewWarning) && Intrinsics.areEqual(this.nextDocument, mobileLabels.nextDocument);
        }

        public int hashCode() {
            String str = this.documentDescription;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.optionsFileSize;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.uploadDocumentButton;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.scanDocumentButton;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.previewWarning;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.nextDocument;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "MobileLabels(documentDescription=" + this.documentDescription + ", optionsFileSize=" + this.optionsFileSize + ", uploadDocumentButton=" + this.uploadDocumentButton + ", scanDocumentButton=" + this.scanDocumentButton + ", previewWarning=" + this.previewWarning + ", nextDocument=" + this.nextDocument + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.documentDescription);
            parcel.writeString(this.optionsFileSize);
            parcel.writeString(this.uploadDocumentButton);
            parcel.writeString(this.scanDocumentButton);
            parcel.writeString(this.previewWarning);
            parcel.writeString(this.nextDocument);
        }

        public MobileLabels(String str, String str2, String str3, String str4, String str5, String str6) {
            this.documentDescription = str;
            this.optionsFileSize = str2;
            this.uploadDocumentButton = str3;
            this.scanDocumentButton = str4;
            this.previewWarning = str5;
            this.nextDocument = str6;
        }

        public final String getDocumentDescription() {
            return this.documentDescription;
        }

        public final String getOptionsFileSize() {
            return this.optionsFileSize;
        }

        public final String getUploadDocumentButton() {
            return this.uploadDocumentButton;
        }

        public final String getScanDocumentButton() {
            return this.scanDocumentButton;
        }

        public final String getPreviewWarning() {
            return this.previewWarning;
        }

        public final String getNextDocument() {
            return this.nextDocument;
        }
    }

    /* compiled from: UnstructuredModuleModel.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$PreviewMessages;", "Landroid/os/Parcelable;", "submitImageForValidation", "", "validatingImage", "invalidImage", "imageValidated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getImageValidated", "()Ljava/lang/String;", "getInvalidImage", "getSubmitImageForValidation", "getValidatingImage", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class PreviewMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PreviewMessages> CREATOR = new Creator();
        private final String imageValidated;
        private final String invalidImage;
        private final String submitImageForValidation;
        private final String validatingImage;

        /* compiled from: UnstructuredModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PreviewMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviewMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreviewMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PreviewMessages[] newArray(int i) {
                return new PreviewMessages[i];
            }
        }

        public static /* synthetic */ PreviewMessages copy$default(PreviewMessages previewMessages, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = previewMessages.submitImageForValidation;
            }
            if ((i & 2) != 0) {
                str2 = previewMessages.validatingImage;
            }
            if ((i & 4) != 0) {
                str3 = previewMessages.invalidImage;
            }
            if ((i & 8) != 0) {
                str4 = previewMessages.imageValidated;
            }
            return previewMessages.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubmitImageForValidation() {
            return this.submitImageForValidation;
        }

        /* renamed from: component2, reason: from getter */
        public final String getValidatingImage() {
            return this.validatingImage;
        }

        /* renamed from: component3, reason: from getter */
        public final String getInvalidImage() {
            return this.invalidImage;
        }

        /* renamed from: component4, reason: from getter */
        public final String getImageValidated() {
            return this.imageValidated;
        }

        public final PreviewMessages copy(String submitImageForValidation, String validatingImage, String invalidImage, String imageValidated) {
            return new PreviewMessages(submitImageForValidation, validatingImage, invalidImage, imageValidated);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PreviewMessages)) {
                return false;
            }
            PreviewMessages previewMessages = (PreviewMessages) other;
            return Intrinsics.areEqual(this.submitImageForValidation, previewMessages.submitImageForValidation) && Intrinsics.areEqual(this.validatingImage, previewMessages.validatingImage) && Intrinsics.areEqual(this.invalidImage, previewMessages.invalidImage) && Intrinsics.areEqual(this.imageValidated, previewMessages.imageValidated);
        }

        public int hashCode() {
            String str = this.submitImageForValidation;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.validatingImage;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.invalidImage;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.imageValidated;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "PreviewMessages(submitImageForValidation=" + this.submitImageForValidation + ", validatingImage=" + this.validatingImage + ", invalidImage=" + this.invalidImage + ", imageValidated=" + this.imageValidated + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.submitImageForValidation);
            parcel.writeString(this.validatingImage);
            parcel.writeString(this.invalidImage);
            parcel.writeString(this.imageValidated);
        }

        public PreviewMessages(String str, String str2, String str3, String str4) {
            this.submitImageForValidation = str;
            this.validatingImage = str2;
            this.invalidImage = str3;
            this.imageValidated = str4;
        }

        public final String getSubmitImageForValidation() {
            return this.submitImageForValidation;
        }

        public final String getValidatingImage() {
            return this.validatingImage;
        }

        public final String getInvalidImage() {
            return this.invalidImage;
        }

        public final String getImageValidated() {
            return this.imageValidated;
        }
    }

    /* compiled from: UnstructuredModuleModel.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/models/UnstructuredModuleModel$SubmitButtonMessages;", "Landroid/os/Parcelable;", "submit", "", "retake", "processing", "success", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProcessing", "()Ljava/lang/String;", "getRetake", "getSubmit", "getSuccess", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class SubmitButtonMessages implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<SubmitButtonMessages> CREATOR = new Creator();
        private final String processing;
        private final String retake;
        private final String submit;
        private final String success;

        /* compiled from: UnstructuredModuleModel.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SubmitButtonMessages> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonMessages createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubmitButtonMessages(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubmitButtonMessages[] newArray(int i) {
                return new SubmitButtonMessages[i];
            }
        }

        public static /* synthetic */ SubmitButtonMessages copy$default(SubmitButtonMessages submitButtonMessages, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = submitButtonMessages.submit;
            }
            if ((i & 2) != 0) {
                str2 = submitButtonMessages.retake;
            }
            if ((i & 4) != 0) {
                str3 = submitButtonMessages.processing;
            }
            if ((i & 8) != 0) {
                str4 = submitButtonMessages.success;
            }
            return submitButtonMessages.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSubmit() {
            return this.submit;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRetake() {
            return this.retake;
        }

        /* renamed from: component3, reason: from getter */
        public final String getProcessing() {
            return this.processing;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSuccess() {
            return this.success;
        }

        public final SubmitButtonMessages copy(String submit, String retake, String processing, String success) {
            return new SubmitButtonMessages(submit, retake, processing, success);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SubmitButtonMessages)) {
                return false;
            }
            SubmitButtonMessages submitButtonMessages = (SubmitButtonMessages) other;
            return Intrinsics.areEqual(this.submit, submitButtonMessages.submit) && Intrinsics.areEqual(this.retake, submitButtonMessages.retake) && Intrinsics.areEqual(this.processing, submitButtonMessages.processing) && Intrinsics.areEqual(this.success, submitButtonMessages.success);
        }

        public int hashCode() {
            String str = this.submit;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.retake;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.processing;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.success;
            return hashCode3 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "SubmitButtonMessages(submit=" + this.submit + ", retake=" + this.retake + ", processing=" + this.processing + ", success=" + this.success + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.submit);
            parcel.writeString(this.retake);
            parcel.writeString(this.processing);
            parcel.writeString(this.success);
        }

        public SubmitButtonMessages(String str, String str2, String str3, String str4) {
            this.submit = str;
            this.retake = str2;
            this.processing = str3;
            this.success = str4;
        }

        public final String getSubmit() {
            return this.submit;
        }

        public final String getRetake() {
            return this.retake;
        }

        public final String getProcessing() {
            return this.processing;
        }

        public final String getSuccess() {
            return this.success;
        }
    }
}
