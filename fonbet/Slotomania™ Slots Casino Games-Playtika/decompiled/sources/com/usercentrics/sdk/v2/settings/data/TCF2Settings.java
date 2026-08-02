package com.usercentrics.sdk.v2.settings.data;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.android.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TCF2Settings.kt */
@Metadata(d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0003\b\u0091\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ã\u00012\u00020\u0001:\u0004â\u0001ã\u0001B\u0081\u0005\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020 \u0012\b\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020 \u0012\b\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\b\u0010.\u001a\u0004\u0018\u00010 \u0012\u0006\u0010/\u001a\u00020 \u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00101\u001a\u00020 \u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\u0006\u00103\u001a\u00020 \u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\u000e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\u0006\u00108\u001a\u00020 \u0012\u0006\u00109\u001a\u00020 \u0012\u0006\u0010:\u001a\u00020 \u0012\u0006\u0010;\u001a\u00020 \u0012\u0006\u0010<\u001a\u00020 \u0012\b\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010A\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010B\u001a\u0004\u0018\u00010C\u0012\u0006\u0010D\u001a\u00020 \u0012\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010-\u0012\u0006\u0010F\u001a\u00020 \u0012\b\u0010G\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010H\u001a\u0004\u0018\u00010I¢\u0006\u0002\u0010JBé\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010#\u001a\u00020\u0006\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\b\b\u0002\u0010%\u001a\u00020\u0006\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\u0006\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020 \u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010/\u001a\u00020 \u0012\b\b\u0002\u00100\u001a\u00020\u0006\u0012\b\b\u0002\u00101\u001a\u00020 \u0012\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030-\u0012\b\b\u0002\u00103\u001a\u00020 \u0012\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030-\u0012\b\b\u0002\u00105\u001a\u000206\u0012\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030-\u0012\b\b\u0002\u00108\u001a\u00020 \u0012\b\b\u0002\u00109\u001a\u00020 \u0012\b\b\u0002\u0010:\u001a\u00020 \u0012\b\b\u0002\u0010;\u001a\u00020 \u0012\b\b\u0002\u0010<\u001a\u00020 \u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C\u0012\b\b\u0002\u0010D\u001a\u00020 \u0012\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030-\u0012\b\b\u0002\u0010F\u001a\u00020 \u0012\b\b\u0002\u0010G\u001a\u00020\u0006¢\u0006\u0002\u0010KJ\n\u0010\u0095\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0006HÆ\u0003J\f\u0010¥\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\n\u0010¦\u0001\u001a\u00020 HÆ\u0003J\n\u0010§\u0001\u001a\u00020 HÆ\u0003J\n\u0010¨\u0001\u001a\u00020 HÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010«\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¬\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010®\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¯\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010±\u0001\u001a\u00020 HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010³\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030-HÆ\u0003J\u0011\u0010´\u0001\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0002\u0010bJ\n\u0010µ\u0001\u001a\u00020 HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010¸\u0001\u001a\u00020 HÆ\u0003J\u0010\u0010¹\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030-HÆ\u0003J\n\u0010º\u0001\u001a\u00020 HÆ\u0003J\u0010\u0010»\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030-HÆ\u0003J\n\u0010¼\u0001\u001a\u000206HÆ\u0003J\u0010\u0010½\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030-HÆ\u0003J\n\u0010¾\u0001\u001a\u00020 HÆ\u0003J\n\u0010¿\u0001\u001a\u00020 HÆ\u0003J\n\u0010À\u0001\u001a\u00020 HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Â\u0001\u001a\u00020 HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020 HÆ\u0003J\f\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Å\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010È\u0001\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\f\u0010É\u0001\u001a\u0004\u0018\u00010CHÆ\u0003J\n\u0010Ê\u0001\u001a\u00020 HÆ\u0003J\u0010\u0010Ë\u0001\u001a\b\u0012\u0004\u0012\u00020\u00030-HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Í\u0001\u001a\u00020 HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0006HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0006HÆ\u0003J¢\u0005\u0010Ò\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020 2\b\b\u0002\u0010#\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020\u00062\b\b\u0002\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\u00062\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020 2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010/\u001a\u00020 2\b\b\u0002\u00100\u001a\u00020\u00062\b\b\u0002\u00101\u001a\u00020 2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030-2\b\b\u0002\u00103\u001a\u00020 2\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030-2\b\b\u0002\u00105\u001a\u0002062\u000e\b\u0002\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030-2\b\b\u0002\u00108\u001a\u00020 2\b\b\u0002\u00109\u001a\u00020 2\b\b\u0002\u0010:\u001a\u00020 2\b\b\u0002\u0010;\u001a\u00020 2\b\b\u0002\u0010<\u001a\u00020 2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010B\u001a\u0004\u0018\u00010C2\b\b\u0002\u0010D\u001a\u00020 2\u000e\b\u0002\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030-2\b\b\u0002\u0010F\u001a\u00020 2\b\b\u0002\u0010G\u001a\u00020\u0006HÆ\u0001¢\u0006\u0003\u0010Ó\u0001J\u0015\u0010Ô\u0001\u001a\u00020 2\t\u0010Õ\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÖ\u0001J\u000f\u0010×\u0001\u001a\u00020 H\u0000¢\u0006\u0003\bØ\u0001J\n\u0010Ù\u0001\u001a\u00020\u0006HÖ\u0001J.\u0010Ú\u0001\u001a\u00030Û\u00012\u0007\u0010Ü\u0001\u001a\u00020\u00002\b\u0010Ý\u0001\u001a\u00030Þ\u00012\b\u0010ß\u0001\u001a\u00030à\u0001HÁ\u0001¢\u0006\u0003\bá\u0001R\u0011\u0010D\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0013\u0010@\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010G\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0011\u0010\u0016\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010OR\u0011\u0010\u0017\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u0010OR\u0011\u0010\u0018\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bS\u0010OR\u0011\u0010#\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bT\u0010OR\u0013\u0010B\u001a\u0004\u0018\u00010C¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0011\u0010)\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u0010XR\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010OR\u0013\u0010+\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b[\u0010OR\u0017\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030-¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010'\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b^\u0010OR\u0013\u0010>\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b_\u0010OR\u0013\u0010=\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b`\u0010OR\u0015\u0010.\u001a\u0004\u0018\u00010 ¢\u0006\n\n\u0002\u0010c\u001a\u0004\ba\u0010bR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bd\u0010MR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0013\u0010A\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bg\u0010OR\u0011\u00108\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bh\u0010MR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bi\u0010OR\u0011\u00103\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bj\u0010MR\u0011\u0010\"\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bk\u0010MR\u0011\u00109\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bl\u0010MR\u0011\u0010m\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bm\u0010MR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bn\u0010OR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bo\u0010OR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bp\u0010OR\u0011\u0010\r\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bq\u0010OR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\br\u0010OR\u0011\u0010%\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bs\u0010OR\u0011\u0010\u0019\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bt\u0010OR\u0011\u0010\u001a\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bu\u0010OR\u0011\u00100\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bv\u0010OR\u0011\u00101\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bw\u0010MR\u0011\u0010F\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bx\u0010MR\u0011\u0010:\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\by\u0010MR\u0011\u0010;\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\bz\u0010MR\u0011\u0010<\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b{\u0010MR\u0011\u00105\u001a\u000206¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0013\u0010?\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b~\u0010OR\u0011\u0010/\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010MR\u0012\u0010!\u001a\u00020 ¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010MR\u0012\u0010\u0007\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010OR\u0018\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030-¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010]R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020\u00030-¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010]R\u0018\u00102\u001a\b\u0012\u0004\u0012\u00020\u00030-¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010]R\u0012\u0010*\u001a\u00020 ¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010MR\u0012\u0010\b\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010OR\u0012\u0010\t\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010OR\u0012\u0010\u0014\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010OR\u0012\u0010\u0015\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010OR\u0012\u0010\u001c\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010OR\u0012\u0010\u001b\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010OR\u0013\u0010\u008c\u0001\u001a\u00020 8F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010MR\u0012\u0010\u000f\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u008e\u0001\u0010OR\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-¢\u0006\t\n\u0000\u001a\u0005\b\u008f\u0001\u0010]R\u0012\u0010\u0010\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0090\u0001\u0010OR\u0012\u0010\u0011\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0091\u0001\u0010OR\u0012\u0010\u0012\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0092\u0001\u0010OR\u0012\u0010\u0013\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010OR\u0012\u0010&\u001a\u00020\u0006¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010O¨\u0006ä\u0001"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "", "seen1", "", "seen2", "firstLayerTitle", "", "secondLayerTitle", "tabsPurposeLabel", "tabsVendorsLabel", "labelsFeatures", "labelsIabVendors", "labelsNonIabPurposes", "labelsNonIabVendors", "labelsPurposes", "vendorFeatures", "vendorLegitimateInterestPurposes", "vendorPurpose", "vendorSpecialFeatures", "vendorSpecialPurposes", "togglesConsentToggleLabel", "togglesLegIntToggleLabel", "buttonsAcceptAllLabel", "buttonsDenyAllLabel", "buttonsSaveLabel", "linksManageSettingsLabel", "linksVendorListLinkLabel", "togglesSpecialFeaturesToggleOn", "togglesSpecialFeaturesToggleOff", "firstLayerMobileVariant", "Lcom/usercentrics/sdk/v2/settings/data/FirstLayerMobileVariant;", "firstLayerHideToggles", "", "secondLayerHideToggles", "hideLegitimateInterestToggles", "categoriesOfDataLabel", "dataRetentionPeriodLabel", "legitimateInterestLabel", "version", "examplesLabel", "cmpId", "cmpVersion", "showDataSharedOutsideEUText", "dataSharedOutsideEUText", "vendorIdsOutsideEUList", "", "firstLayerHideButtonDeny", "secondLayerHideButtonDeny", "publisherCountryCode", "purposeOneTreatment", "selectedVendorIds", "gdprApplies", "selectedStacks", "scope", "Lcom/usercentrics/sdk/v2/settings/data/TCF2Scope;", "disabledSpecialFeatures", "firstLayerShowDescriptions", "hideNonIabOnFirstLayer", "resurfacePeriodEnded", "resurfacePurposeChanged", "resurfaceVendorAdded", "firstLayerDescription", "firstLayerAdditionalInfo", "secondLayerDescription", "appLayerNoteResurface", "firstLayerNoteResurface", "changedPurposes", "Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;", "acmV2Enabled", "selectedATPIds", "resurfaceATPListChanged", "atpListTitle", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/FirstLayerMobileVariant;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/util/List;ZLjava/util/List;Lcom/usercentrics/sdk/v2/settings/data/TCF2Scope;Ljava/util/List;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;ZLjava/util/List;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/FirstLayerMobileVariant;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/util/List;ZLjava/util/List;Lcom/usercentrics/sdk/v2/settings/data/TCF2Scope;Ljava/util/List;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;ZLjava/util/List;ZLjava/lang/String;)V", "getAcmV2Enabled", "()Z", "getAppLayerNoteResurface", "()Ljava/lang/String;", "getAtpListTitle", "getButtonsAcceptAllLabel", "getButtonsDenyAllLabel", "getButtonsSaveLabel", "getCategoriesOfDataLabel", "getChangedPurposes", "()Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;", "getCmpId", "()I", "getCmpVersion", "getDataRetentionPeriodLabel", "getDataSharedOutsideEUText", "getDisabledSpecialFeatures", "()Ljava/util/List;", "getExamplesLabel", "getFirstLayerAdditionalInfo", "getFirstLayerDescription", "getFirstLayerHideButtonDeny", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getFirstLayerHideToggles", "getFirstLayerMobileVariant", "()Lcom/usercentrics/sdk/v2/settings/data/FirstLayerMobileVariant;", "getFirstLayerNoteResurface", "getFirstLayerShowDescriptions", "getFirstLayerTitle", "getGdprApplies", "getHideLegitimateInterestToggles", "getHideNonIabOnFirstLayer", "isServiceSpecific", "getLabelsFeatures", "getLabelsIabVendors", "getLabelsNonIabPurposes", "getLabelsNonIabVendors", "getLabelsPurposes", "getLegitimateInterestLabel", "getLinksManageSettingsLabel", "getLinksVendorListLinkLabel", "getPublisherCountryCode", "getPurposeOneTreatment", "getResurfaceATPListChanged", "getResurfacePeriodEnded", "getResurfacePurposeChanged", "getResurfaceVendorAdded", "getScope", "()Lcom/usercentrics/sdk/v2/settings/data/TCF2Scope;", "getSecondLayerDescription", "getSecondLayerHideButtonDeny", "getSecondLayerHideToggles", "getSecondLayerTitle", "getSelectedATPIds", "getSelectedStacks", "getSelectedVendorIds", "getShowDataSharedOutsideEUText", "getTabsPurposeLabel", "getTabsVendorsLabel", "getTogglesConsentToggleLabel", "getTogglesLegIntToggleLabel", "getTogglesSpecialFeaturesToggleOff", "getTogglesSpecialFeaturesToggleOn", "useGranularChoice", "getUseGranularChoice", "getVendorFeatures", "getVendorIdsOutsideEUList", "getVendorLegitimateInterestPurposes", "getVendorPurpose", "getVendorSpecialFeatures", "getVendorSpecialPurposes", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/FirstLayerMobileVariant;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/util/List;Ljava/lang/Boolean;ZLjava/lang/String;ZLjava/util/List;ZLjava/util/List;Lcom/usercentrics/sdk/v2/settings/data/TCF2Scope;Ljava/util/List;ZZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/TCF2ChangedPurposes;ZLjava/util/List;ZLjava/lang/String;)Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "equals", "other", "hashCode", "isAdditionalConsentModeEnabled", "isAdditionalConsentModeEnabled$usercentrics_release", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$usercentrics_release", "$serializer", k.M, "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class TCF2Settings {
    private final boolean acmV2Enabled;
    private final String appLayerNoteResurface;
    private final String atpListTitle;
    private final String buttonsAcceptAllLabel;
    private final String buttonsDenyAllLabel;
    private final String buttonsSaveLabel;
    private final String categoriesOfDataLabel;
    private final TCF2ChangedPurposes changedPurposes;
    private final int cmpId;
    private final int cmpVersion;
    private final String dataRetentionPeriodLabel;
    private final String dataSharedOutsideEUText;
    private final List<Integer> disabledSpecialFeatures;
    private final String examplesLabel;
    private final String firstLayerAdditionalInfo;
    private final String firstLayerDescription;
    private final Boolean firstLayerHideButtonDeny;
    private final boolean firstLayerHideToggles;
    private final FirstLayerMobileVariant firstLayerMobileVariant;
    private final String firstLayerNoteResurface;
    private final boolean firstLayerShowDescriptions;
    private final String firstLayerTitle;
    private final boolean gdprApplies;
    private final boolean hideLegitimateInterestToggles;
    private final boolean hideNonIabOnFirstLayer;
    private final String labelsFeatures;
    private final String labelsIabVendors;
    private final String labelsNonIabPurposes;
    private final String labelsNonIabVendors;
    private final String labelsPurposes;
    private final String legitimateInterestLabel;
    private final String linksManageSettingsLabel;
    private final String linksVendorListLinkLabel;
    private final String publisherCountryCode;
    private final boolean purposeOneTreatment;
    private final boolean resurfaceATPListChanged;
    private final boolean resurfacePeriodEnded;
    private final boolean resurfacePurposeChanged;
    private final boolean resurfaceVendorAdded;
    private final TCF2Scope scope;
    private final String secondLayerDescription;
    private final boolean secondLayerHideButtonDeny;
    private final boolean secondLayerHideToggles;
    private final String secondLayerTitle;
    private final List<Integer> selectedATPIds;
    private final List<Integer> selectedStacks;
    private final List<Integer> selectedVendorIds;
    private final boolean showDataSharedOutsideEUText;
    private final String tabsPurposeLabel;
    private final String tabsVendorsLabel;
    private final String togglesConsentToggleLabel;
    private final String togglesLegIntToggleLabel;
    private final String togglesSpecialFeaturesToggleOff;
    private final String togglesSpecialFeaturesToggleOn;
    private final String vendorFeatures;
    private final List<Integer> vendorIdsOutsideEUList;
    private final String vendorLegitimateInterestPurposes;
    private final String vendorPurpose;
    private final String vendorSpecialFeatures;
    private final String vendorSpecialPurposes;
    private final String version;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new EnumSerializer("com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant", FirstLayerMobileVariant.values()), null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, new ArrayListSerializer(IntSerializer.INSTANCE), new EnumSerializer("com.usercentrics.sdk.v2.settings.data.TCF2Scope", TCF2Scope.values()), new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null};

    public static /* synthetic */ TCF2Settings copy$default(TCF2Settings tCF2Settings, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, FirstLayerMobileVariant firstLayerMobileVariant, boolean z, boolean z2, boolean z3, String str24, String str25, String str26, String str27, String str28, int i, int i2, boolean z4, String str29, List list, Boolean bool, boolean z5, String str30, boolean z6, List list2, boolean z7, List list3, TCF2Scope tCF2Scope, List list4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str31, String str32, String str33, String str34, String str35, TCF2ChangedPurposes tCF2ChangedPurposes, boolean z13, List list5, boolean z14, String str36, int i3, int i4, Object obj) {
        String str37 = (i3 & 1) != 0 ? tCF2Settings.firstLayerTitle : str;
        return tCF2Settings.copy(str37, (i3 & 2) != 0 ? tCF2Settings.secondLayerTitle : str2, (i3 & 4) != 0 ? tCF2Settings.tabsPurposeLabel : str3, (i3 & 8) != 0 ? tCF2Settings.tabsVendorsLabel : str4, (i3 & 16) != 0 ? tCF2Settings.labelsFeatures : str5, (i3 & 32) != 0 ? tCF2Settings.labelsIabVendors : str6, (i3 & 64) != 0 ? tCF2Settings.labelsNonIabPurposes : str7, (i3 & 128) != 0 ? tCF2Settings.labelsNonIabVendors : str8, (i3 & 256) != 0 ? tCF2Settings.labelsPurposes : str9, (i3 & 512) != 0 ? tCF2Settings.vendorFeatures : str10, (i3 & 1024) != 0 ? tCF2Settings.vendorLegitimateInterestPurposes : str11, (i3 & 2048) != 0 ? tCF2Settings.vendorPurpose : str12, (i3 & 4096) != 0 ? tCF2Settings.vendorSpecialFeatures : str13, (i3 & 8192) != 0 ? tCF2Settings.vendorSpecialPurposes : str14, (i3 & 16384) != 0 ? tCF2Settings.togglesConsentToggleLabel : str15, (i3 & 32768) != 0 ? tCF2Settings.togglesLegIntToggleLabel : str16, (i3 & 65536) != 0 ? tCF2Settings.buttonsAcceptAllLabel : str17, (i3 & 131072) != 0 ? tCF2Settings.buttonsDenyAllLabel : str18, (i3 & 262144) != 0 ? tCF2Settings.buttonsSaveLabel : str19, (i3 & 524288) != 0 ? tCF2Settings.linksManageSettingsLabel : str20, (i3 & 1048576) != 0 ? tCF2Settings.linksVendorListLinkLabel : str21, (i3 & 2097152) != 0 ? tCF2Settings.togglesSpecialFeaturesToggleOn : str22, (i3 & 4194304) != 0 ? tCF2Settings.togglesSpecialFeaturesToggleOff : str23, (i3 & 8388608) != 0 ? tCF2Settings.firstLayerMobileVariant : firstLayerMobileVariant, (i3 & 16777216) != 0 ? tCF2Settings.firstLayerHideToggles : z, (i3 & 33554432) != 0 ? tCF2Settings.secondLayerHideToggles : z2, (i3 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? tCF2Settings.hideLegitimateInterestToggles : z3, (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? tCF2Settings.categoriesOfDataLabel : str24, (i3 & 268435456) != 0 ? tCF2Settings.dataRetentionPeriodLabel : str25, (i3 & 536870912) != 0 ? tCF2Settings.legitimateInterestLabel : str26, (i3 & 1073741824) != 0 ? tCF2Settings.version : str27, (i3 & Integer.MIN_VALUE) != 0 ? tCF2Settings.examplesLabel : str28, (i4 & 1) != 0 ? tCF2Settings.cmpId : i, (i4 & 2) != 0 ? tCF2Settings.cmpVersion : i2, (i4 & 4) != 0 ? tCF2Settings.showDataSharedOutsideEUText : z4, (i4 & 8) != 0 ? tCF2Settings.dataSharedOutsideEUText : str29, (i4 & 16) != 0 ? tCF2Settings.vendorIdsOutsideEUList : list, (i4 & 32) != 0 ? tCF2Settings.firstLayerHideButtonDeny : bool, (i4 & 64) != 0 ? tCF2Settings.secondLayerHideButtonDeny : z5, (i4 & 128) != 0 ? tCF2Settings.publisherCountryCode : str30, (i4 & 256) != 0 ? tCF2Settings.purposeOneTreatment : z6, (i4 & 512) != 0 ? tCF2Settings.selectedVendorIds : list2, (i4 & 1024) != 0 ? tCF2Settings.gdprApplies : z7, (i4 & 2048) != 0 ? tCF2Settings.selectedStacks : list3, (i4 & 4096) != 0 ? tCF2Settings.scope : tCF2Scope, (i4 & 8192) != 0 ? tCF2Settings.disabledSpecialFeatures : list4, (i4 & 16384) != 0 ? tCF2Settings.firstLayerShowDescriptions : z8, (i4 & 32768) != 0 ? tCF2Settings.hideNonIabOnFirstLayer : z9, (i4 & 65536) != 0 ? tCF2Settings.resurfacePeriodEnded : z10, (i4 & 131072) != 0 ? tCF2Settings.resurfacePurposeChanged : z11, (i4 & 262144) != 0 ? tCF2Settings.resurfaceVendorAdded : z12, (i4 & 524288) != 0 ? tCF2Settings.firstLayerDescription : str31, (i4 & 1048576) != 0 ? tCF2Settings.firstLayerAdditionalInfo : str32, (i4 & 2097152) != 0 ? tCF2Settings.secondLayerDescription : str33, (i4 & 4194304) != 0 ? tCF2Settings.appLayerNoteResurface : str34, (i4 & 8388608) != 0 ? tCF2Settings.firstLayerNoteResurface : str35, (i4 & 16777216) != 0 ? tCF2Settings.changedPurposes : tCF2ChangedPurposes, (i4 & 33554432) != 0 ? tCF2Settings.acmV2Enabled : z13, (i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? tCF2Settings.selectedATPIds : list5, (i4 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? tCF2Settings.resurfaceATPListChanged : z14, (i4 & 268435456) != 0 ? tCF2Settings.atpListTitle : str36);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFirstLayerTitle() {
        return this.firstLayerTitle;
    }

    /* renamed from: component10, reason: from getter */
    public final String getVendorFeatures() {
        return this.vendorFeatures;
    }

    /* renamed from: component11, reason: from getter */
    public final String getVendorLegitimateInterestPurposes() {
        return this.vendorLegitimateInterestPurposes;
    }

    /* renamed from: component12, reason: from getter */
    public final String getVendorPurpose() {
        return this.vendorPurpose;
    }

    /* renamed from: component13, reason: from getter */
    public final String getVendorSpecialFeatures() {
        return this.vendorSpecialFeatures;
    }

    /* renamed from: component14, reason: from getter */
    public final String getVendorSpecialPurposes() {
        return this.vendorSpecialPurposes;
    }

    /* renamed from: component15, reason: from getter */
    public final String getTogglesConsentToggleLabel() {
        return this.togglesConsentToggleLabel;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTogglesLegIntToggleLabel() {
        return this.togglesLegIntToggleLabel;
    }

    /* renamed from: component17, reason: from getter */
    public final String getButtonsAcceptAllLabel() {
        return this.buttonsAcceptAllLabel;
    }

    /* renamed from: component18, reason: from getter */
    public final String getButtonsDenyAllLabel() {
        return this.buttonsDenyAllLabel;
    }

    /* renamed from: component19, reason: from getter */
    public final String getButtonsSaveLabel() {
        return this.buttonsSaveLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSecondLayerTitle() {
        return this.secondLayerTitle;
    }

    /* renamed from: component20, reason: from getter */
    public final String getLinksManageSettingsLabel() {
        return this.linksManageSettingsLabel;
    }

    /* renamed from: component21, reason: from getter */
    public final String getLinksVendorListLinkLabel() {
        return this.linksVendorListLinkLabel;
    }

    /* renamed from: component22, reason: from getter */
    public final String getTogglesSpecialFeaturesToggleOn() {
        return this.togglesSpecialFeaturesToggleOn;
    }

    /* renamed from: component23, reason: from getter */
    public final String getTogglesSpecialFeaturesToggleOff() {
        return this.togglesSpecialFeaturesToggleOff;
    }

    /* renamed from: component24, reason: from getter */
    public final FirstLayerMobileVariant getFirstLayerMobileVariant() {
        return this.firstLayerMobileVariant;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getFirstLayerHideToggles() {
        return this.firstLayerHideToggles;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getSecondLayerHideToggles() {
        return this.secondLayerHideToggles;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getHideLegitimateInterestToggles() {
        return this.hideLegitimateInterestToggles;
    }

    /* renamed from: component28, reason: from getter */
    public final String getCategoriesOfDataLabel() {
        return this.categoriesOfDataLabel;
    }

    /* renamed from: component29, reason: from getter */
    public final String getDataRetentionPeriodLabel() {
        return this.dataRetentionPeriodLabel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTabsPurposeLabel() {
        return this.tabsPurposeLabel;
    }

    /* renamed from: component30, reason: from getter */
    public final String getLegitimateInterestLabel() {
        return this.legitimateInterestLabel;
    }

    /* renamed from: component31, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component32, reason: from getter */
    public final String getExamplesLabel() {
        return this.examplesLabel;
    }

    /* renamed from: component33, reason: from getter */
    public final int getCmpId() {
        return this.cmpId;
    }

    /* renamed from: component34, reason: from getter */
    public final int getCmpVersion() {
        return this.cmpVersion;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getShowDataSharedOutsideEUText() {
        return this.showDataSharedOutsideEUText;
    }

    /* renamed from: component36, reason: from getter */
    public final String getDataSharedOutsideEUText() {
        return this.dataSharedOutsideEUText;
    }

    public final List<Integer> component37() {
        return this.vendorIdsOutsideEUList;
    }

    /* renamed from: component38, reason: from getter */
    public final Boolean getFirstLayerHideButtonDeny() {
        return this.firstLayerHideButtonDeny;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getSecondLayerHideButtonDeny() {
        return this.secondLayerHideButtonDeny;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTabsVendorsLabel() {
        return this.tabsVendorsLabel;
    }

    /* renamed from: component40, reason: from getter */
    public final String getPublisherCountryCode() {
        return this.publisherCountryCode;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final List<Integer> component42() {
        return this.selectedVendorIds;
    }

    /* renamed from: component43, reason: from getter */
    public final boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final List<Integer> component44() {
        return this.selectedStacks;
    }

    /* renamed from: component45, reason: from getter */
    public final TCF2Scope getScope() {
        return this.scope;
    }

    public final List<Integer> component46() {
        return this.disabledSpecialFeatures;
    }

    /* renamed from: component47, reason: from getter */
    public final boolean getFirstLayerShowDescriptions() {
        return this.firstLayerShowDescriptions;
    }

    /* renamed from: component48, reason: from getter */
    public final boolean getHideNonIabOnFirstLayer() {
        return this.hideNonIabOnFirstLayer;
    }

    /* renamed from: component49, reason: from getter */
    public final boolean getResurfacePeriodEnded() {
        return this.resurfacePeriodEnded;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLabelsFeatures() {
        return this.labelsFeatures;
    }

    /* renamed from: component50, reason: from getter */
    public final boolean getResurfacePurposeChanged() {
        return this.resurfacePurposeChanged;
    }

    /* renamed from: component51, reason: from getter */
    public final boolean getResurfaceVendorAdded() {
        return this.resurfaceVendorAdded;
    }

    /* renamed from: component52, reason: from getter */
    public final String getFirstLayerDescription() {
        return this.firstLayerDescription;
    }

    /* renamed from: component53, reason: from getter */
    public final String getFirstLayerAdditionalInfo() {
        return this.firstLayerAdditionalInfo;
    }

    /* renamed from: component54, reason: from getter */
    public final String getSecondLayerDescription() {
        return this.secondLayerDescription;
    }

    /* renamed from: component55, reason: from getter */
    public final String getAppLayerNoteResurface() {
        return this.appLayerNoteResurface;
    }

    /* renamed from: component56, reason: from getter */
    public final String getFirstLayerNoteResurface() {
        return this.firstLayerNoteResurface;
    }

    /* renamed from: component57, reason: from getter */
    public final TCF2ChangedPurposes getChangedPurposes() {
        return this.changedPurposes;
    }

    /* renamed from: component58, reason: from getter */
    public final boolean getAcmV2Enabled() {
        return this.acmV2Enabled;
    }

    public final List<Integer> component59() {
        return this.selectedATPIds;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLabelsIabVendors() {
        return this.labelsIabVendors;
    }

    /* renamed from: component60, reason: from getter */
    public final boolean getResurfaceATPListChanged() {
        return this.resurfaceATPListChanged;
    }

    /* renamed from: component61, reason: from getter */
    public final String getAtpListTitle() {
        return this.atpListTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLabelsNonIabPurposes() {
        return this.labelsNonIabPurposes;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLabelsNonIabVendors() {
        return this.labelsNonIabVendors;
    }

    /* renamed from: component9, reason: from getter */
    public final String getLabelsPurposes() {
        return this.labelsPurposes;
    }

    public final TCF2Settings copy(String firstLayerTitle, String secondLayerTitle, String tabsPurposeLabel, String tabsVendorsLabel, String labelsFeatures, String labelsIabVendors, String labelsNonIabPurposes, String labelsNonIabVendors, String labelsPurposes, String vendorFeatures, String vendorLegitimateInterestPurposes, String vendorPurpose, String vendorSpecialFeatures, String vendorSpecialPurposes, String togglesConsentToggleLabel, String togglesLegIntToggleLabel, String buttonsAcceptAllLabel, String buttonsDenyAllLabel, String buttonsSaveLabel, String linksManageSettingsLabel, String linksVendorListLinkLabel, String togglesSpecialFeaturesToggleOn, String togglesSpecialFeaturesToggleOff, FirstLayerMobileVariant firstLayerMobileVariant, boolean firstLayerHideToggles, boolean secondLayerHideToggles, boolean hideLegitimateInterestToggles, String categoriesOfDataLabel, String dataRetentionPeriodLabel, String legitimateInterestLabel, String version, String examplesLabel, int cmpId, int cmpVersion, boolean showDataSharedOutsideEUText, String dataSharedOutsideEUText, List<Integer> vendorIdsOutsideEUList, Boolean firstLayerHideButtonDeny, boolean secondLayerHideButtonDeny, String publisherCountryCode, boolean purposeOneTreatment, List<Integer> selectedVendorIds, boolean gdprApplies, List<Integer> selectedStacks, TCF2Scope scope, List<Integer> disabledSpecialFeatures, boolean firstLayerShowDescriptions, boolean hideNonIabOnFirstLayer, boolean resurfacePeriodEnded, boolean resurfacePurposeChanged, boolean resurfaceVendorAdded, String firstLayerDescription, String firstLayerAdditionalInfo, String secondLayerDescription, String appLayerNoteResurface, String firstLayerNoteResurface, TCF2ChangedPurposes changedPurposes, boolean acmV2Enabled, List<Integer> selectedATPIds, boolean resurfaceATPListChanged, String atpListTitle) {
        Intrinsics.checkNotNullParameter(firstLayerTitle, "firstLayerTitle");
        Intrinsics.checkNotNullParameter(secondLayerTitle, "secondLayerTitle");
        Intrinsics.checkNotNullParameter(tabsPurposeLabel, "tabsPurposeLabel");
        Intrinsics.checkNotNullParameter(tabsVendorsLabel, "tabsVendorsLabel");
        Intrinsics.checkNotNullParameter(labelsFeatures, "labelsFeatures");
        Intrinsics.checkNotNullParameter(labelsIabVendors, "labelsIabVendors");
        Intrinsics.checkNotNullParameter(labelsNonIabPurposes, "labelsNonIabPurposes");
        Intrinsics.checkNotNullParameter(labelsNonIabVendors, "labelsNonIabVendors");
        Intrinsics.checkNotNullParameter(labelsPurposes, "labelsPurposes");
        Intrinsics.checkNotNullParameter(vendorFeatures, "vendorFeatures");
        Intrinsics.checkNotNullParameter(vendorLegitimateInterestPurposes, "vendorLegitimateInterestPurposes");
        Intrinsics.checkNotNullParameter(vendorPurpose, "vendorPurpose");
        Intrinsics.checkNotNullParameter(vendorSpecialFeatures, "vendorSpecialFeatures");
        Intrinsics.checkNotNullParameter(vendorSpecialPurposes, "vendorSpecialPurposes");
        Intrinsics.checkNotNullParameter(togglesConsentToggleLabel, "togglesConsentToggleLabel");
        Intrinsics.checkNotNullParameter(togglesLegIntToggleLabel, "togglesLegIntToggleLabel");
        Intrinsics.checkNotNullParameter(buttonsAcceptAllLabel, "buttonsAcceptAllLabel");
        Intrinsics.checkNotNullParameter(buttonsDenyAllLabel, "buttonsDenyAllLabel");
        Intrinsics.checkNotNullParameter(buttonsSaveLabel, "buttonsSaveLabel");
        Intrinsics.checkNotNullParameter(linksManageSettingsLabel, "linksManageSettingsLabel");
        Intrinsics.checkNotNullParameter(linksVendorListLinkLabel, "linksVendorListLinkLabel");
        Intrinsics.checkNotNullParameter(togglesSpecialFeaturesToggleOn, "togglesSpecialFeaturesToggleOn");
        Intrinsics.checkNotNullParameter(togglesSpecialFeaturesToggleOff, "togglesSpecialFeaturesToggleOff");
        Intrinsics.checkNotNullParameter(categoriesOfDataLabel, "categoriesOfDataLabel");
        Intrinsics.checkNotNullParameter(dataRetentionPeriodLabel, "dataRetentionPeriodLabel");
        Intrinsics.checkNotNullParameter(legitimateInterestLabel, "legitimateInterestLabel");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(examplesLabel, "examplesLabel");
        Intrinsics.checkNotNullParameter(vendorIdsOutsideEUList, "vendorIdsOutsideEUList");
        Intrinsics.checkNotNullParameter(publisherCountryCode, "publisherCountryCode");
        Intrinsics.checkNotNullParameter(selectedVendorIds, "selectedVendorIds");
        Intrinsics.checkNotNullParameter(selectedStacks, "selectedStacks");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(disabledSpecialFeatures, "disabledSpecialFeatures");
        Intrinsics.checkNotNullParameter(selectedATPIds, "selectedATPIds");
        Intrinsics.checkNotNullParameter(atpListTitle, "atpListTitle");
        return new TCF2Settings(firstLayerTitle, secondLayerTitle, tabsPurposeLabel, tabsVendorsLabel, labelsFeatures, labelsIabVendors, labelsNonIabPurposes, labelsNonIabVendors, labelsPurposes, vendorFeatures, vendorLegitimateInterestPurposes, vendorPurpose, vendorSpecialFeatures, vendorSpecialPurposes, togglesConsentToggleLabel, togglesLegIntToggleLabel, buttonsAcceptAllLabel, buttonsDenyAllLabel, buttonsSaveLabel, linksManageSettingsLabel, linksVendorListLinkLabel, togglesSpecialFeaturesToggleOn, togglesSpecialFeaturesToggleOff, firstLayerMobileVariant, firstLayerHideToggles, secondLayerHideToggles, hideLegitimateInterestToggles, categoriesOfDataLabel, dataRetentionPeriodLabel, legitimateInterestLabel, version, examplesLabel, cmpId, cmpVersion, showDataSharedOutsideEUText, dataSharedOutsideEUText, vendorIdsOutsideEUList, firstLayerHideButtonDeny, secondLayerHideButtonDeny, publisherCountryCode, purposeOneTreatment, selectedVendorIds, gdprApplies, selectedStacks, scope, disabledSpecialFeatures, firstLayerShowDescriptions, hideNonIabOnFirstLayer, resurfacePeriodEnded, resurfacePurposeChanged, resurfaceVendorAdded, firstLayerDescription, firstLayerAdditionalInfo, secondLayerDescription, appLayerNoteResurface, firstLayerNoteResurface, changedPurposes, acmV2Enabled, selectedATPIds, resurfaceATPListChanged, atpListTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TCF2Settings)) {
            return false;
        }
        TCF2Settings tCF2Settings = (TCF2Settings) other;
        return Intrinsics.areEqual(this.firstLayerTitle, tCF2Settings.firstLayerTitle) && Intrinsics.areEqual(this.secondLayerTitle, tCF2Settings.secondLayerTitle) && Intrinsics.areEqual(this.tabsPurposeLabel, tCF2Settings.tabsPurposeLabel) && Intrinsics.areEqual(this.tabsVendorsLabel, tCF2Settings.tabsVendorsLabel) && Intrinsics.areEqual(this.labelsFeatures, tCF2Settings.labelsFeatures) && Intrinsics.areEqual(this.labelsIabVendors, tCF2Settings.labelsIabVendors) && Intrinsics.areEqual(this.labelsNonIabPurposes, tCF2Settings.labelsNonIabPurposes) && Intrinsics.areEqual(this.labelsNonIabVendors, tCF2Settings.labelsNonIabVendors) && Intrinsics.areEqual(this.labelsPurposes, tCF2Settings.labelsPurposes) && Intrinsics.areEqual(this.vendorFeatures, tCF2Settings.vendorFeatures) && Intrinsics.areEqual(this.vendorLegitimateInterestPurposes, tCF2Settings.vendorLegitimateInterestPurposes) && Intrinsics.areEqual(this.vendorPurpose, tCF2Settings.vendorPurpose) && Intrinsics.areEqual(this.vendorSpecialFeatures, tCF2Settings.vendorSpecialFeatures) && Intrinsics.areEqual(this.vendorSpecialPurposes, tCF2Settings.vendorSpecialPurposes) && Intrinsics.areEqual(this.togglesConsentToggleLabel, tCF2Settings.togglesConsentToggleLabel) && Intrinsics.areEqual(this.togglesLegIntToggleLabel, tCF2Settings.togglesLegIntToggleLabel) && Intrinsics.areEqual(this.buttonsAcceptAllLabel, tCF2Settings.buttonsAcceptAllLabel) && Intrinsics.areEqual(this.buttonsDenyAllLabel, tCF2Settings.buttonsDenyAllLabel) && Intrinsics.areEqual(this.buttonsSaveLabel, tCF2Settings.buttonsSaveLabel) && Intrinsics.areEqual(this.linksManageSettingsLabel, tCF2Settings.linksManageSettingsLabel) && Intrinsics.areEqual(this.linksVendorListLinkLabel, tCF2Settings.linksVendorListLinkLabel) && Intrinsics.areEqual(this.togglesSpecialFeaturesToggleOn, tCF2Settings.togglesSpecialFeaturesToggleOn) && Intrinsics.areEqual(this.togglesSpecialFeaturesToggleOff, tCF2Settings.togglesSpecialFeaturesToggleOff) && this.firstLayerMobileVariant == tCF2Settings.firstLayerMobileVariant && this.firstLayerHideToggles == tCF2Settings.firstLayerHideToggles && this.secondLayerHideToggles == tCF2Settings.secondLayerHideToggles && this.hideLegitimateInterestToggles == tCF2Settings.hideLegitimateInterestToggles && Intrinsics.areEqual(this.categoriesOfDataLabel, tCF2Settings.categoriesOfDataLabel) && Intrinsics.areEqual(this.dataRetentionPeriodLabel, tCF2Settings.dataRetentionPeriodLabel) && Intrinsics.areEqual(this.legitimateInterestLabel, tCF2Settings.legitimateInterestLabel) && Intrinsics.areEqual(this.version, tCF2Settings.version) && Intrinsics.areEqual(this.examplesLabel, tCF2Settings.examplesLabel) && this.cmpId == tCF2Settings.cmpId && this.cmpVersion == tCF2Settings.cmpVersion && this.showDataSharedOutsideEUText == tCF2Settings.showDataSharedOutsideEUText && Intrinsics.areEqual(this.dataSharedOutsideEUText, tCF2Settings.dataSharedOutsideEUText) && Intrinsics.areEqual(this.vendorIdsOutsideEUList, tCF2Settings.vendorIdsOutsideEUList) && Intrinsics.areEqual(this.firstLayerHideButtonDeny, tCF2Settings.firstLayerHideButtonDeny) && this.secondLayerHideButtonDeny == tCF2Settings.secondLayerHideButtonDeny && Intrinsics.areEqual(this.publisherCountryCode, tCF2Settings.publisherCountryCode) && this.purposeOneTreatment == tCF2Settings.purposeOneTreatment && Intrinsics.areEqual(this.selectedVendorIds, tCF2Settings.selectedVendorIds) && this.gdprApplies == tCF2Settings.gdprApplies && Intrinsics.areEqual(this.selectedStacks, tCF2Settings.selectedStacks) && this.scope == tCF2Settings.scope && Intrinsics.areEqual(this.disabledSpecialFeatures, tCF2Settings.disabledSpecialFeatures) && this.firstLayerShowDescriptions == tCF2Settings.firstLayerShowDescriptions && this.hideNonIabOnFirstLayer == tCF2Settings.hideNonIabOnFirstLayer && this.resurfacePeriodEnded == tCF2Settings.resurfacePeriodEnded && this.resurfacePurposeChanged == tCF2Settings.resurfacePurposeChanged && this.resurfaceVendorAdded == tCF2Settings.resurfaceVendorAdded && Intrinsics.areEqual(this.firstLayerDescription, tCF2Settings.firstLayerDescription) && Intrinsics.areEqual(this.firstLayerAdditionalInfo, tCF2Settings.firstLayerAdditionalInfo) && Intrinsics.areEqual(this.secondLayerDescription, tCF2Settings.secondLayerDescription) && Intrinsics.areEqual(this.appLayerNoteResurface, tCF2Settings.appLayerNoteResurface) && Intrinsics.areEqual(this.firstLayerNoteResurface, tCF2Settings.firstLayerNoteResurface) && Intrinsics.areEqual(this.changedPurposes, tCF2Settings.changedPurposes) && this.acmV2Enabled == tCF2Settings.acmV2Enabled && Intrinsics.areEqual(this.selectedATPIds, tCF2Settings.selectedATPIds) && this.resurfaceATPListChanged == tCF2Settings.resurfaceATPListChanged && Intrinsics.areEqual(this.atpListTitle, tCF2Settings.atpListTitle);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.firstLayerTitle.hashCode() * 31) + this.secondLayerTitle.hashCode()) * 31) + this.tabsPurposeLabel.hashCode()) * 31) + this.tabsVendorsLabel.hashCode()) * 31) + this.labelsFeatures.hashCode()) * 31) + this.labelsIabVendors.hashCode()) * 31) + this.labelsNonIabPurposes.hashCode()) * 31) + this.labelsNonIabVendors.hashCode()) * 31) + this.labelsPurposes.hashCode()) * 31) + this.vendorFeatures.hashCode()) * 31) + this.vendorLegitimateInterestPurposes.hashCode()) * 31) + this.vendorPurpose.hashCode()) * 31) + this.vendorSpecialFeatures.hashCode()) * 31) + this.vendorSpecialPurposes.hashCode()) * 31) + this.togglesConsentToggleLabel.hashCode()) * 31) + this.togglesLegIntToggleLabel.hashCode()) * 31) + this.buttonsAcceptAllLabel.hashCode()) * 31) + this.buttonsDenyAllLabel.hashCode()) * 31) + this.buttonsSaveLabel.hashCode()) * 31) + this.linksManageSettingsLabel.hashCode()) * 31) + this.linksVendorListLinkLabel.hashCode()) * 31) + this.togglesSpecialFeaturesToggleOn.hashCode()) * 31) + this.togglesSpecialFeaturesToggleOff.hashCode()) * 31;
        FirstLayerMobileVariant firstLayerMobileVariant = this.firstLayerMobileVariant;
        int hashCode2 = (((((((((((((((((((((((hashCode + (firstLayerMobileVariant == null ? 0 : firstLayerMobileVariant.hashCode())) * 31) + Boolean.hashCode(this.firstLayerHideToggles)) * 31) + Boolean.hashCode(this.secondLayerHideToggles)) * 31) + Boolean.hashCode(this.hideLegitimateInterestToggles)) * 31) + this.categoriesOfDataLabel.hashCode()) * 31) + this.dataRetentionPeriodLabel.hashCode()) * 31) + this.legitimateInterestLabel.hashCode()) * 31) + this.version.hashCode()) * 31) + this.examplesLabel.hashCode()) * 31) + Integer.hashCode(this.cmpId)) * 31) + Integer.hashCode(this.cmpVersion)) * 31) + Boolean.hashCode(this.showDataSharedOutsideEUText)) * 31;
        String str = this.dataSharedOutsideEUText;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.vendorIdsOutsideEUList.hashCode()) * 31;
        Boolean bool = this.firstLayerHideButtonDeny;
        int hashCode4 = (((((((((((((((((((((((((((hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.secondLayerHideButtonDeny)) * 31) + this.publisherCountryCode.hashCode()) * 31) + Boolean.hashCode(this.purposeOneTreatment)) * 31) + this.selectedVendorIds.hashCode()) * 31) + Boolean.hashCode(this.gdprApplies)) * 31) + this.selectedStacks.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.disabledSpecialFeatures.hashCode()) * 31) + Boolean.hashCode(this.firstLayerShowDescriptions)) * 31) + Boolean.hashCode(this.hideNonIabOnFirstLayer)) * 31) + Boolean.hashCode(this.resurfacePeriodEnded)) * 31) + Boolean.hashCode(this.resurfacePurposeChanged)) * 31) + Boolean.hashCode(this.resurfaceVendorAdded)) * 31;
        String str2 = this.firstLayerDescription;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.firstLayerAdditionalInfo;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.secondLayerDescription;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.appLayerNoteResurface;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.firstLayerNoteResurface;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TCF2ChangedPurposes tCF2ChangedPurposes = this.changedPurposes;
        return ((((((((hashCode9 + (tCF2ChangedPurposes != null ? tCF2ChangedPurposes.hashCode() : 0)) * 31) + Boolean.hashCode(this.acmV2Enabled)) * 31) + this.selectedATPIds.hashCode()) * 31) + Boolean.hashCode(this.resurfaceATPListChanged)) * 31) + this.atpListTitle.hashCode();
    }

    public String toString() {
        return "TCF2Settings(firstLayerTitle=" + this.firstLayerTitle + ", secondLayerTitle=" + this.secondLayerTitle + ", tabsPurposeLabel=" + this.tabsPurposeLabel + ", tabsVendorsLabel=" + this.tabsVendorsLabel + ", labelsFeatures=" + this.labelsFeatures + ", labelsIabVendors=" + this.labelsIabVendors + ", labelsNonIabPurposes=" + this.labelsNonIabPurposes + ", labelsNonIabVendors=" + this.labelsNonIabVendors + ", labelsPurposes=" + this.labelsPurposes + ", vendorFeatures=" + this.vendorFeatures + ", vendorLegitimateInterestPurposes=" + this.vendorLegitimateInterestPurposes + ", vendorPurpose=" + this.vendorPurpose + ", vendorSpecialFeatures=" + this.vendorSpecialFeatures + ", vendorSpecialPurposes=" + this.vendorSpecialPurposes + ", togglesConsentToggleLabel=" + this.togglesConsentToggleLabel + ", togglesLegIntToggleLabel=" + this.togglesLegIntToggleLabel + ", buttonsAcceptAllLabel=" + this.buttonsAcceptAllLabel + ", buttonsDenyAllLabel=" + this.buttonsDenyAllLabel + ", buttonsSaveLabel=" + this.buttonsSaveLabel + ", linksManageSettingsLabel=" + this.linksManageSettingsLabel + ", linksVendorListLinkLabel=" + this.linksVendorListLinkLabel + ", togglesSpecialFeaturesToggleOn=" + this.togglesSpecialFeaturesToggleOn + ", togglesSpecialFeaturesToggleOff=" + this.togglesSpecialFeaturesToggleOff + ", firstLayerMobileVariant=" + this.firstLayerMobileVariant + ", firstLayerHideToggles=" + this.firstLayerHideToggles + ", secondLayerHideToggles=" + this.secondLayerHideToggles + ", hideLegitimateInterestToggles=" + this.hideLegitimateInterestToggles + ", categoriesOfDataLabel=" + this.categoriesOfDataLabel + ", dataRetentionPeriodLabel=" + this.dataRetentionPeriodLabel + ", legitimateInterestLabel=" + this.legitimateInterestLabel + ", version=" + this.version + ", examplesLabel=" + this.examplesLabel + ", cmpId=" + this.cmpId + ", cmpVersion=" + this.cmpVersion + ", showDataSharedOutsideEUText=" + this.showDataSharedOutsideEUText + ", dataSharedOutsideEUText=" + this.dataSharedOutsideEUText + ", vendorIdsOutsideEUList=" + this.vendorIdsOutsideEUList + ", firstLayerHideButtonDeny=" + this.firstLayerHideButtonDeny + ", secondLayerHideButtonDeny=" + this.secondLayerHideButtonDeny + ", publisherCountryCode=" + this.publisherCountryCode + ", purposeOneTreatment=" + this.purposeOneTreatment + ", selectedVendorIds=" + this.selectedVendorIds + ", gdprApplies=" + this.gdprApplies + ", selectedStacks=" + this.selectedStacks + ", scope=" + this.scope + ", disabledSpecialFeatures=" + this.disabledSpecialFeatures + ", firstLayerShowDescriptions=" + this.firstLayerShowDescriptions + ", hideNonIabOnFirstLayer=" + this.hideNonIabOnFirstLayer + ", resurfacePeriodEnded=" + this.resurfacePeriodEnded + ", resurfacePurposeChanged=" + this.resurfacePurposeChanged + ", resurfaceVendorAdded=" + this.resurfaceVendorAdded + ", firstLayerDescription=" + this.firstLayerDescription + ", firstLayerAdditionalInfo=" + this.firstLayerAdditionalInfo + ", secondLayerDescription=" + this.secondLayerDescription + ", appLayerNoteResurface=" + this.appLayerNoteResurface + ", firstLayerNoteResurface=" + this.firstLayerNoteResurface + ", changedPurposes=" + this.changedPurposes + ", acmV2Enabled=" + this.acmV2Enabled + ", selectedATPIds=" + this.selectedATPIds + ", resurfaceATPListChanged=" + this.resurfaceATPListChanged + ", atpListTitle=" + this.atpListTitle + ")";
    }

    /* compiled from: TCF2Settings.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/usercentrics/sdk/v2/settings/data/TCF2Settings;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TCF2Settings> serializer() {
            return TCF2Settings$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TCF2Settings(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, FirstLayerMobileVariant firstLayerMobileVariant, boolean z, boolean z2, boolean z3, String str24, String str25, String str26, String str27, String str28, int i3, int i4, boolean z4, String str29, List list, Boolean bool, boolean z5, String str30, boolean z6, List list2, boolean z7, List list3, TCF2Scope tCF2Scope, List list4, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str31, String str32, String str33, String str34, String str35, TCF2ChangedPurposes tCF2ChangedPurposes, boolean z13, List list5, boolean z14, String str36, SerializationConstructorMarker serializationConstructorMarker) {
        if (8388607 != (i & 8388607)) {
            PluginExceptionsKt.throwArrayMissingFieldException(new int[]{i, i2}, new int[]{8388607, 0}, TCF2Settings$$serializer.INSTANCE.getDescriptor());
        }
        this.firstLayerTitle = str;
        this.secondLayerTitle = str2;
        this.tabsPurposeLabel = str3;
        this.tabsVendorsLabel = str4;
        this.labelsFeatures = str5;
        this.labelsIabVendors = str6;
        this.labelsNonIabPurposes = str7;
        this.labelsNonIabVendors = str8;
        this.labelsPurposes = str9;
        this.vendorFeatures = str10;
        this.vendorLegitimateInterestPurposes = str11;
        this.vendorPurpose = str12;
        this.vendorSpecialFeatures = str13;
        this.vendorSpecialPurposes = str14;
        this.togglesConsentToggleLabel = str15;
        this.togglesLegIntToggleLabel = str16;
        this.buttonsAcceptAllLabel = str17;
        this.buttonsDenyAllLabel = str18;
        this.buttonsSaveLabel = str19;
        this.linksManageSettingsLabel = str20;
        this.linksVendorListLinkLabel = str21;
        this.togglesSpecialFeaturesToggleOn = str22;
        this.togglesSpecialFeaturesToggleOff = str23;
        if ((i & 8388608) == 0) {
            this.firstLayerMobileVariant = null;
        } else {
            this.firstLayerMobileVariant = firstLayerMobileVariant;
        }
        if ((i & 16777216) == 0) {
            this.firstLayerHideToggles = false;
        } else {
            this.firstLayerHideToggles = z;
        }
        if ((i & 33554432) == 0) {
            this.secondLayerHideToggles = false;
        } else {
            this.secondLayerHideToggles = z2;
        }
        if ((i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0) {
            this.hideLegitimateInterestToggles = false;
        } else {
            this.hideLegitimateInterestToggles = z3;
        }
        if ((i & C.BUFFER_FLAG_FIRST_SAMPLE) == 0) {
            this.categoriesOfDataLabel = "";
        } else {
            this.categoriesOfDataLabel = str24;
        }
        if ((i & 268435456) == 0) {
            this.dataRetentionPeriodLabel = "";
        } else {
            this.dataRetentionPeriodLabel = str25;
        }
        if ((536870912 & i) == 0) {
            this.legitimateInterestLabel = "";
        } else {
            this.legitimateInterestLabel = str26;
        }
        if ((1073741824 & i) == 0) {
            this.version = "";
        } else {
            this.version = str27;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.examplesLabel = "";
        } else {
            this.examplesLabel = str28;
        }
        this.cmpId = (i2 & 1) == 0 ? 5 : i3;
        this.cmpVersion = (i2 & 2) == 0 ? 3 : i4;
        if ((i2 & 4) == 0) {
            this.showDataSharedOutsideEUText = false;
        } else {
            this.showDataSharedOutsideEUText = z4;
        }
        if ((i2 & 8) == 0) {
            this.dataSharedOutsideEUText = null;
        } else {
            this.dataSharedOutsideEUText = str29;
        }
        this.vendorIdsOutsideEUList = (i2 & 16) == 0 ? CollectionsKt.emptyList() : list;
        this.firstLayerHideButtonDeny = (i2 & 32) == 0 ? true : bool;
        if ((i2 & 64) == 0) {
            this.secondLayerHideButtonDeny = true;
        } else {
            this.secondLayerHideButtonDeny = z5;
        }
        this.publisherCountryCode = (i2 & 128) == 0 ? "DE" : str30;
        if ((i2 & 256) == 0) {
            this.purposeOneTreatment = false;
        } else {
            this.purposeOneTreatment = z6;
        }
        this.selectedVendorIds = (i2 & 512) == 0 ? CollectionsKt.emptyList() : list2;
        if ((i2 & 1024) == 0) {
            this.gdprApplies = true;
        } else {
            this.gdprApplies = z7;
        }
        this.selectedStacks = (i2 & 2048) == 0 ? CollectionsKt.emptyList() : list3;
        this.scope = (i2 & 4096) == 0 ? TCF2Scope.SERVICE : tCF2Scope;
        this.disabledSpecialFeatures = (i2 & 8192) == 0 ? CollectionsKt.emptyList() : list4;
        if ((i2 & 16384) == 0) {
            this.firstLayerShowDescriptions = false;
        } else {
            this.firstLayerShowDescriptions = z8;
        }
        if ((32768 & i2) == 0) {
            this.hideNonIabOnFirstLayer = false;
        } else {
            this.hideNonIabOnFirstLayer = z9;
        }
        if ((65536 & i2) == 0) {
            this.resurfacePeriodEnded = false;
        } else {
            this.resurfacePeriodEnded = z10;
        }
        if ((131072 & i2) == 0) {
            this.resurfacePurposeChanged = false;
        } else {
            this.resurfacePurposeChanged = z11;
        }
        if ((262144 & i2) == 0) {
            this.resurfaceVendorAdded = false;
        } else {
            this.resurfaceVendorAdded = z12;
        }
        if ((524288 & i2) == 0) {
            this.firstLayerDescription = null;
        } else {
            this.firstLayerDescription = str31;
        }
        if ((1048576 & i2) == 0) {
            this.firstLayerAdditionalInfo = null;
        } else {
            this.firstLayerAdditionalInfo = str32;
        }
        if ((2097152 & i2) == 0) {
            this.secondLayerDescription = null;
        } else {
            this.secondLayerDescription = str33;
        }
        if ((4194304 & i2) == 0) {
            this.appLayerNoteResurface = null;
        } else {
            this.appLayerNoteResurface = str34;
        }
        if ((i2 & 8388608) == 0) {
            this.firstLayerNoteResurface = null;
        } else {
            this.firstLayerNoteResurface = str35;
        }
        if ((i2 & 16777216) == 0) {
            this.changedPurposes = null;
        } else {
            this.changedPurposes = tCF2ChangedPurposes;
        }
        if ((i2 & 33554432) == 0) {
            this.acmV2Enabled = false;
        } else {
            this.acmV2Enabled = z13;
        }
        this.selectedATPIds = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) == 0 ? CollectionsKt.emptyList() : list5;
        if ((i2 & C.BUFFER_FLAG_FIRST_SAMPLE) == 0) {
            this.resurfaceATPListChanged = false;
        } else {
            this.resurfaceATPListChanged = z14;
        }
        if ((i2 & 268435456) == 0) {
            this.atpListTitle = "";
        } else {
            this.atpListTitle = str36;
        }
    }

    public TCF2Settings(String firstLayerTitle, String secondLayerTitle, String tabsPurposeLabel, String tabsVendorsLabel, String labelsFeatures, String labelsIabVendors, String labelsNonIabPurposes, String labelsNonIabVendors, String labelsPurposes, String vendorFeatures, String vendorLegitimateInterestPurposes, String vendorPurpose, String vendorSpecialFeatures, String vendorSpecialPurposes, String togglesConsentToggleLabel, String togglesLegIntToggleLabel, String buttonsAcceptAllLabel, String buttonsDenyAllLabel, String buttonsSaveLabel, String linksManageSettingsLabel, String linksVendorListLinkLabel, String togglesSpecialFeaturesToggleOn, String togglesSpecialFeaturesToggleOff, FirstLayerMobileVariant firstLayerMobileVariant, boolean z, boolean z2, boolean z3, String categoriesOfDataLabel, String dataRetentionPeriodLabel, String legitimateInterestLabel, String version, String examplesLabel, int i, int i2, boolean z4, String str, List<Integer> vendorIdsOutsideEUList, Boolean bool, boolean z5, String publisherCountryCode, boolean z6, List<Integer> selectedVendorIds, boolean z7, List<Integer> selectedStacks, TCF2Scope scope, List<Integer> disabledSpecialFeatures, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, String str2, String str3, String str4, String str5, String str6, TCF2ChangedPurposes tCF2ChangedPurposes, boolean z13, List<Integer> selectedATPIds, boolean z14, String atpListTitle) {
        Intrinsics.checkNotNullParameter(firstLayerTitle, "firstLayerTitle");
        Intrinsics.checkNotNullParameter(secondLayerTitle, "secondLayerTitle");
        Intrinsics.checkNotNullParameter(tabsPurposeLabel, "tabsPurposeLabel");
        Intrinsics.checkNotNullParameter(tabsVendorsLabel, "tabsVendorsLabel");
        Intrinsics.checkNotNullParameter(labelsFeatures, "labelsFeatures");
        Intrinsics.checkNotNullParameter(labelsIabVendors, "labelsIabVendors");
        Intrinsics.checkNotNullParameter(labelsNonIabPurposes, "labelsNonIabPurposes");
        Intrinsics.checkNotNullParameter(labelsNonIabVendors, "labelsNonIabVendors");
        Intrinsics.checkNotNullParameter(labelsPurposes, "labelsPurposes");
        Intrinsics.checkNotNullParameter(vendorFeatures, "vendorFeatures");
        Intrinsics.checkNotNullParameter(vendorLegitimateInterestPurposes, "vendorLegitimateInterestPurposes");
        Intrinsics.checkNotNullParameter(vendorPurpose, "vendorPurpose");
        Intrinsics.checkNotNullParameter(vendorSpecialFeatures, "vendorSpecialFeatures");
        Intrinsics.checkNotNullParameter(vendorSpecialPurposes, "vendorSpecialPurposes");
        Intrinsics.checkNotNullParameter(togglesConsentToggleLabel, "togglesConsentToggleLabel");
        Intrinsics.checkNotNullParameter(togglesLegIntToggleLabel, "togglesLegIntToggleLabel");
        Intrinsics.checkNotNullParameter(buttonsAcceptAllLabel, "buttonsAcceptAllLabel");
        Intrinsics.checkNotNullParameter(buttonsDenyAllLabel, "buttonsDenyAllLabel");
        Intrinsics.checkNotNullParameter(buttonsSaveLabel, "buttonsSaveLabel");
        Intrinsics.checkNotNullParameter(linksManageSettingsLabel, "linksManageSettingsLabel");
        Intrinsics.checkNotNullParameter(linksVendorListLinkLabel, "linksVendorListLinkLabel");
        Intrinsics.checkNotNullParameter(togglesSpecialFeaturesToggleOn, "togglesSpecialFeaturesToggleOn");
        Intrinsics.checkNotNullParameter(togglesSpecialFeaturesToggleOff, "togglesSpecialFeaturesToggleOff");
        Intrinsics.checkNotNullParameter(categoriesOfDataLabel, "categoriesOfDataLabel");
        Intrinsics.checkNotNullParameter(dataRetentionPeriodLabel, "dataRetentionPeriodLabel");
        Intrinsics.checkNotNullParameter(legitimateInterestLabel, "legitimateInterestLabel");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(examplesLabel, "examplesLabel");
        Intrinsics.checkNotNullParameter(vendorIdsOutsideEUList, "vendorIdsOutsideEUList");
        Intrinsics.checkNotNullParameter(publisherCountryCode, "publisherCountryCode");
        Intrinsics.checkNotNullParameter(selectedVendorIds, "selectedVendorIds");
        Intrinsics.checkNotNullParameter(selectedStacks, "selectedStacks");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(disabledSpecialFeatures, "disabledSpecialFeatures");
        Intrinsics.checkNotNullParameter(selectedATPIds, "selectedATPIds");
        Intrinsics.checkNotNullParameter(atpListTitle, "atpListTitle");
        this.firstLayerTitle = firstLayerTitle;
        this.secondLayerTitle = secondLayerTitle;
        this.tabsPurposeLabel = tabsPurposeLabel;
        this.tabsVendorsLabel = tabsVendorsLabel;
        this.labelsFeatures = labelsFeatures;
        this.labelsIabVendors = labelsIabVendors;
        this.labelsNonIabPurposes = labelsNonIabPurposes;
        this.labelsNonIabVendors = labelsNonIabVendors;
        this.labelsPurposes = labelsPurposes;
        this.vendorFeatures = vendorFeatures;
        this.vendorLegitimateInterestPurposes = vendorLegitimateInterestPurposes;
        this.vendorPurpose = vendorPurpose;
        this.vendorSpecialFeatures = vendorSpecialFeatures;
        this.vendorSpecialPurposes = vendorSpecialPurposes;
        this.togglesConsentToggleLabel = togglesConsentToggleLabel;
        this.togglesLegIntToggleLabel = togglesLegIntToggleLabel;
        this.buttonsAcceptAllLabel = buttonsAcceptAllLabel;
        this.buttonsDenyAllLabel = buttonsDenyAllLabel;
        this.buttonsSaveLabel = buttonsSaveLabel;
        this.linksManageSettingsLabel = linksManageSettingsLabel;
        this.linksVendorListLinkLabel = linksVendorListLinkLabel;
        this.togglesSpecialFeaturesToggleOn = togglesSpecialFeaturesToggleOn;
        this.togglesSpecialFeaturesToggleOff = togglesSpecialFeaturesToggleOff;
        this.firstLayerMobileVariant = firstLayerMobileVariant;
        this.firstLayerHideToggles = z;
        this.secondLayerHideToggles = z2;
        this.hideLegitimateInterestToggles = z3;
        this.categoriesOfDataLabel = categoriesOfDataLabel;
        this.dataRetentionPeriodLabel = dataRetentionPeriodLabel;
        this.legitimateInterestLabel = legitimateInterestLabel;
        this.version = version;
        this.examplesLabel = examplesLabel;
        this.cmpId = i;
        this.cmpVersion = i2;
        this.showDataSharedOutsideEUText = z4;
        this.dataSharedOutsideEUText = str;
        this.vendorIdsOutsideEUList = vendorIdsOutsideEUList;
        this.firstLayerHideButtonDeny = bool;
        this.secondLayerHideButtonDeny = z5;
        this.publisherCountryCode = publisherCountryCode;
        this.purposeOneTreatment = z6;
        this.selectedVendorIds = selectedVendorIds;
        this.gdprApplies = z7;
        this.selectedStacks = selectedStacks;
        this.scope = scope;
        this.disabledSpecialFeatures = disabledSpecialFeatures;
        this.firstLayerShowDescriptions = z8;
        this.hideNonIabOnFirstLayer = z9;
        this.resurfacePeriodEnded = z10;
        this.resurfacePurposeChanged = z11;
        this.resurfaceVendorAdded = z12;
        this.firstLayerDescription = str2;
        this.firstLayerAdditionalInfo = str3;
        this.secondLayerDescription = str4;
        this.appLayerNoteResurface = str5;
        this.firstLayerNoteResurface = str6;
        this.changedPurposes = tCF2ChangedPurposes;
        this.acmV2Enabled = z13;
        this.selectedATPIds = selectedATPIds;
        this.resurfaceATPListChanged = z14;
        this.atpListTitle = atpListTitle;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$usercentrics_release(TCF2Settings self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.firstLayerTitle);
        output.encodeStringElement(serialDesc, 1, self.secondLayerTitle);
        output.encodeStringElement(serialDesc, 2, self.tabsPurposeLabel);
        output.encodeStringElement(serialDesc, 3, self.tabsVendorsLabel);
        output.encodeStringElement(serialDesc, 4, self.labelsFeatures);
        output.encodeStringElement(serialDesc, 5, self.labelsIabVendors);
        output.encodeStringElement(serialDesc, 6, self.labelsNonIabPurposes);
        output.encodeStringElement(serialDesc, 7, self.labelsNonIabVendors);
        output.encodeStringElement(serialDesc, 8, self.labelsPurposes);
        output.encodeStringElement(serialDesc, 9, self.vendorFeatures);
        output.encodeStringElement(serialDesc, 10, self.vendorLegitimateInterestPurposes);
        output.encodeStringElement(serialDesc, 11, self.vendorPurpose);
        output.encodeStringElement(serialDesc, 12, self.vendorSpecialFeatures);
        output.encodeStringElement(serialDesc, 13, self.vendorSpecialPurposes);
        output.encodeStringElement(serialDesc, 14, self.togglesConsentToggleLabel);
        output.encodeStringElement(serialDesc, 15, self.togglesLegIntToggleLabel);
        output.encodeStringElement(serialDesc, 16, self.buttonsAcceptAllLabel);
        output.encodeStringElement(serialDesc, 17, self.buttonsDenyAllLabel);
        output.encodeStringElement(serialDesc, 18, self.buttonsSaveLabel);
        output.encodeStringElement(serialDesc, 19, self.linksManageSettingsLabel);
        output.encodeStringElement(serialDesc, 20, self.linksVendorListLinkLabel);
        output.encodeStringElement(serialDesc, 21, self.togglesSpecialFeaturesToggleOn);
        output.encodeStringElement(serialDesc, 22, self.togglesSpecialFeaturesToggleOff);
        if (output.shouldEncodeElementDefault(serialDesc, 23) || self.firstLayerMobileVariant != null) {
            output.encodeNullableSerializableElement(serialDesc, 23, kSerializerArr[23], self.firstLayerMobileVariant);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 24) || self.firstLayerHideToggles) {
            output.encodeBooleanElement(serialDesc, 24, self.firstLayerHideToggles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 25) || self.secondLayerHideToggles) {
            output.encodeBooleanElement(serialDesc, 25, self.secondLayerHideToggles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 26) || self.hideLegitimateInterestToggles) {
            output.encodeBooleanElement(serialDesc, 26, self.hideLegitimateInterestToggles);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 27) || !Intrinsics.areEqual(self.categoriesOfDataLabel, "")) {
            output.encodeStringElement(serialDesc, 27, self.categoriesOfDataLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 28) || !Intrinsics.areEqual(self.dataRetentionPeriodLabel, "")) {
            output.encodeStringElement(serialDesc, 28, self.dataRetentionPeriodLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 29) || !Intrinsics.areEqual(self.legitimateInterestLabel, "")) {
            output.encodeStringElement(serialDesc, 29, self.legitimateInterestLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 30) || !Intrinsics.areEqual(self.version, "")) {
            output.encodeStringElement(serialDesc, 30, self.version);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 31) || !Intrinsics.areEqual(self.examplesLabel, "")) {
            output.encodeStringElement(serialDesc, 31, self.examplesLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 32) || self.cmpId != 5) {
            output.encodeIntElement(serialDesc, 32, self.cmpId);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 33) || self.cmpVersion != 3) {
            output.encodeIntElement(serialDesc, 33, self.cmpVersion);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 34) || self.showDataSharedOutsideEUText) {
            output.encodeBooleanElement(serialDesc, 34, self.showDataSharedOutsideEUText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 35) || self.dataSharedOutsideEUText != null) {
            output.encodeNullableSerializableElement(serialDesc, 35, StringSerializer.INSTANCE, self.dataSharedOutsideEUText);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 36) || !Intrinsics.areEqual(self.vendorIdsOutsideEUList, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 36, kSerializerArr[36], self.vendorIdsOutsideEUList);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 37) || !Intrinsics.areEqual((Object) self.firstLayerHideButtonDeny, (Object) true)) {
            output.encodeNullableSerializableElement(serialDesc, 37, BooleanSerializer.INSTANCE, self.firstLayerHideButtonDeny);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 38) || !self.secondLayerHideButtonDeny) {
            output.encodeBooleanElement(serialDesc, 38, self.secondLayerHideButtonDeny);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 39) || !Intrinsics.areEqual(self.publisherCountryCode, "DE")) {
            output.encodeStringElement(serialDesc, 39, self.publisherCountryCode);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 40) || self.purposeOneTreatment) {
            output.encodeBooleanElement(serialDesc, 40, self.purposeOneTreatment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 41) || !Intrinsics.areEqual(self.selectedVendorIds, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 41, kSerializerArr[41], self.selectedVendorIds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 42) || !self.gdprApplies) {
            output.encodeBooleanElement(serialDesc, 42, self.gdprApplies);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 43) || !Intrinsics.areEqual(self.selectedStacks, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 43, kSerializerArr[43], self.selectedStacks);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 44) || self.scope != TCF2Scope.SERVICE) {
            output.encodeSerializableElement(serialDesc, 44, kSerializerArr[44], self.scope);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 45) || !Intrinsics.areEqual(self.disabledSpecialFeatures, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 45, kSerializerArr[45], self.disabledSpecialFeatures);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 46) || self.firstLayerShowDescriptions) {
            output.encodeBooleanElement(serialDesc, 46, self.firstLayerShowDescriptions);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 47) || self.hideNonIabOnFirstLayer) {
            output.encodeBooleanElement(serialDesc, 47, self.hideNonIabOnFirstLayer);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 48) || self.resurfacePeriodEnded) {
            output.encodeBooleanElement(serialDesc, 48, self.resurfacePeriodEnded);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 49) || self.resurfacePurposeChanged) {
            output.encodeBooleanElement(serialDesc, 49, self.resurfacePurposeChanged);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 50) || self.resurfaceVendorAdded) {
            output.encodeBooleanElement(serialDesc, 50, self.resurfaceVendorAdded);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 51) || self.firstLayerDescription != null) {
            output.encodeNullableSerializableElement(serialDesc, 51, StringSerializer.INSTANCE, self.firstLayerDescription);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 52) || self.firstLayerAdditionalInfo != null) {
            output.encodeNullableSerializableElement(serialDesc, 52, StringSerializer.INSTANCE, self.firstLayerAdditionalInfo);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 53) || self.secondLayerDescription != null) {
            output.encodeNullableSerializableElement(serialDesc, 53, StringSerializer.INSTANCE, self.secondLayerDescription);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 54) || self.appLayerNoteResurface != null) {
            output.encodeNullableSerializableElement(serialDesc, 54, StringSerializer.INSTANCE, self.appLayerNoteResurface);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 55) || self.firstLayerNoteResurface != null) {
            output.encodeNullableSerializableElement(serialDesc, 55, StringSerializer.INSTANCE, self.firstLayerNoteResurface);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 56) || self.changedPurposes != null) {
            output.encodeNullableSerializableElement(serialDesc, 56, TCF2ChangedPurposes$$serializer.INSTANCE, self.changedPurposes);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 57) || self.acmV2Enabled) {
            output.encodeBooleanElement(serialDesc, 57, self.acmV2Enabled);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 58) || !Intrinsics.areEqual(self.selectedATPIds, CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 58, kSerializerArr[58], self.selectedATPIds);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 59) || self.resurfaceATPListChanged) {
            output.encodeBooleanElement(serialDesc, 59, self.resurfaceATPListChanged);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 60) && Intrinsics.areEqual(self.atpListTitle, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 60, self.atpListTitle);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TCF2Settings(java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, java.lang.String r76, java.lang.String r77, java.lang.String r78, java.lang.String r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, java.lang.String r84, java.lang.String r85, java.lang.String r86, java.lang.String r87, java.lang.String r88, java.lang.String r89, com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant r90, boolean r91, boolean r92, boolean r93, java.lang.String r94, java.lang.String r95, java.lang.String r96, java.lang.String r97, java.lang.String r98, int r99, int r100, boolean r101, java.lang.String r102, java.util.List r103, java.lang.Boolean r104, boolean r105, java.lang.String r106, boolean r107, java.util.List r108, boolean r109, java.util.List r110, com.usercentrics.sdk.v2.settings.data.TCF2Scope r111, java.util.List r112, boolean r113, boolean r114, boolean r115, boolean r116, boolean r117, java.lang.String r118, java.lang.String r119, java.lang.String r120, java.lang.String r121, java.lang.String r122, com.usercentrics.sdk.v2.settings.data.TCF2ChangedPurposes r123, boolean r124, java.util.List r125, boolean r126, java.lang.String r127, int r128, int r129, kotlin.jvm.internal.DefaultConstructorMarker r130) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usercentrics.sdk.v2.settings.data.TCF2Settings.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.usercentrics.sdk.v2.settings.data.FirstLayerMobileVariant, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, boolean, java.lang.String, java.util.List, java.lang.Boolean, boolean, java.lang.String, boolean, java.util.List, boolean, java.util.List, com.usercentrics.sdk.v2.settings.data.TCF2Scope, java.util.List, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.usercentrics.sdk.v2.settings.data.TCF2ChangedPurposes, boolean, java.util.List, boolean, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getFirstLayerTitle() {
        return this.firstLayerTitle;
    }

    public final String getSecondLayerTitle() {
        return this.secondLayerTitle;
    }

    public final String getTabsPurposeLabel() {
        return this.tabsPurposeLabel;
    }

    public final String getTabsVendorsLabel() {
        return this.tabsVendorsLabel;
    }

    public final String getLabelsFeatures() {
        return this.labelsFeatures;
    }

    public final String getLabelsIabVendors() {
        return this.labelsIabVendors;
    }

    public final String getLabelsNonIabPurposes() {
        return this.labelsNonIabPurposes;
    }

    public final String getLabelsNonIabVendors() {
        return this.labelsNonIabVendors;
    }

    public final String getLabelsPurposes() {
        return this.labelsPurposes;
    }

    public final String getVendorFeatures() {
        return this.vendorFeatures;
    }

    public final String getVendorLegitimateInterestPurposes() {
        return this.vendorLegitimateInterestPurposes;
    }

    public final String getVendorPurpose() {
        return this.vendorPurpose;
    }

    public final String getVendorSpecialFeatures() {
        return this.vendorSpecialFeatures;
    }

    public final String getVendorSpecialPurposes() {
        return this.vendorSpecialPurposes;
    }

    public final String getTogglesConsentToggleLabel() {
        return this.togglesConsentToggleLabel;
    }

    public final String getTogglesLegIntToggleLabel() {
        return this.togglesLegIntToggleLabel;
    }

    public final String getButtonsAcceptAllLabel() {
        return this.buttonsAcceptAllLabel;
    }

    public final String getButtonsDenyAllLabel() {
        return this.buttonsDenyAllLabel;
    }

    public final String getButtonsSaveLabel() {
        return this.buttonsSaveLabel;
    }

    public final String getLinksManageSettingsLabel() {
        return this.linksManageSettingsLabel;
    }

    public final String getLinksVendorListLinkLabel() {
        return this.linksVendorListLinkLabel;
    }

    public final String getTogglesSpecialFeaturesToggleOn() {
        return this.togglesSpecialFeaturesToggleOn;
    }

    public final String getTogglesSpecialFeaturesToggleOff() {
        return this.togglesSpecialFeaturesToggleOff;
    }

    public final FirstLayerMobileVariant getFirstLayerMobileVariant() {
        return this.firstLayerMobileVariant;
    }

    public final boolean getFirstLayerHideToggles() {
        return this.firstLayerHideToggles;
    }

    public final boolean getSecondLayerHideToggles() {
        return this.secondLayerHideToggles;
    }

    public final boolean getHideLegitimateInterestToggles() {
        return this.hideLegitimateInterestToggles;
    }

    public final String getCategoriesOfDataLabel() {
        return this.categoriesOfDataLabel;
    }

    public final String getDataRetentionPeriodLabel() {
        return this.dataRetentionPeriodLabel;
    }

    public final String getLegitimateInterestLabel() {
        return this.legitimateInterestLabel;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getExamplesLabel() {
        return this.examplesLabel;
    }

    public final int getCmpId() {
        return this.cmpId;
    }

    public final int getCmpVersion() {
        return this.cmpVersion;
    }

    public final boolean getShowDataSharedOutsideEUText() {
        return this.showDataSharedOutsideEUText;
    }

    public final String getDataSharedOutsideEUText() {
        return this.dataSharedOutsideEUText;
    }

    public final List<Integer> getVendorIdsOutsideEUList() {
        return this.vendorIdsOutsideEUList;
    }

    public final Boolean getFirstLayerHideButtonDeny() {
        return this.firstLayerHideButtonDeny;
    }

    public final boolean getSecondLayerHideButtonDeny() {
        return this.secondLayerHideButtonDeny;
    }

    public final String getPublisherCountryCode() {
        return this.publisherCountryCode;
    }

    public final boolean getPurposeOneTreatment() {
        return this.purposeOneTreatment;
    }

    public final List<Integer> getSelectedVendorIds() {
        return this.selectedVendorIds;
    }

    public final boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final List<Integer> getSelectedStacks() {
        return this.selectedStacks;
    }

    public final TCF2Scope getScope() {
        return this.scope;
    }

    public final List<Integer> getDisabledSpecialFeatures() {
        return this.disabledSpecialFeatures;
    }

    public final boolean getFirstLayerShowDescriptions() {
        return this.firstLayerShowDescriptions;
    }

    public final boolean getHideNonIabOnFirstLayer() {
        return this.hideNonIabOnFirstLayer;
    }

    public final boolean getResurfacePeriodEnded() {
        return this.resurfacePeriodEnded;
    }

    public final boolean getResurfacePurposeChanged() {
        return this.resurfacePurposeChanged;
    }

    public final boolean getResurfaceVendorAdded() {
        return this.resurfaceVendorAdded;
    }

    public final String getFirstLayerDescription() {
        return this.firstLayerDescription;
    }

    public final String getFirstLayerAdditionalInfo() {
        return this.firstLayerAdditionalInfo;
    }

    public final String getSecondLayerDescription() {
        return this.secondLayerDescription;
    }

    public final String getAppLayerNoteResurface() {
        return this.appLayerNoteResurface;
    }

    public final String getFirstLayerNoteResurface() {
        return this.firstLayerNoteResurface;
    }

    public final TCF2ChangedPurposes getChangedPurposes() {
        return this.changedPurposes;
    }

    public final boolean getAcmV2Enabled() {
        return this.acmV2Enabled;
    }

    public final List<Integer> getSelectedATPIds() {
        return this.selectedATPIds;
    }

    public final boolean getResurfaceATPListChanged() {
        return this.resurfaceATPListChanged;
    }

    public final String getAtpListTitle() {
        return this.atpListTitle;
    }

    public final boolean getUseGranularChoice() {
        return (this.firstLayerHideToggles && this.secondLayerHideToggles) ? false : true;
    }

    public final boolean isServiceSpecific() {
        return this.scope == TCF2Scope.SERVICE;
    }

    public final boolean isAdditionalConsentModeEnabled$usercentrics_release() {
        return this.acmV2Enabled && !this.selectedATPIds.isEmpty();
    }
}
