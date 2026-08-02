package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.utils.ApiConstant;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000S\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0003\bÕ\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\t\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010a\u001a\u0004\u0018\u00010b\u0012\n\b\u0002\u0010c\u001a\u0004\u0018\u00010d\u0012\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010kJ\f\u0010Ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010×\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ú\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010Û\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010Ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010Þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010à\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0012\u0010á\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0003\u0010\u0091\u0001J\f\u0010â\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010è\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010é\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ê\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ë\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ì\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010í\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010î\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ï\u0001\u001a\u0004\u0018\u00010&HÆ\u0003J\f\u0010ð\u0001\u001a\u0004\u0018\u00010(HÆ\u0003J\f\u0010ñ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ò\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ó\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ô\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010õ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ö\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010÷\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ø\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ù\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ú\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010û\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ü\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ý\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010þ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0080\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0082\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0087\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0089\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0090\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0091\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0096\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0097\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0098\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0099\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009a\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009b\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009c\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009d\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009e\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u009f\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010 \u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¡\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¢\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010£\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¤\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¥\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¦\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010§\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¨\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010©\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010ª\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010«\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¬\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010®\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¯\u0002\u001a\u0004\u0018\u00010bHÆ\u0003J\f\u0010°\u0002\u001a\u0004\u0018\u00010dHÆ\u0003J\f\u0010±\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010²\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010³\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010´\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010µ\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010¶\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009c\t\u0010·\u0002\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010M\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010U\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010W\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010X\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Y\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010Z\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010[\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010^\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010_\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010`\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010a\u001a\u0004\u0018\u00010b2\n\b\u0002\u0010c\u001a\u0004\u0018\u00010d2\n\b\u0002\u0010e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010h\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010¸\u0002J\u0016\u0010¹\u0002\u001a\u00030º\u00022\t\u0010»\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010¼\u0002\u001a\u00030½\u0002HÖ\u0001J\n\u0010¾\u0002\u001a\u00020\u0003HÖ\u0001R\u0013\u0010Y\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010,\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bn\u0010mR\u0013\u0010A\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bo\u0010mR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bp\u0010mR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010mR\u0013\u0010`\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\br\u0010mR\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bs\u0010mR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bt\u0010mR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bu\u0010mR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bv\u0010mR\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bw\u0010mR\u0013\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bx\u0010mR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010mR\u0013\u0010!\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010mR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b{\u0010mR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b|\u0010mR\u0013\u0010j\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b}\u0010mR\u0013\u0010P\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b~\u0010mR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010mR\u0014\u0010B\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010mR\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010mR\u0014\u0010$\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010mR\u0014\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010mR\u0014\u0010T\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010mR\u0014\u0010f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010mR\u0014\u0010Z\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0086\u0001\u0010mR\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0087\u0001\u0010mR\u0014\u0010Q\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010mR\u0014\u0010[\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0089\u0001\u0010mR\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008a\u0001\u0010mR\u0014\u0010R\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010mR\u0014\u0010/\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008c\u0001\u0010mR\u0014\u00103\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u008d\u0001\u0010mR\u0015\u0010a\u001a\u0004\u0018\u00010b¢\u0006\n\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\r\n\u0003\u0010\u0092\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0014\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0093\u0001\u0010mR\u0014\u0010O\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0094\u0001\u0010mR\u0014\u0010M\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0095\u0001\u0010mR\u0014\u00106\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0096\u0001\u0010mR\u0014\u0010_\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0097\u0001\u0010mR\u0014\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0098\u0001\u0010mR\u0014\u0010e\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u0099\u0001\u0010mR\u0014\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009a\u0001\u0010mR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0000\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0014\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009d\u0001\u0010mR\u0014\u0010H\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009e\u0001\u0010mR\u0014\u0010L\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u009f\u0001\u0010mR\u0014\u0010h\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b \u0001\u0010mR\u0014\u0010i\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¡\u0001\u0010mR\u0014\u0010-\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¢\u0001\u0010mR\u0014\u00101\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b£\u0001\u0010mR\u0014\u0010I\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¤\u0001\u0010mR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¥\u0001\u0010mR\u0014\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¦\u0001\u0010mR\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b§\u0001\u0010mR\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¨\u0001\u0010mR\u0015\u0010c\u001a\u0004\u0018\u00010d¢\u0006\n\n\u0000\u001a\u0006\b©\u0001\u0010ª\u0001R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b«\u0001\u0010mR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¬\u0001\u0010mR\u0014\u0010+\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b\u00ad\u0001\u0010mR\u0014\u00102\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b®\u0001\u0010mR\u0014\u0010D\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¯\u0001\u0010mR\u0014\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b°\u0001\u0010mR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b±\u0001\u0010mR\u0014\u0010N\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b²\u0001\u0010mR\u0014\u0010G\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b³\u0001\u0010mR\u0014\u0010F\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b´\u0001\u0010mR\u0014\u0010C\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bµ\u0001\u0010mR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0000\u001a\u0006\b¶\u0001\u0010·\u0001R\u0014\u0010g\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¸\u0001\u0010mR\u0014\u0010K\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¹\u0001\u0010mR\u0014\u0010S\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bº\u0001\u0010mR\u0014\u00105\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b»\u0001\u0010mR\u0014\u00104\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¼\u0001\u0010mR\u0014\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b½\u0001\u0010mR\u0014\u00100\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¾\u0001\u0010mR\u0014\u00108\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\b¿\u0001\u0010mR\u0014\u0010.\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÀ\u0001\u0010mR\u0015\u0010%\u001a\u0004\u0018\u00010&¢\u0006\n\n\u0000\u001a\u0006\bÁ\u0001\u0010Â\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÃ\u0001\u0010mR\u0014\u0010V\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÄ\u0001\u0010mR\u0014\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÅ\u0001\u0010mR\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÆ\u0001\u0010mR\u0014\u0010U\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÇ\u0001\u0010mR\u0015\u0010'\u001a\u0004\u0018\u00010(¢\u0006\n\n\u0000\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0014\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÊ\u0001\u0010mR\u0014\u0010X\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bË\u0001\u0010mR\u0014\u00109\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÌ\u0001\u0010mR\u0014\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÍ\u0001\u0010mR\u0014\u0010J\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÎ\u0001\u0010mR\u0014\u0010\\\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÏ\u0001\u0010mR\u0014\u0010]\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÐ\u0001\u0010mR\u0014\u0010^\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÑ\u0001\u0010mR\u0014\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÒ\u0001\u0010mR\u0014\u0010W\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÓ\u0001\u0010mR\u0014\u0010@\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÔ\u0001\u0010mR\u0014\u0010?\u001a\u0004\u0018\u00010\u0003¢\u0006\t\n\u0000\u001a\u0005\bÕ\u0001\u0010m¨\u0006¿\u0002"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "", "processingConsent", "", "errorCode", "", "documentName", ApiConstant.DOCUMENT_TYPE, "confirmationTitle", "confirmationText", "submitButtonText", "movePhoneFront", "greatNowCapture", "alignFaceBox", "moveCloser", "lookDirectly", "nativeMessages", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeMessages;", "helpMessages", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/HelpMessages;", "cameraLoading", "darkImageError", "moveAreaError", "manualPrimary", "manualSecondary", "cameraIssue", "startMode", "captureMode", "confirmMode", "backToScanning", "captureCompatibilityCheck", "defaultDocumentTitle", "capturePageTitle", "confirmPageTitle", "toGetStarted", "errorMessage", "defaultIvsError", "previewMessages", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PreviewMessages;", "submitButtonMessages", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;", "placeFlatAndHoldId", "idLookingGood", "moveIdCloser", "adjustLighting", "keepIdFlat", "positionFront", "ensureIdFocus", "placeFlatAndHoldPassport", "keepPassportFlat", "movePassportCloser", "ensurePassportFocus", "passportLookingGood", "openPassportBook", "flipIdBarcode", "makeSureBarcode", "positionBack", "title", "descriptionText", "headerText", "captureSuccess", "scanning", "tryPhotoManually", "warningMessageText", "warningMessageCloseText", "agreeButtonText", "declineButtonText", "movePhoneUp", "movePhoneBack", "movePhoneDown", "movePhoneRight", "movePhoneLeft", "idTooClose", "keepSteady", "tooClose", "noPassportDetected", "idealFace", "faceTooClose", "movePhoneFrontLowEndDevice", "faceMustBeVisible", "currentDocument", "documentNumber", "documentUploadCounter", "numOfDocuments", "document", "submitButton", "retryButton", "uploading", "success", "additionalInstructions", "documentCollectionTitle", "documentPreviewTitle", "transitionHeaderText", "transitionInstructionsPrimaryText", "transitionInstructionsSecondaryText", "glareError", "blurErrorSecondary", "error", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabelsExtended;", "mobile", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MobileLabels;", "haveDocReady", "documentCameraPermission", "noCardDetected", "instructionsPrimaryText", "instructionsSecondaryText", "continueButton", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeMessages;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/HelpMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PreviewMessages;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabelsExtended;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MobileLabels;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdditionalInstructions", "()Ljava/lang/String;", "getAdjustLighting", "getAgreeButtonText", "getAlignFaceBox", "getBackToScanning", "getBlurErrorSecondary", "getCameraIssue", "getCameraLoading", "getCaptureCompatibilityCheck", "getCaptureMode", "getCapturePageTitle", "getCaptureSuccess", "getConfirmMode", "getConfirmPageTitle", "getConfirmationText", "getConfirmationTitle", "getContinueButton", "getCurrentDocument", "getDarkImageError", "getDeclineButtonText", "getDefaultDocumentTitle", "getDefaultIvsError", "getDescriptionText", "getDocument", "getDocumentCameraPermission", "getDocumentCollectionTitle", "getDocumentName", "getDocumentNumber", "getDocumentPreviewTitle", "getDocumentType", "getDocumentUploadCounter", "getEnsureIdFocus", "getEnsurePassportFocus", "getError", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabelsExtended;", "getErrorCode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getErrorMessage", "getFaceMustBeVisible", "getFaceTooClose", "getFlipIdBarcode", "getGlareError", "getGreatNowCapture", "getHaveDocReady", "getHeaderText", "getHelpMessages", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/HelpMessages;", "getIdLookingGood", "getIdTooClose", "getIdealFace", "getInstructionsPrimaryText", "getInstructionsSecondaryText", "getKeepIdFlat", "getKeepPassportFlat", "getKeepSteady", "getLookDirectly", "getMakeSureBarcode", "getManualPrimary", "getManualSecondary", "getMobile", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MobileLabels;", "getMoveAreaError", "getMoveCloser", "getMoveIdCloser", "getMovePassportCloser", "getMovePhoneBack", "getMovePhoneDown", "getMovePhoneFront", "getMovePhoneFrontLowEndDevice", "getMovePhoneLeft", "getMovePhoneRight", "getMovePhoneUp", "getNativeMessages", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeMessages;", "getNoCardDetected", "getNoPassportDetected", "getNumOfDocuments", "getOpenPassportBook", "getPassportLookingGood", "getPlaceFlatAndHoldId", "getPlaceFlatAndHoldPassport", "getPositionBack", "getPositionFront", "getPreviewMessages", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PreviewMessages;", "getProcessingConsent", "getRetryButton", "getScanning", "getStartMode", "getSubmitButton", "getSubmitButtonMessages", "()Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;", "getSubmitButtonText", "getSuccess", "getTitle", "getToGetStarted", "getTooClose", "getTransitionHeaderText", "getTransitionInstructionsPrimaryText", "getTransitionInstructionsSecondaryText", "getTryPhotoManually", "getUploading", "getWarningMessageCloseText", "getWarningMessageText", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component64", "component65", "component66", "component67", "component68", "component69", "component7", "component70", "component71", "component72", "component73", "component74", "component75", "component76", "component77", "component78", "component79", "component8", "component80", "component81", "component82", "component83", "component84", "component85", "component86", "component87", "component88", "component89", "component9", "component90", "component91", "component92", "component93", "component94", "component95", "component96", "component97", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/NativeMessages;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/HelpMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/PreviewMessages;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/SubmitButtonMessages;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ErrorLabelsExtended;Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/MobileLabels;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/Labels;", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Labels {
    public static final int $stable = 0;
    private final String additionalInstructions;
    private final String adjustLighting;
    private final String agreeButtonText;
    private final String alignFaceBox;
    private final String backToScanning;
    private final String blurErrorSecondary;
    private final String cameraIssue;
    private final String cameraLoading;
    private final String captureCompatibilityCheck;
    private final String captureMode;
    private final String capturePageTitle;
    private final String captureSuccess;
    private final String confirmMode;
    private final String confirmPageTitle;
    private final String confirmationText;
    private final String confirmationTitle;
    private final String continueButton;
    private final String currentDocument;
    private final String darkImageError;
    private final String declineButtonText;
    private final String defaultDocumentTitle;
    private final String defaultIvsError;
    private final String descriptionText;
    private final String document;
    private final String documentCameraPermission;
    private final String documentCollectionTitle;
    private final String documentName;
    private final String documentNumber;
    private final String documentPreviewTitle;
    private final String documentType;
    private final String documentUploadCounter;
    private final String ensureIdFocus;
    private final String ensurePassportFocus;
    private final ErrorLabelsExtended error;
    private final Long errorCode;
    private final String errorMessage;
    private final String faceMustBeVisible;
    private final String faceTooClose;
    private final String flipIdBarcode;
    private final String glareError;
    private final String greatNowCapture;
    private final String haveDocReady;
    private final String headerText;
    private final HelpMessages helpMessages;
    private final String idLookingGood;
    private final String idTooClose;
    private final String idealFace;
    private final String instructionsPrimaryText;
    private final String instructionsSecondaryText;
    private final String keepIdFlat;
    private final String keepPassportFlat;
    private final String keepSteady;
    private final String lookDirectly;
    private final String makeSureBarcode;
    private final String manualPrimary;
    private final String manualSecondary;
    private final MobileLabels mobile;
    private final String moveAreaError;
    private final String moveCloser;
    private final String moveIdCloser;
    private final String movePassportCloser;
    private final String movePhoneBack;
    private final String movePhoneDown;
    private final String movePhoneFront;
    private final String movePhoneFrontLowEndDevice;
    private final String movePhoneLeft;
    private final String movePhoneRight;
    private final String movePhoneUp;
    private final NativeMessages nativeMessages;
    private final String noCardDetected;
    private final String noPassportDetected;
    private final String numOfDocuments;
    private final String openPassportBook;
    private final String passportLookingGood;
    private final String placeFlatAndHoldId;
    private final String placeFlatAndHoldPassport;
    private final String positionBack;
    private final String positionFront;
    private final PreviewMessages previewMessages;
    private final String processingConsent;
    private final String retryButton;
    private final String scanning;
    private final String startMode;
    private final String submitButton;
    private final SubmitButtonMessages submitButtonMessages;
    private final String submitButtonText;
    private final String success;
    private final String title;
    private final String toGetStarted;
    private final String tooClose;
    private final String transitionHeaderText;
    private final String transitionInstructionsPrimaryText;
    private final String transitionInstructionsSecondaryText;
    private final String tryPhotoManually;
    private final String uploading;
    private final String warningMessageCloseText;
    private final String warningMessageText;

    public Labels() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, 1, null);
    }

    public static /* synthetic */ Labels copy$default(Labels labels, String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, NativeMessages nativeMessages, HelpMessages helpMessages, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, String str84, ErrorLabelsExtended errorLabelsExtended, MobileLabels mobileLabels, String str85, String str86, String str87, String str88, String str89, String str90, int i, int i2, int i3, int i4, Object obj) {
        String str91;
        String str92;
        String str93;
        String str94;
        String str95;
        String str96;
        String str97;
        String str98;
        String str99;
        String str100;
        String str101;
        ErrorLabelsExtended errorLabelsExtended2;
        MobileLabels mobileLabels2;
        String str102;
        String str103;
        String str104;
        String str105;
        String str106;
        String str107;
        String str108;
        String str109;
        String str110;
        String str111;
        String str112;
        String str113;
        String str114;
        String str115;
        String str116;
        String str117;
        String str118;
        String str119;
        String str120;
        String str121;
        String str122;
        String str123;
        String str124;
        String str125;
        String str126;
        String str127;
        String str128;
        String str129;
        String str130;
        String str131;
        String str132;
        String str133;
        String str134;
        String str135;
        String str136;
        String str137;
        String str138;
        String str139;
        String str140;
        String str141;
        String str142;
        String str143;
        String str144;
        String str145;
        String str146;
        String str147;
        String str148;
        String str149;
        String str150;
        String str151;
        PreviewMessages previewMessages2;
        SubmitButtonMessages submitButtonMessages2;
        String str152;
        String str153;
        String str154;
        String str155;
        String str156;
        String str157;
        String str158;
        HelpMessages helpMessages2;
        String str159;
        String str160;
        String str161;
        String str162;
        String str163;
        String str164;
        String str165;
        String str166;
        String str167;
        String str168;
        String str169;
        Long l2;
        String str170;
        String str171;
        String str172;
        String str173;
        String str174;
        String str175;
        String str176;
        String str177;
        String str178;
        String str179;
        NativeMessages nativeMessages2;
        String str180 = (i & 1) != 0 ? labels.processingConsent : str;
        Long l3 = (i & 2) != 0 ? labels.errorCode : l;
        String str181 = (i & 4) != 0 ? labels.documentName : str2;
        String str182 = (i & 8) != 0 ? labels.documentType : str3;
        String str183 = (i & 16) != 0 ? labels.confirmationTitle : str4;
        String str184 = (i & 32) != 0 ? labels.confirmationText : str5;
        String str185 = (i & 64) != 0 ? labels.submitButtonText : str6;
        String str186 = (i & 128) != 0 ? labels.movePhoneFront : str7;
        String str187 = (i & 256) != 0 ? labels.greatNowCapture : str8;
        String str188 = (i & 512) != 0 ? labels.alignFaceBox : str9;
        String str189 = (i & 1024) != 0 ? labels.moveCloser : str10;
        String str190 = (i & 2048) != 0 ? labels.lookDirectly : str11;
        String str191 = str180;
        NativeMessages nativeMessages3 = (i & 4096) != 0 ? labels.nativeMessages : nativeMessages;
        HelpMessages helpMessages3 = (i & 8192) != 0 ? labels.helpMessages : helpMessages;
        String str192 = (i & 16384) != 0 ? labels.cameraLoading : str12;
        String str193 = (i & 32768) != 0 ? labels.darkImageError : str13;
        String str194 = (i & 65536) != 0 ? labels.moveAreaError : str14;
        String str195 = (i & 131072) != 0 ? labels.manualPrimary : str15;
        String str196 = (i & 262144) != 0 ? labels.manualSecondary : str16;
        String str197 = (i & 524288) != 0 ? labels.cameraIssue : str17;
        String str198 = (i & 1048576) != 0 ? labels.startMode : str18;
        String str199 = (i & 2097152) != 0 ? labels.captureMode : str19;
        String str200 = (i & 4194304) != 0 ? labels.confirmMode : str20;
        String str201 = (i & 8388608) != 0 ? labels.backToScanning : str21;
        String str202 = (i & 16777216) != 0 ? labels.captureCompatibilityCheck : str22;
        String str203 = (i & 33554432) != 0 ? labels.defaultDocumentTitle : str23;
        String str204 = (i & 67108864) != 0 ? labels.capturePageTitle : str24;
        String str205 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? labels.confirmPageTitle : str25;
        String str206 = (i & 268435456) != 0 ? labels.toGetStarted : str26;
        String str207 = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? labels.errorMessage : str27;
        String str208 = (i & 1073741824) != 0 ? labels.defaultIvsError : str28;
        PreviewMessages previewMessages3 = (i & Integer.MIN_VALUE) != 0 ? labels.previewMessages : previewMessages;
        SubmitButtonMessages submitButtonMessages3 = (i2 & 1) != 0 ? labels.submitButtonMessages : submitButtonMessages;
        String str209 = (i2 & 2) != 0 ? labels.placeFlatAndHoldId : str29;
        String str210 = (i2 & 4) != 0 ? labels.idLookingGood : str30;
        String str211 = (i2 & 8) != 0 ? labels.moveIdCloser : str31;
        String str212 = (i2 & 16) != 0 ? labels.adjustLighting : str32;
        String str213 = (i2 & 32) != 0 ? labels.keepIdFlat : str33;
        String str214 = (i2 & 64) != 0 ? labels.positionFront : str34;
        String str215 = (i2 & 128) != 0 ? labels.ensureIdFocus : str35;
        String str216 = (i2 & 256) != 0 ? labels.placeFlatAndHoldPassport : str36;
        String str217 = (i2 & 512) != 0 ? labels.keepPassportFlat : str37;
        String str218 = (i2 & 1024) != 0 ? labels.movePassportCloser : str38;
        String str219 = (i2 & 2048) != 0 ? labels.ensurePassportFocus : str39;
        String str220 = (i2 & 4096) != 0 ? labels.passportLookingGood : str40;
        String str221 = (i2 & 8192) != 0 ? labels.openPassportBook : str41;
        String str222 = (i2 & 16384) != 0 ? labels.flipIdBarcode : str42;
        String str223 = (i2 & 32768) != 0 ? labels.makeSureBarcode : str43;
        String str224 = (i2 & 65536) != 0 ? labels.positionBack : str44;
        String str225 = (i2 & 131072) != 0 ? labels.title : str45;
        String str226 = (i2 & 262144) != 0 ? labels.descriptionText : str46;
        String str227 = (i2 & 524288) != 0 ? labels.headerText : str47;
        String str228 = (i2 & 1048576) != 0 ? labels.captureSuccess : str48;
        String str229 = (i2 & 2097152) != 0 ? labels.scanning : str49;
        String str230 = (i2 & 4194304) != 0 ? labels.tryPhotoManually : str50;
        String str231 = (i2 & 8388608) != 0 ? labels.warningMessageText : str51;
        String str232 = (i2 & 16777216) != 0 ? labels.warningMessageCloseText : str52;
        String str233 = (i2 & 33554432) != 0 ? labels.agreeButtonText : str53;
        String str234 = (i2 & 67108864) != 0 ? labels.declineButtonText : str54;
        String str235 = (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? labels.movePhoneUp : str55;
        String str236 = (i2 & 268435456) != 0 ? labels.movePhoneBack : str56;
        String str237 = (i2 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? labels.movePhoneDown : str57;
        String str238 = (i2 & 1073741824) != 0 ? labels.movePhoneRight : str58;
        String str239 = (i2 & Integer.MIN_VALUE) != 0 ? labels.movePhoneLeft : str59;
        String str240 = str238;
        String str241 = (i3 & 1) != 0 ? labels.idTooClose : str60;
        String str242 = (i3 & 2) != 0 ? labels.keepSteady : str61;
        String str243 = (i3 & 4) != 0 ? labels.tooClose : str62;
        String str244 = (i3 & 8) != 0 ? labels.noPassportDetected : str63;
        String str245 = (i3 & 16) != 0 ? labels.idealFace : str64;
        String str246 = (i3 & 32) != 0 ? labels.faceTooClose : str65;
        String str247 = (i3 & 64) != 0 ? labels.movePhoneFrontLowEndDevice : str66;
        String str248 = (i3 & 128) != 0 ? labels.faceMustBeVisible : str67;
        String str249 = (i3 & 256) != 0 ? labels.currentDocument : str68;
        String str250 = (i3 & 512) != 0 ? labels.documentNumber : str69;
        String str251 = (i3 & 1024) != 0 ? labels.documentUploadCounter : str70;
        String str252 = (i3 & 2048) != 0 ? labels.numOfDocuments : str71;
        String str253 = (i3 & 4096) != 0 ? labels.document : str72;
        String str254 = (i3 & 8192) != 0 ? labels.submitButton : str73;
        String str255 = (i3 & 16384) != 0 ? labels.retryButton : str74;
        String str256 = (i3 & 32768) != 0 ? labels.uploading : str75;
        String str257 = (i3 & 65536) != 0 ? labels.success : str76;
        String str258 = (i3 & 131072) != 0 ? labels.additionalInstructions : str77;
        String str259 = (i3 & 262144) != 0 ? labels.documentCollectionTitle : str78;
        String str260 = (i3 & 524288) != 0 ? labels.documentPreviewTitle : str79;
        String str261 = (i3 & 1048576) != 0 ? labels.transitionHeaderText : str80;
        String str262 = (i3 & 2097152) != 0 ? labels.transitionInstructionsPrimaryText : str81;
        String str263 = (i3 & 4194304) != 0 ? labels.transitionInstructionsSecondaryText : str82;
        String str264 = (i3 & 8388608) != 0 ? labels.glareError : str83;
        String str265 = (i3 & 16777216) != 0 ? labels.blurErrorSecondary : str84;
        ErrorLabelsExtended errorLabelsExtended3 = (i3 & 33554432) != 0 ? labels.error : errorLabelsExtended;
        MobileLabels mobileLabels3 = (i3 & 67108864) != 0 ? labels.mobile : mobileLabels;
        String str266 = (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? labels.haveDocReady : str85;
        String str267 = (i3 & 268435456) != 0 ? labels.documentCameraPermission : str86;
        String str268 = (i3 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? labels.noCardDetected : str87;
        String str269 = (i3 & 1073741824) != 0 ? labels.instructionsPrimaryText : str88;
        String str270 = (i3 & Integer.MIN_VALUE) != 0 ? labels.instructionsSecondaryText : str89;
        if ((i4 & 1) != 0) {
            str92 = str269;
            str91 = labels.continueButton;
            str94 = str258;
            str95 = str259;
            str96 = str260;
            str97 = str261;
            str98 = str262;
            str99 = str263;
            str100 = str264;
            str101 = str265;
            errorLabelsExtended2 = errorLabelsExtended3;
            mobileLabels2 = mobileLabels3;
            str102 = str266;
            str103 = str267;
            str104 = str268;
            str105 = str270;
            str107 = str244;
            str108 = str245;
            str109 = str246;
            str110 = str247;
            str111 = str248;
            str112 = str249;
            str113 = str250;
            str114 = str251;
            str115 = str252;
            str116 = str253;
            str117 = str254;
            str118 = str255;
            str119 = str256;
            str93 = str257;
            str120 = str239;
            str122 = str229;
            str123 = str230;
            str124 = str231;
            str125 = str232;
            str126 = str233;
            str127 = str234;
            str128 = str235;
            str129 = str236;
            str130 = str237;
            str131 = str240;
            str132 = str241;
            str133 = str242;
            str106 = str243;
            str135 = str216;
            str136 = str217;
            str137 = str218;
            str138 = str219;
            str139 = str220;
            str140 = str221;
            str141 = str222;
            str142 = str223;
            str143 = str224;
            str144 = str225;
            str145 = str226;
            str146 = str227;
            str121 = str228;
            str148 = str205;
            str149 = str206;
            str150 = str207;
            str151 = str208;
            previewMessages2 = previewMessages3;
            submitButtonMessages2 = submitButtonMessages3;
            str152 = str209;
            str153 = str210;
            str154 = str211;
            str155 = str212;
            str156 = str213;
            str157 = str214;
            str134 = str215;
            str158 = str192;
            str159 = str193;
            str160 = str194;
            str161 = str195;
            str162 = str196;
            str163 = str197;
            str164 = str198;
            str165 = str199;
            str166 = str200;
            str167 = str201;
            str168 = str202;
            str169 = str203;
            str147 = str204;
            str170 = str181;
            str171 = str182;
            str172 = str183;
            str173 = str184;
            str174 = str185;
            str175 = str186;
            str176 = str187;
            str177 = str188;
            str178 = str189;
            str179 = str190;
            nativeMessages2 = nativeMessages3;
            helpMessages2 = helpMessages3;
            l2 = l3;
        } else {
            str91 = str90;
            str92 = str269;
            str93 = str257;
            str94 = str258;
            str95 = str259;
            str96 = str260;
            str97 = str261;
            str98 = str262;
            str99 = str263;
            str100 = str264;
            str101 = str265;
            errorLabelsExtended2 = errorLabelsExtended3;
            mobileLabels2 = mobileLabels3;
            str102 = str266;
            str103 = str267;
            str104 = str268;
            str105 = str270;
            str106 = str243;
            str107 = str244;
            str108 = str245;
            str109 = str246;
            str110 = str247;
            str111 = str248;
            str112 = str249;
            str113 = str250;
            str114 = str251;
            str115 = str252;
            str116 = str253;
            str117 = str254;
            str118 = str255;
            str119 = str256;
            str120 = str239;
            str121 = str228;
            str122 = str229;
            str123 = str230;
            str124 = str231;
            str125 = str232;
            str126 = str233;
            str127 = str234;
            str128 = str235;
            str129 = str236;
            str130 = str237;
            str131 = str240;
            str132 = str241;
            str133 = str242;
            str134 = str215;
            str135 = str216;
            str136 = str217;
            str137 = str218;
            str138 = str219;
            str139 = str220;
            str140 = str221;
            str141 = str222;
            str142 = str223;
            str143 = str224;
            str144 = str225;
            str145 = str226;
            str146 = str227;
            str147 = str204;
            str148 = str205;
            str149 = str206;
            str150 = str207;
            str151 = str208;
            previewMessages2 = previewMessages3;
            submitButtonMessages2 = submitButtonMessages3;
            str152 = str209;
            str153 = str210;
            str154 = str211;
            str155 = str212;
            str156 = str213;
            str157 = str214;
            str158 = str192;
            helpMessages2 = helpMessages3;
            str159 = str193;
            str160 = str194;
            str161 = str195;
            str162 = str196;
            str163 = str197;
            str164 = str198;
            str165 = str199;
            str166 = str200;
            str167 = str201;
            str168 = str202;
            str169 = str203;
            l2 = l3;
            str170 = str181;
            str171 = str182;
            str172 = str183;
            str173 = str184;
            str174 = str185;
            str175 = str186;
            str176 = str187;
            str177 = str188;
            str178 = str189;
            str179 = str190;
            nativeMessages2 = nativeMessages3;
        }
        return labels.copy(str191, l2, str170, str171, str172, str173, str174, str175, str176, str177, str178, str179, nativeMessages2, helpMessages2, str158, str159, str160, str161, str162, str163, str164, str165, str166, str167, str168, str169, str147, str148, str149, str150, str151, previewMessages2, submitButtonMessages2, str152, str153, str154, str155, str156, str157, str134, str135, str136, str137, str138, str139, str140, str141, str142, str143, str144, str145, str146, str121, str122, str123, str124, str125, str126, str127, str128, str129, str130, str131, str120, str132, str133, str106, str107, str108, str109, str110, str111, str112, str113, str114, str115, str116, str117, str118, str119, str93, str94, str95, str96, str97, str98, str99, str100, str101, errorLabelsExtended2, mobileLabels2, str102, str103, str104, str92, str105, str91);
    }

    /* renamed from: component1, reason: from getter */
    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    /* renamed from: component10, reason: from getter */
    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    /* renamed from: component11, reason: from getter */
    public final String getMoveCloser() {
        return this.moveCloser;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    /* renamed from: component13, reason: from getter */
    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    /* renamed from: component14, reason: from getter */
    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    /* renamed from: component15, reason: from getter */
    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDarkImageError() {
        return this.darkImageError;
    }

    /* renamed from: component17, reason: from getter */
    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    /* renamed from: component18, reason: from getter */
    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    /* renamed from: component19, reason: from getter */
    public final String getManualSecondary() {
        return this.manualSecondary;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component20, reason: from getter */
    public final String getCameraIssue() {
        return this.cameraIssue;
    }

    /* renamed from: component21, reason: from getter */
    public final String getStartMode() {
        return this.startMode;
    }

    /* renamed from: component22, reason: from getter */
    public final String getCaptureMode() {
        return this.captureMode;
    }

    /* renamed from: component23, reason: from getter */
    public final String getConfirmMode() {
        return this.confirmMode;
    }

    /* renamed from: component24, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component25, reason: from getter */
    public final String getCaptureCompatibilityCheck() {
        return this.captureCompatibilityCheck;
    }

    /* renamed from: component26, reason: from getter */
    public final String getDefaultDocumentTitle() {
        return this.defaultDocumentTitle;
    }

    /* renamed from: component27, reason: from getter */
    public final String getCapturePageTitle() {
        return this.capturePageTitle;
    }

    /* renamed from: component28, reason: from getter */
    public final String getConfirmPageTitle() {
        return this.confirmPageTitle;
    }

    /* renamed from: component29, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDocumentName() {
        return this.documentName;
    }

    /* renamed from: component30, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component31, reason: from getter */
    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    /* renamed from: component32, reason: from getter */
    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    /* renamed from: component33, reason: from getter */
    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    /* renamed from: component34, reason: from getter */
    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    /* renamed from: component35, reason: from getter */
    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    /* renamed from: component36, reason: from getter */
    public final String getMoveIdCloser() {
        return this.moveIdCloser;
    }

    /* renamed from: component37, reason: from getter */
    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    /* renamed from: component38, reason: from getter */
    public final String getKeepIdFlat() {
        return this.keepIdFlat;
    }

    /* renamed from: component39, reason: from getter */
    public final String getPositionFront() {
        return this.positionFront;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDocumentType() {
        return this.documentType;
    }

    /* renamed from: component40, reason: from getter */
    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    /* renamed from: component41, reason: from getter */
    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    /* renamed from: component42, reason: from getter */
    public final String getKeepPassportFlat() {
        return this.keepPassportFlat;
    }

    /* renamed from: component43, reason: from getter */
    public final String getMovePassportCloser() {
        return this.movePassportCloser;
    }

    /* renamed from: component44, reason: from getter */
    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    /* renamed from: component45, reason: from getter */
    public final String getPassportLookingGood() {
        return this.passportLookingGood;
    }

    /* renamed from: component46, reason: from getter */
    public final String getOpenPassportBook() {
        return this.openPassportBook;
    }

    /* renamed from: component47, reason: from getter */
    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    /* renamed from: component48, reason: from getter */
    public final String getMakeSureBarcode() {
        return this.makeSureBarcode;
    }

    /* renamed from: component49, reason: from getter */
    public final String getPositionBack() {
        return this.positionBack;
    }

    /* renamed from: component5, reason: from getter */
    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    /* renamed from: component50, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component51, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    /* renamed from: component52, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    /* renamed from: component53, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component54, reason: from getter */
    public final String getScanning() {
        return this.scanning;
    }

    /* renamed from: component55, reason: from getter */
    public final String getTryPhotoManually() {
        return this.tryPhotoManually;
    }

    /* renamed from: component56, reason: from getter */
    public final String getWarningMessageText() {
        return this.warningMessageText;
    }

    /* renamed from: component57, reason: from getter */
    public final String getWarningMessageCloseText() {
        return this.warningMessageCloseText;
    }

    /* renamed from: component58, reason: from getter */
    public final String getAgreeButtonText() {
        return this.agreeButtonText;
    }

    /* renamed from: component59, reason: from getter */
    public final String getDeclineButtonText() {
        return this.declineButtonText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getConfirmationText() {
        return this.confirmationText;
    }

    /* renamed from: component60, reason: from getter */
    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    /* renamed from: component61, reason: from getter */
    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    /* renamed from: component62, reason: from getter */
    public final String getMovePhoneDown() {
        return this.movePhoneDown;
    }

    /* renamed from: component63, reason: from getter */
    public final String getMovePhoneRight() {
        return this.movePhoneRight;
    }

    /* renamed from: component64, reason: from getter */
    public final String getMovePhoneLeft() {
        return this.movePhoneLeft;
    }

    /* renamed from: component65, reason: from getter */
    public final String getIdTooClose() {
        return this.idTooClose;
    }

    /* renamed from: component66, reason: from getter */
    public final String getKeepSteady() {
        return this.keepSteady;
    }

    /* renamed from: component67, reason: from getter */
    public final String getTooClose() {
        return this.tooClose;
    }

    /* renamed from: component68, reason: from getter */
    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    /* renamed from: component69, reason: from getter */
    public final String getIdealFace() {
        return this.idealFace;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    /* renamed from: component70, reason: from getter */
    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    /* renamed from: component71, reason: from getter */
    public final String getMovePhoneFrontLowEndDevice() {
        return this.movePhoneFrontLowEndDevice;
    }

    /* renamed from: component72, reason: from getter */
    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    /* renamed from: component73, reason: from getter */
    public final String getCurrentDocument() {
        return this.currentDocument;
    }

    /* renamed from: component74, reason: from getter */
    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    /* renamed from: component75, reason: from getter */
    public final String getDocumentUploadCounter() {
        return this.documentUploadCounter;
    }

    /* renamed from: component76, reason: from getter */
    public final String getNumOfDocuments() {
        return this.numOfDocuments;
    }

    /* renamed from: component77, reason: from getter */
    public final String getDocument() {
        return this.document;
    }

    /* renamed from: component78, reason: from getter */
    public final String getSubmitButton() {
        return this.submitButton;
    }

    /* renamed from: component79, reason: from getter */
    public final String getRetryButton() {
        return this.retryButton;
    }

    /* renamed from: component8, reason: from getter */
    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    /* renamed from: component80, reason: from getter */
    public final String getUploading() {
        return this.uploading;
    }

    /* renamed from: component81, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    /* renamed from: component82, reason: from getter */
    public final String getAdditionalInstructions() {
        return this.additionalInstructions;
    }

    /* renamed from: component83, reason: from getter */
    public final String getDocumentCollectionTitle() {
        return this.documentCollectionTitle;
    }

    /* renamed from: component84, reason: from getter */
    public final String getDocumentPreviewTitle() {
        return this.documentPreviewTitle;
    }

    /* renamed from: component85, reason: from getter */
    public final String getTransitionHeaderText() {
        return this.transitionHeaderText;
    }

    /* renamed from: component86, reason: from getter */
    public final String getTransitionInstructionsPrimaryText() {
        return this.transitionInstructionsPrimaryText;
    }

    /* renamed from: component87, reason: from getter */
    public final String getTransitionInstructionsSecondaryText() {
        return this.transitionInstructionsSecondaryText;
    }

    /* renamed from: component88, reason: from getter */
    public final String getGlareError() {
        return this.glareError;
    }

    /* renamed from: component89, reason: from getter */
    public final String getBlurErrorSecondary() {
        return this.blurErrorSecondary;
    }

    /* renamed from: component9, reason: from getter */
    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    /* renamed from: component90, reason: from getter */
    public final ErrorLabelsExtended getError() {
        return this.error;
    }

    /* renamed from: component91, reason: from getter */
    public final MobileLabels getMobile() {
        return this.mobile;
    }

    /* renamed from: component92, reason: from getter */
    public final String getHaveDocReady() {
        return this.haveDocReady;
    }

    /* renamed from: component93, reason: from getter */
    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    /* renamed from: component94, reason: from getter */
    public final String getNoCardDetected() {
        return this.noCardDetected;
    }

    /* renamed from: component95, reason: from getter */
    public final String getInstructionsPrimaryText() {
        return this.instructionsPrimaryText;
    }

    /* renamed from: component96, reason: from getter */
    public final String getInstructionsSecondaryText() {
        return this.instructionsSecondaryText;
    }

    /* renamed from: component97, reason: from getter */
    public final String getContinueButton() {
        return this.continueButton;
    }

    public final Labels copy(String processingConsent, Long errorCode, String documentName, String documentType, String confirmationTitle, String confirmationText, String submitButtonText, String movePhoneFront, String greatNowCapture, String alignFaceBox, String moveCloser, String lookDirectly, NativeMessages nativeMessages, HelpMessages helpMessages, String cameraLoading, String darkImageError, String moveAreaError, String manualPrimary, String manualSecondary, String cameraIssue, String startMode, String captureMode, String confirmMode, String backToScanning, String captureCompatibilityCheck, String defaultDocumentTitle, String capturePageTitle, String confirmPageTitle, String toGetStarted, String errorMessage, String defaultIvsError, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String placeFlatAndHoldId, String idLookingGood, String moveIdCloser, String adjustLighting, String keepIdFlat, String positionFront, String ensureIdFocus, String placeFlatAndHoldPassport, String keepPassportFlat, String movePassportCloser, String ensurePassportFocus, String passportLookingGood, String openPassportBook, String flipIdBarcode, String makeSureBarcode, String positionBack, String title, String descriptionText, String headerText, String captureSuccess, String scanning, String tryPhotoManually, String warningMessageText, String warningMessageCloseText, String agreeButtonText, String declineButtonText, String movePhoneUp, String movePhoneBack, String movePhoneDown, String movePhoneRight, String movePhoneLeft, String idTooClose, String keepSteady, String tooClose, String noPassportDetected, String idealFace, String faceTooClose, String movePhoneFrontLowEndDevice, String faceMustBeVisible, String currentDocument, String documentNumber, String documentUploadCounter, String numOfDocuments, String document, String submitButton, String retryButton, String uploading, String success, String additionalInstructions, String documentCollectionTitle, String documentPreviewTitle, String transitionHeaderText, String transitionInstructionsPrimaryText, String transitionInstructionsSecondaryText, String glareError, String blurErrorSecondary, ErrorLabelsExtended error, MobileLabels mobile, String haveDocReady, String documentCameraPermission, String noCardDetected, String instructionsPrimaryText, String instructionsSecondaryText, String continueButton) {
        return new Labels(processingConsent, errorCode, documentName, documentType, confirmationTitle, confirmationText, submitButtonText, movePhoneFront, greatNowCapture, alignFaceBox, moveCloser, lookDirectly, nativeMessages, helpMessages, cameraLoading, darkImageError, moveAreaError, manualPrimary, manualSecondary, cameraIssue, startMode, captureMode, confirmMode, backToScanning, captureCompatibilityCheck, defaultDocumentTitle, capturePageTitle, confirmPageTitle, toGetStarted, errorMessage, defaultIvsError, previewMessages, submitButtonMessages, placeFlatAndHoldId, idLookingGood, moveIdCloser, adjustLighting, keepIdFlat, positionFront, ensureIdFocus, placeFlatAndHoldPassport, keepPassportFlat, movePassportCloser, ensurePassportFocus, passportLookingGood, openPassportBook, flipIdBarcode, makeSureBarcode, positionBack, title, descriptionText, headerText, captureSuccess, scanning, tryPhotoManually, warningMessageText, warningMessageCloseText, agreeButtonText, declineButtonText, movePhoneUp, movePhoneBack, movePhoneDown, movePhoneRight, movePhoneLeft, idTooClose, keepSteady, tooClose, noPassportDetected, idealFace, faceTooClose, movePhoneFrontLowEndDevice, faceMustBeVisible, currentDocument, documentNumber, documentUploadCounter, numOfDocuments, document, submitButton, retryButton, uploading, success, additionalInstructions, documentCollectionTitle, documentPreviewTitle, transitionHeaderText, transitionInstructionsPrimaryText, transitionInstructionsSecondaryText, glareError, blurErrorSecondary, error, mobile, haveDocReady, documentCameraPermission, noCardDetected, instructionsPrimaryText, instructionsSecondaryText, continueButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Labels)) {
            return false;
        }
        Labels labels = (Labels) other;
        return Intrinsics.areEqual(this.processingConsent, labels.processingConsent) && Intrinsics.areEqual(this.errorCode, labels.errorCode) && Intrinsics.areEqual(this.documentName, labels.documentName) && Intrinsics.areEqual(this.documentType, labels.documentType) && Intrinsics.areEqual(this.confirmationTitle, labels.confirmationTitle) && Intrinsics.areEqual(this.confirmationText, labels.confirmationText) && Intrinsics.areEqual(this.submitButtonText, labels.submitButtonText) && Intrinsics.areEqual(this.movePhoneFront, labels.movePhoneFront) && Intrinsics.areEqual(this.greatNowCapture, labels.greatNowCapture) && Intrinsics.areEqual(this.alignFaceBox, labels.alignFaceBox) && Intrinsics.areEqual(this.moveCloser, labels.moveCloser) && Intrinsics.areEqual(this.lookDirectly, labels.lookDirectly) && Intrinsics.areEqual(this.nativeMessages, labels.nativeMessages) && Intrinsics.areEqual(this.helpMessages, labels.helpMessages) && Intrinsics.areEqual(this.cameraLoading, labels.cameraLoading) && Intrinsics.areEqual(this.darkImageError, labels.darkImageError) && Intrinsics.areEqual(this.moveAreaError, labels.moveAreaError) && Intrinsics.areEqual(this.manualPrimary, labels.manualPrimary) && Intrinsics.areEqual(this.manualSecondary, labels.manualSecondary) && Intrinsics.areEqual(this.cameraIssue, labels.cameraIssue) && Intrinsics.areEqual(this.startMode, labels.startMode) && Intrinsics.areEqual(this.captureMode, labels.captureMode) && Intrinsics.areEqual(this.confirmMode, labels.confirmMode) && Intrinsics.areEqual(this.backToScanning, labels.backToScanning) && Intrinsics.areEqual(this.captureCompatibilityCheck, labels.captureCompatibilityCheck) && Intrinsics.areEqual(this.defaultDocumentTitle, labels.defaultDocumentTitle) && Intrinsics.areEqual(this.capturePageTitle, labels.capturePageTitle) && Intrinsics.areEqual(this.confirmPageTitle, labels.confirmPageTitle) && Intrinsics.areEqual(this.toGetStarted, labels.toGetStarted) && Intrinsics.areEqual(this.errorMessage, labels.errorMessage) && Intrinsics.areEqual(this.defaultIvsError, labels.defaultIvsError) && Intrinsics.areEqual(this.previewMessages, labels.previewMessages) && Intrinsics.areEqual(this.submitButtonMessages, labels.submitButtonMessages) && Intrinsics.areEqual(this.placeFlatAndHoldId, labels.placeFlatAndHoldId) && Intrinsics.areEqual(this.idLookingGood, labels.idLookingGood) && Intrinsics.areEqual(this.moveIdCloser, labels.moveIdCloser) && Intrinsics.areEqual(this.adjustLighting, labels.adjustLighting) && Intrinsics.areEqual(this.keepIdFlat, labels.keepIdFlat) && Intrinsics.areEqual(this.positionFront, labels.positionFront) && Intrinsics.areEqual(this.ensureIdFocus, labels.ensureIdFocus) && Intrinsics.areEqual(this.placeFlatAndHoldPassport, labels.placeFlatAndHoldPassport) && Intrinsics.areEqual(this.keepPassportFlat, labels.keepPassportFlat) && Intrinsics.areEqual(this.movePassportCloser, labels.movePassportCloser) && Intrinsics.areEqual(this.ensurePassportFocus, labels.ensurePassportFocus) && Intrinsics.areEqual(this.passportLookingGood, labels.passportLookingGood) && Intrinsics.areEqual(this.openPassportBook, labels.openPassportBook) && Intrinsics.areEqual(this.flipIdBarcode, labels.flipIdBarcode) && Intrinsics.areEqual(this.makeSureBarcode, labels.makeSureBarcode) && Intrinsics.areEqual(this.positionBack, labels.positionBack) && Intrinsics.areEqual(this.title, labels.title) && Intrinsics.areEqual(this.descriptionText, labels.descriptionText) && Intrinsics.areEqual(this.headerText, labels.headerText) && Intrinsics.areEqual(this.captureSuccess, labels.captureSuccess) && Intrinsics.areEqual(this.scanning, labels.scanning) && Intrinsics.areEqual(this.tryPhotoManually, labels.tryPhotoManually) && Intrinsics.areEqual(this.warningMessageText, labels.warningMessageText) && Intrinsics.areEqual(this.warningMessageCloseText, labels.warningMessageCloseText) && Intrinsics.areEqual(this.agreeButtonText, labels.agreeButtonText) && Intrinsics.areEqual(this.declineButtonText, labels.declineButtonText) && Intrinsics.areEqual(this.movePhoneUp, labels.movePhoneUp) && Intrinsics.areEqual(this.movePhoneBack, labels.movePhoneBack) && Intrinsics.areEqual(this.movePhoneDown, labels.movePhoneDown) && Intrinsics.areEqual(this.movePhoneRight, labels.movePhoneRight) && Intrinsics.areEqual(this.movePhoneLeft, labels.movePhoneLeft) && Intrinsics.areEqual(this.idTooClose, labels.idTooClose) && Intrinsics.areEqual(this.keepSteady, labels.keepSteady) && Intrinsics.areEqual(this.tooClose, labels.tooClose) && Intrinsics.areEqual(this.noPassportDetected, labels.noPassportDetected) && Intrinsics.areEqual(this.idealFace, labels.idealFace) && Intrinsics.areEqual(this.faceTooClose, labels.faceTooClose) && Intrinsics.areEqual(this.movePhoneFrontLowEndDevice, labels.movePhoneFrontLowEndDevice) && Intrinsics.areEqual(this.faceMustBeVisible, labels.faceMustBeVisible) && Intrinsics.areEqual(this.currentDocument, labels.currentDocument) && Intrinsics.areEqual(this.documentNumber, labels.documentNumber) && Intrinsics.areEqual(this.documentUploadCounter, labels.documentUploadCounter) && Intrinsics.areEqual(this.numOfDocuments, labels.numOfDocuments) && Intrinsics.areEqual(this.document, labels.document) && Intrinsics.areEqual(this.submitButton, labels.submitButton) && Intrinsics.areEqual(this.retryButton, labels.retryButton) && Intrinsics.areEqual(this.uploading, labels.uploading) && Intrinsics.areEqual(this.success, labels.success) && Intrinsics.areEqual(this.additionalInstructions, labels.additionalInstructions) && Intrinsics.areEqual(this.documentCollectionTitle, labels.documentCollectionTitle) && Intrinsics.areEqual(this.documentPreviewTitle, labels.documentPreviewTitle) && Intrinsics.areEqual(this.transitionHeaderText, labels.transitionHeaderText) && Intrinsics.areEqual(this.transitionInstructionsPrimaryText, labels.transitionInstructionsPrimaryText) && Intrinsics.areEqual(this.transitionInstructionsSecondaryText, labels.transitionInstructionsSecondaryText) && Intrinsics.areEqual(this.glareError, labels.glareError) && Intrinsics.areEqual(this.blurErrorSecondary, labels.blurErrorSecondary) && Intrinsics.areEqual(this.error, labels.error) && Intrinsics.areEqual(this.mobile, labels.mobile) && Intrinsics.areEqual(this.haveDocReady, labels.haveDocReady) && Intrinsics.areEqual(this.documentCameraPermission, labels.documentCameraPermission) && Intrinsics.areEqual(this.noCardDetected, labels.noCardDetected) && Intrinsics.areEqual(this.instructionsPrimaryText, labels.instructionsPrimaryText) && Intrinsics.areEqual(this.instructionsSecondaryText, labels.instructionsSecondaryText) && Intrinsics.areEqual(this.continueButton, labels.continueButton);
    }

    public int hashCode() {
        String str = this.processingConsent;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.errorCode;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.documentName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.documentType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.confirmationTitle;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.confirmationText;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.submitButtonText;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.movePhoneFront;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.greatNowCapture;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.alignFaceBox;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.moveCloser;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.lookDirectly;
        int hashCode12 = (hashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        NativeMessages nativeMessages = this.nativeMessages;
        int hashCode13 = (hashCode12 + (nativeMessages == null ? 0 : nativeMessages.hashCode())) * 31;
        HelpMessages helpMessages = this.helpMessages;
        int hashCode14 = (hashCode13 + (helpMessages == null ? 0 : helpMessages.hashCode())) * 31;
        String str12 = this.cameraLoading;
        int hashCode15 = (hashCode14 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.darkImageError;
        int hashCode16 = (hashCode15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.moveAreaError;
        int hashCode17 = (hashCode16 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.manualPrimary;
        int hashCode18 = (hashCode17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.manualSecondary;
        int hashCode19 = (hashCode18 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.cameraIssue;
        int hashCode20 = (hashCode19 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.startMode;
        int hashCode21 = (hashCode20 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.captureMode;
        int hashCode22 = (hashCode21 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.confirmMode;
        int hashCode23 = (hashCode22 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.backToScanning;
        int hashCode24 = (hashCode23 + (str21 == null ? 0 : str21.hashCode())) * 31;
        String str22 = this.captureCompatibilityCheck;
        int hashCode25 = (hashCode24 + (str22 == null ? 0 : str22.hashCode())) * 31;
        String str23 = this.defaultDocumentTitle;
        int hashCode26 = (hashCode25 + (str23 == null ? 0 : str23.hashCode())) * 31;
        String str24 = this.capturePageTitle;
        int hashCode27 = (hashCode26 + (str24 == null ? 0 : str24.hashCode())) * 31;
        String str25 = this.confirmPageTitle;
        int hashCode28 = (hashCode27 + (str25 == null ? 0 : str25.hashCode())) * 31;
        String str26 = this.toGetStarted;
        int hashCode29 = (hashCode28 + (str26 == null ? 0 : str26.hashCode())) * 31;
        String str27 = this.errorMessage;
        int hashCode30 = (hashCode29 + (str27 == null ? 0 : str27.hashCode())) * 31;
        String str28 = this.defaultIvsError;
        int hashCode31 = (hashCode30 + (str28 == null ? 0 : str28.hashCode())) * 31;
        PreviewMessages previewMessages = this.previewMessages;
        int hashCode32 = (hashCode31 + (previewMessages == null ? 0 : previewMessages.hashCode())) * 31;
        SubmitButtonMessages submitButtonMessages = this.submitButtonMessages;
        int hashCode33 = (hashCode32 + (submitButtonMessages == null ? 0 : submitButtonMessages.hashCode())) * 31;
        String str29 = this.placeFlatAndHoldId;
        int hashCode34 = (hashCode33 + (str29 == null ? 0 : str29.hashCode())) * 31;
        String str30 = this.idLookingGood;
        int hashCode35 = (hashCode34 + (str30 == null ? 0 : str30.hashCode())) * 31;
        String str31 = this.moveIdCloser;
        int hashCode36 = (hashCode35 + (str31 == null ? 0 : str31.hashCode())) * 31;
        String str32 = this.adjustLighting;
        int hashCode37 = (hashCode36 + (str32 == null ? 0 : str32.hashCode())) * 31;
        String str33 = this.keepIdFlat;
        int hashCode38 = (hashCode37 + (str33 == null ? 0 : str33.hashCode())) * 31;
        String str34 = this.positionFront;
        int hashCode39 = (hashCode38 + (str34 == null ? 0 : str34.hashCode())) * 31;
        String str35 = this.ensureIdFocus;
        int hashCode40 = (hashCode39 + (str35 == null ? 0 : str35.hashCode())) * 31;
        String str36 = this.placeFlatAndHoldPassport;
        int hashCode41 = (hashCode40 + (str36 == null ? 0 : str36.hashCode())) * 31;
        String str37 = this.keepPassportFlat;
        int hashCode42 = (hashCode41 + (str37 == null ? 0 : str37.hashCode())) * 31;
        String str38 = this.movePassportCloser;
        int hashCode43 = (hashCode42 + (str38 == null ? 0 : str38.hashCode())) * 31;
        String str39 = this.ensurePassportFocus;
        int hashCode44 = (hashCode43 + (str39 == null ? 0 : str39.hashCode())) * 31;
        String str40 = this.passportLookingGood;
        int hashCode45 = (hashCode44 + (str40 == null ? 0 : str40.hashCode())) * 31;
        String str41 = this.openPassportBook;
        int hashCode46 = (hashCode45 + (str41 == null ? 0 : str41.hashCode())) * 31;
        String str42 = this.flipIdBarcode;
        int hashCode47 = (hashCode46 + (str42 == null ? 0 : str42.hashCode())) * 31;
        String str43 = this.makeSureBarcode;
        int hashCode48 = (hashCode47 + (str43 == null ? 0 : str43.hashCode())) * 31;
        String str44 = this.positionBack;
        int hashCode49 = (hashCode48 + (str44 == null ? 0 : str44.hashCode())) * 31;
        String str45 = this.title;
        int hashCode50 = (hashCode49 + (str45 == null ? 0 : str45.hashCode())) * 31;
        String str46 = this.descriptionText;
        int hashCode51 = (hashCode50 + (str46 == null ? 0 : str46.hashCode())) * 31;
        String str47 = this.headerText;
        int hashCode52 = (hashCode51 + (str47 == null ? 0 : str47.hashCode())) * 31;
        String str48 = this.captureSuccess;
        int hashCode53 = (hashCode52 + (str48 == null ? 0 : str48.hashCode())) * 31;
        String str49 = this.scanning;
        int hashCode54 = (hashCode53 + (str49 == null ? 0 : str49.hashCode())) * 31;
        String str50 = this.tryPhotoManually;
        int hashCode55 = (hashCode54 + (str50 == null ? 0 : str50.hashCode())) * 31;
        String str51 = this.warningMessageText;
        int hashCode56 = (hashCode55 + (str51 == null ? 0 : str51.hashCode())) * 31;
        String str52 = this.warningMessageCloseText;
        int hashCode57 = (hashCode56 + (str52 == null ? 0 : str52.hashCode())) * 31;
        String str53 = this.agreeButtonText;
        int hashCode58 = (hashCode57 + (str53 == null ? 0 : str53.hashCode())) * 31;
        String str54 = this.declineButtonText;
        int hashCode59 = (hashCode58 + (str54 == null ? 0 : str54.hashCode())) * 31;
        String str55 = this.movePhoneUp;
        int hashCode60 = (hashCode59 + (str55 == null ? 0 : str55.hashCode())) * 31;
        String str56 = this.movePhoneBack;
        int hashCode61 = (hashCode60 + (str56 == null ? 0 : str56.hashCode())) * 31;
        String str57 = this.movePhoneDown;
        int hashCode62 = (hashCode61 + (str57 == null ? 0 : str57.hashCode())) * 31;
        String str58 = this.movePhoneRight;
        int hashCode63 = (hashCode62 + (str58 == null ? 0 : str58.hashCode())) * 31;
        String str59 = this.movePhoneLeft;
        int hashCode64 = (hashCode63 + (str59 == null ? 0 : str59.hashCode())) * 31;
        String str60 = this.idTooClose;
        int hashCode65 = (hashCode64 + (str60 == null ? 0 : str60.hashCode())) * 31;
        String str61 = this.keepSteady;
        int hashCode66 = (hashCode65 + (str61 == null ? 0 : str61.hashCode())) * 31;
        String str62 = this.tooClose;
        int hashCode67 = (hashCode66 + (str62 == null ? 0 : str62.hashCode())) * 31;
        String str63 = this.noPassportDetected;
        int hashCode68 = (hashCode67 + (str63 == null ? 0 : str63.hashCode())) * 31;
        String str64 = this.idealFace;
        int hashCode69 = (hashCode68 + (str64 == null ? 0 : str64.hashCode())) * 31;
        String str65 = this.faceTooClose;
        int hashCode70 = (hashCode69 + (str65 == null ? 0 : str65.hashCode())) * 31;
        String str66 = this.movePhoneFrontLowEndDevice;
        int hashCode71 = (hashCode70 + (str66 == null ? 0 : str66.hashCode())) * 31;
        String str67 = this.faceMustBeVisible;
        int hashCode72 = (hashCode71 + (str67 == null ? 0 : str67.hashCode())) * 31;
        String str68 = this.currentDocument;
        int hashCode73 = (hashCode72 + (str68 == null ? 0 : str68.hashCode())) * 31;
        String str69 = this.documentNumber;
        int hashCode74 = (hashCode73 + (str69 == null ? 0 : str69.hashCode())) * 31;
        String str70 = this.documentUploadCounter;
        int hashCode75 = (hashCode74 + (str70 == null ? 0 : str70.hashCode())) * 31;
        String str71 = this.numOfDocuments;
        int hashCode76 = (hashCode75 + (str71 == null ? 0 : str71.hashCode())) * 31;
        String str72 = this.document;
        int hashCode77 = (hashCode76 + (str72 == null ? 0 : str72.hashCode())) * 31;
        String str73 = this.submitButton;
        int hashCode78 = (hashCode77 + (str73 == null ? 0 : str73.hashCode())) * 31;
        String str74 = this.retryButton;
        int hashCode79 = (hashCode78 + (str74 == null ? 0 : str74.hashCode())) * 31;
        String str75 = this.uploading;
        int hashCode80 = (hashCode79 + (str75 == null ? 0 : str75.hashCode())) * 31;
        String str76 = this.success;
        int hashCode81 = (hashCode80 + (str76 == null ? 0 : str76.hashCode())) * 31;
        String str77 = this.additionalInstructions;
        int hashCode82 = (hashCode81 + (str77 == null ? 0 : str77.hashCode())) * 31;
        String str78 = this.documentCollectionTitle;
        int hashCode83 = (hashCode82 + (str78 == null ? 0 : str78.hashCode())) * 31;
        String str79 = this.documentPreviewTitle;
        int hashCode84 = (hashCode83 + (str79 == null ? 0 : str79.hashCode())) * 31;
        String str80 = this.transitionHeaderText;
        int hashCode85 = (hashCode84 + (str80 == null ? 0 : str80.hashCode())) * 31;
        String str81 = this.transitionInstructionsPrimaryText;
        int hashCode86 = (hashCode85 + (str81 == null ? 0 : str81.hashCode())) * 31;
        String str82 = this.transitionInstructionsSecondaryText;
        int hashCode87 = (hashCode86 + (str82 == null ? 0 : str82.hashCode())) * 31;
        String str83 = this.glareError;
        int hashCode88 = (hashCode87 + (str83 == null ? 0 : str83.hashCode())) * 31;
        String str84 = this.blurErrorSecondary;
        int hashCode89 = (hashCode88 + (str84 == null ? 0 : str84.hashCode())) * 31;
        ErrorLabelsExtended errorLabelsExtended = this.error;
        int hashCode90 = (hashCode89 + (errorLabelsExtended == null ? 0 : errorLabelsExtended.hashCode())) * 31;
        MobileLabels mobileLabels = this.mobile;
        int hashCode91 = (hashCode90 + (mobileLabels == null ? 0 : mobileLabels.hashCode())) * 31;
        String str85 = this.haveDocReady;
        int hashCode92 = (hashCode91 + (str85 == null ? 0 : str85.hashCode())) * 31;
        String str86 = this.documentCameraPermission;
        int hashCode93 = (hashCode92 + (str86 == null ? 0 : str86.hashCode())) * 31;
        String str87 = this.noCardDetected;
        int hashCode94 = (hashCode93 + (str87 == null ? 0 : str87.hashCode())) * 31;
        String str88 = this.instructionsPrimaryText;
        int hashCode95 = (hashCode94 + (str88 == null ? 0 : str88.hashCode())) * 31;
        String str89 = this.instructionsSecondaryText;
        int hashCode96 = (hashCode95 + (str89 == null ? 0 : str89.hashCode())) * 31;
        String str90 = this.continueButton;
        return hashCode96 + (str90 != null ? str90.hashCode() : 0);
    }

    public String toString() {
        return "Labels(processingConsent=" + this.processingConsent + ", errorCode=" + this.errorCode + ", documentName=" + this.documentName + ", documentType=" + this.documentType + ", confirmationTitle=" + this.confirmationTitle + ", confirmationText=" + this.confirmationText + ", submitButtonText=" + this.submitButtonText + ", movePhoneFront=" + this.movePhoneFront + ", greatNowCapture=" + this.greatNowCapture + ", alignFaceBox=" + this.alignFaceBox + ", moveCloser=" + this.moveCloser + ", lookDirectly=" + this.lookDirectly + ", nativeMessages=" + this.nativeMessages + ", helpMessages=" + this.helpMessages + ", cameraLoading=" + this.cameraLoading + ", darkImageError=" + this.darkImageError + ", moveAreaError=" + this.moveAreaError + ", manualPrimary=" + this.manualPrimary + ", manualSecondary=" + this.manualSecondary + ", cameraIssue=" + this.cameraIssue + ", startMode=" + this.startMode + ", captureMode=" + this.captureMode + ", confirmMode=" + this.confirmMode + ", backToScanning=" + this.backToScanning + ", captureCompatibilityCheck=" + this.captureCompatibilityCheck + ", defaultDocumentTitle=" + this.defaultDocumentTitle + ", capturePageTitle=" + this.capturePageTitle + ", confirmPageTitle=" + this.confirmPageTitle + ", toGetStarted=" + this.toGetStarted + ", errorMessage=" + this.errorMessage + ", defaultIvsError=" + this.defaultIvsError + ", previewMessages=" + this.previewMessages + ", submitButtonMessages=" + this.submitButtonMessages + ", placeFlatAndHoldId=" + this.placeFlatAndHoldId + ", idLookingGood=" + this.idLookingGood + ", moveIdCloser=" + this.moveIdCloser + ", adjustLighting=" + this.adjustLighting + ", keepIdFlat=" + this.keepIdFlat + ", positionFront=" + this.positionFront + ", ensureIdFocus=" + this.ensureIdFocus + ", placeFlatAndHoldPassport=" + this.placeFlatAndHoldPassport + ", keepPassportFlat=" + this.keepPassportFlat + ", movePassportCloser=" + this.movePassportCloser + ", ensurePassportFocus=" + this.ensurePassportFocus + ", passportLookingGood=" + this.passportLookingGood + ", openPassportBook=" + this.openPassportBook + ", flipIdBarcode=" + this.flipIdBarcode + ", makeSureBarcode=" + this.makeSureBarcode + ", positionBack=" + this.positionBack + ", title=" + this.title + ", descriptionText=" + this.descriptionText + ", headerText=" + this.headerText + ", captureSuccess=" + this.captureSuccess + ", scanning=" + this.scanning + ", tryPhotoManually=" + this.tryPhotoManually + ", warningMessageText=" + this.warningMessageText + ", warningMessageCloseText=" + this.warningMessageCloseText + ", agreeButtonText=" + this.agreeButtonText + ", declineButtonText=" + this.declineButtonText + ", movePhoneUp=" + this.movePhoneUp + ", movePhoneBack=" + this.movePhoneBack + ", movePhoneDown=" + this.movePhoneDown + ", movePhoneRight=" + this.movePhoneRight + ", movePhoneLeft=" + this.movePhoneLeft + ", idTooClose=" + this.idTooClose + ", keepSteady=" + this.keepSteady + ", tooClose=" + this.tooClose + ", noPassportDetected=" + this.noPassportDetected + ", idealFace=" + this.idealFace + ", faceTooClose=" + this.faceTooClose + ", movePhoneFrontLowEndDevice=" + this.movePhoneFrontLowEndDevice + ", faceMustBeVisible=" + this.faceMustBeVisible + ", currentDocument=" + this.currentDocument + ", documentNumber=" + this.documentNumber + ", documentUploadCounter=" + this.documentUploadCounter + ", numOfDocuments=" + this.numOfDocuments + ", document=" + this.document + ", submitButton=" + this.submitButton + ", retryButton=" + this.retryButton + ", uploading=" + this.uploading + ", success=" + this.success + ", additionalInstructions=" + this.additionalInstructions + ", documentCollectionTitle=" + this.documentCollectionTitle + ", documentPreviewTitle=" + this.documentPreviewTitle + ", transitionHeaderText=" + this.transitionHeaderText + ", transitionInstructionsPrimaryText=" + this.transitionInstructionsPrimaryText + ", transitionInstructionsSecondaryText=" + this.transitionInstructionsSecondaryText + ", glareError=" + this.glareError + ", blurErrorSecondary=" + this.blurErrorSecondary + ", error=" + this.error + ", mobile=" + this.mobile + ", haveDocReady=" + this.haveDocReady + ", documentCameraPermission=" + this.documentCameraPermission + ", noCardDetected=" + this.noCardDetected + ", instructionsPrimaryText=" + this.instructionsPrimaryText + ", instructionsSecondaryText=" + this.instructionsSecondaryText + ", continueButton=" + this.continueButton + ")";
    }

    public Labels(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, NativeMessages nativeMessages, HelpMessages helpMessages, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, String str84, ErrorLabelsExtended errorLabelsExtended, MobileLabels mobileLabels, String str85, String str86, String str87, String str88, String str89, String str90) {
        this.processingConsent = str;
        this.errorCode = l;
        this.documentName = str2;
        this.documentType = str3;
        this.confirmationTitle = str4;
        this.confirmationText = str5;
        this.submitButtonText = str6;
        this.movePhoneFront = str7;
        this.greatNowCapture = str8;
        this.alignFaceBox = str9;
        this.moveCloser = str10;
        this.lookDirectly = str11;
        this.nativeMessages = nativeMessages;
        this.helpMessages = helpMessages;
        this.cameraLoading = str12;
        this.darkImageError = str13;
        this.moveAreaError = str14;
        this.manualPrimary = str15;
        this.manualSecondary = str16;
        this.cameraIssue = str17;
        this.startMode = str18;
        this.captureMode = str19;
        this.confirmMode = str20;
        this.backToScanning = str21;
        this.captureCompatibilityCheck = str22;
        this.defaultDocumentTitle = str23;
        this.capturePageTitle = str24;
        this.confirmPageTitle = str25;
        this.toGetStarted = str26;
        this.errorMessage = str27;
        this.defaultIvsError = str28;
        this.previewMessages = previewMessages;
        this.submitButtonMessages = submitButtonMessages;
        this.placeFlatAndHoldId = str29;
        this.idLookingGood = str30;
        this.moveIdCloser = str31;
        this.adjustLighting = str32;
        this.keepIdFlat = str33;
        this.positionFront = str34;
        this.ensureIdFocus = str35;
        this.placeFlatAndHoldPassport = str36;
        this.keepPassportFlat = str37;
        this.movePassportCloser = str38;
        this.ensurePassportFocus = str39;
        this.passportLookingGood = str40;
        this.openPassportBook = str41;
        this.flipIdBarcode = str42;
        this.makeSureBarcode = str43;
        this.positionBack = str44;
        this.title = str45;
        this.descriptionText = str46;
        this.headerText = str47;
        this.captureSuccess = str48;
        this.scanning = str49;
        this.tryPhotoManually = str50;
        this.warningMessageText = str51;
        this.warningMessageCloseText = str52;
        this.agreeButtonText = str53;
        this.declineButtonText = str54;
        this.movePhoneUp = str55;
        this.movePhoneBack = str56;
        this.movePhoneDown = str57;
        this.movePhoneRight = str58;
        this.movePhoneLeft = str59;
        this.idTooClose = str60;
        this.keepSteady = str61;
        this.tooClose = str62;
        this.noPassportDetected = str63;
        this.idealFace = str64;
        this.faceTooClose = str65;
        this.movePhoneFrontLowEndDevice = str66;
        this.faceMustBeVisible = str67;
        this.currentDocument = str68;
        this.documentNumber = str69;
        this.documentUploadCounter = str70;
        this.numOfDocuments = str71;
        this.document = str72;
        this.submitButton = str73;
        this.retryButton = str74;
        this.uploading = str75;
        this.success = str76;
        this.additionalInstructions = str77;
        this.documentCollectionTitle = str78;
        this.documentPreviewTitle = str79;
        this.transitionHeaderText = str80;
        this.transitionInstructionsPrimaryText = str81;
        this.transitionInstructionsSecondaryText = str82;
        this.glareError = str83;
        this.blurErrorSecondary = str84;
        this.error = errorLabelsExtended;
        this.mobile = mobileLabels;
        this.haveDocReady = str85;
        this.documentCameraPermission = str86;
        this.noCardDetected = str87;
        this.instructionsPrimaryText = str88;
        this.instructionsSecondaryText = str89;
        this.continueButton = str90;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ Labels(String str, Long l, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, NativeMessages nativeMessages, HelpMessages helpMessages, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, PreviewMessages previewMessages, SubmitButtonMessages submitButtonMessages, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, String str64, String str65, String str66, String str67, String str68, String str69, String str70, String str71, String str72, String str73, String str74, String str75, String str76, String str77, String str78, String str79, String str80, String str81, String str82, String str83, String str84, ErrorLabelsExtended errorLabelsExtended, MobileLabels mobileLabels, String str85, String str86, String str87, String str88, String str89, String str90, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r80, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r81, r3, r17, r19, r21, r23, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r82, r38, r39, r40, r41, r42, r43, r44, r83, r84, r85, r86, r87, r88, r89, r90, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r1, r61, r62, r63, r64, r65, r66, r67, r91, (i3 & 256) != 0 ? null : str68, (i3 & 512) != 0 ? null : str69, (i3 & 1024) != 0 ? null : str70, (i3 & 2048) != 0 ? null : str71, (i3 & 4096) != 0 ? null : str72, (i3 & 8192) != 0 ? null : str73, (i3 & 16384) != 0 ? null : str74, (i3 & 32768) != 0 ? null : str75, (i3 & 65536) != 0 ? null : str76, (i3 & 131072) != 0 ? null : str77, (i3 & 262144) != 0 ? null : str78, (i3 & 524288) != 0 ? null : str79, (i3 & 1048576) != 0 ? null : str80, (i3 & 2097152) != 0 ? null : str81, (i3 & 4194304) != 0 ? null : str82, (i3 & 8388608) != 0 ? null : str83, (i3 & 16777216) != 0 ? null : str84, (i3 & 33554432) != 0 ? null : errorLabelsExtended, (i3 & 67108864) != 0 ? null : mobileLabels, (i3 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str85, (i3 & 268435456) != 0 ? null : str86, (i3 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str87, (i3 & 1073741824) != 0 ? null : str88, (i3 & Integer.MIN_VALUE) != 0 ? null : str89, (i4 & 1) != 0 ? null : str90);
        String str91 = (i & 1) != 0 ? null : str;
        Long l2 = (i & 2) != 0 ? null : l;
        String str92 = (i & 4) != 0 ? null : str2;
        String str93 = (i & 8) != 0 ? null : str3;
        String str94 = (i & 16) != 0 ? null : str4;
        String str95 = (i & 32) != 0 ? null : str5;
        String str96 = (i & 64) != 0 ? null : str6;
        String str97 = (i & 128) != 0 ? null : str7;
        String str98 = (i & 256) != 0 ? null : str8;
        String str99 = (i & 512) != 0 ? null : str9;
        String str100 = (i & 1024) != 0 ? null : str10;
        String str101 = (i & 2048) != 0 ? null : str11;
        NativeMessages nativeMessages2 = (i & 4096) != 0 ? null : nativeMessages;
        String str102 = str91;
        HelpMessages helpMessages2 = (i & 8192) != 0 ? null : helpMessages;
        String str103 = (i & 16384) != 0 ? null : str12;
        String str104 = (i & 32768) != 0 ? null : str13;
        String str105 = (i & 65536) != 0 ? null : str14;
        String str106 = (i & 131072) != 0 ? null : str15;
        String str107 = (i & 262144) != 0 ? null : str16;
        String str108 = (i & 524288) != 0 ? null : str17;
        String str109 = (i & 1048576) != 0 ? null : str18;
        String str110 = (i & 2097152) != 0 ? null : str19;
        String str111 = (i & 4194304) != 0 ? null : str20;
        String str112 = (i & 8388608) != 0 ? null : str21;
        String str113 = (i & 16777216) != 0 ? null : str22;
        String str114 = (i & 33554432) != 0 ? null : str23;
        String str115 = (i & 67108864) != 0 ? null : str24;
        String str116 = (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str25;
        String str117 = (i & 268435456) != 0 ? null : str26;
        String str118 = (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str27;
        String str119 = (i & 1073741824) != 0 ? null : str28;
        PreviewMessages previewMessages2 = (i & Integer.MIN_VALUE) != 0 ? null : previewMessages;
        SubmitButtonMessages submitButtonMessages2 = (i2 & 1) != 0 ? null : submitButtonMessages;
        String str120 = (i2 & 2) != 0 ? null : str29;
        String str121 = (i2 & 4) != 0 ? null : str30;
        String str122 = (i2 & 8) != 0 ? null : str31;
        String str123 = (i2 & 16) != 0 ? null : str32;
        String str124 = (i2 & 32) != 0 ? null : str33;
        String str125 = (i2 & 64) != 0 ? null : str34;
        PreviewMessages previewMessages3 = previewMessages2;
        String str126 = (i2 & 128) != 0 ? null : str35;
        String str127 = (i2 & 256) != 0 ? null : str36;
        String str128 = (i2 & 512) != 0 ? null : str37;
        String str129 = (i2 & 1024) != 0 ? null : str38;
        String str130 = (i2 & 2048) != 0 ? null : str39;
        String str131 = (i2 & 4096) != 0 ? null : str40;
        String str132 = (i2 & 8192) != 0 ? null : str41;
        String str133 = (i2 & 16384) != 0 ? null : str42;
        String str134 = (i2 & 32768) != 0 ? null : str43;
        String str135 = (i2 & 65536) != 0 ? null : str44;
        String str136 = (i2 & 131072) != 0 ? null : str45;
        String str137 = (i2 & 262144) != 0 ? null : str46;
        String str138 = (i2 & 524288) != 0 ? null : str47;
        String str139 = (i2 & 1048576) != 0 ? null : str48;
        String str140 = (i2 & 2097152) != 0 ? null : str49;
        String str141 = (i2 & 4194304) != 0 ? null : str50;
        String str142 = (i2 & 8388608) != 0 ? null : str51;
        String str143 = (i2 & 16777216) != 0 ? null : str52;
        String str144 = (i2 & 33554432) != 0 ? null : str53;
        String str145 = (i2 & 67108864) != 0 ? null : str54;
        String str146 = (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? null : str55;
        String str147 = (i2 & 268435456) != 0 ? null : str56;
        String str148 = (i2 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? null : str57;
        String str149 = (i2 & 1073741824) != 0 ? null : str58;
        String str150 = (i2 & Integer.MIN_VALUE) != 0 ? null : str59;
        String str151 = (i3 & 1) != 0 ? null : str60;
        String str152 = (i3 & 2) != 0 ? null : str61;
        String str153 = (i3 & 4) != 0 ? null : str62;
        String str154 = (i3 & 8) != 0 ? null : str63;
        String str155 = (i3 & 16) != 0 ? null : str64;
        String str156 = (i3 & 32) != 0 ? null : str65;
        String str157 = (i3 & 64) != 0 ? null : str66;
        String str158 = str133;
        String str159 = (i3 & 128) != 0 ? null : str67;
        NativeMessages nativeMessages3 = nativeMessages2;
        Long l3 = l2;
        String str160 = str92;
        String str161 = str93;
        String str162 = str94;
        String str163 = str95;
        String str164 = str96;
        String str165 = str97;
        String str166 = str98;
        String str167 = str99;
        String str168 = str100;
        String str169 = str101;
    }

    public final String getProcessingConsent() {
        return this.processingConsent;
    }

    public final Long getErrorCode() {
        return this.errorCode;
    }

    public final String getDocumentName() {
        return this.documentName;
    }

    public final String getDocumentType() {
        return this.documentType;
    }

    public final String getConfirmationTitle() {
        return this.confirmationTitle;
    }

    public final String getConfirmationText() {
        return this.confirmationText;
    }

    public final String getSubmitButtonText() {
        return this.submitButtonText;
    }

    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    public final String getMoveCloser() {
        return this.moveCloser;
    }

    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    public final NativeMessages getNativeMessages() {
        return this.nativeMessages;
    }

    public final HelpMessages getHelpMessages() {
        return this.helpMessages;
    }

    public final String getCameraLoading() {
        return this.cameraLoading;
    }

    public final String getDarkImageError() {
        return this.darkImageError;
    }

    public final String getMoveAreaError() {
        return this.moveAreaError;
    }

    public final String getManualPrimary() {
        return this.manualPrimary;
    }

    public final String getManualSecondary() {
        return this.manualSecondary;
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

    public final String getDefaultIvsError() {
        return this.defaultIvsError;
    }

    public final PreviewMessages getPreviewMessages() {
        return this.previewMessages;
    }

    public final SubmitButtonMessages getSubmitButtonMessages() {
        return this.submitButtonMessages;
    }

    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    public final String getIdLookingGood() {
        return this.idLookingGood;
    }

    public final String getMoveIdCloser() {
        return this.moveIdCloser;
    }

    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    public final String getKeepIdFlat() {
        return this.keepIdFlat;
    }

    public final String getPositionFront() {
        return this.positionFront;
    }

    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    public final String getKeepPassportFlat() {
        return this.keepPassportFlat;
    }

    public final String getMovePassportCloser() {
        return this.movePassportCloser;
    }

    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    public final String getPassportLookingGood() {
        return this.passportLookingGood;
    }

    public final String getOpenPassportBook() {
        return this.openPassportBook;
    }

    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    public final String getMakeSureBarcode() {
        return this.makeSureBarcode;
    }

    public final String getPositionBack() {
        return this.positionBack;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescriptionText() {
        return this.descriptionText;
    }

    public final String getHeaderText() {
        return this.headerText;
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

    public final String getWarningMessageText() {
        return this.warningMessageText;
    }

    public final String getWarningMessageCloseText() {
        return this.warningMessageCloseText;
    }

    public final String getAgreeButtonText() {
        return this.agreeButtonText;
    }

    public final String getDeclineButtonText() {
        return this.declineButtonText;
    }

    public final String getMovePhoneUp() {
        return this.movePhoneUp;
    }

    public final String getMovePhoneBack() {
        return this.movePhoneBack;
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

    public final String getIdTooClose() {
        return this.idTooClose;
    }

    public final String getKeepSteady() {
        return this.keepSteady;
    }

    public final String getTooClose() {
        return this.tooClose;
    }

    public final String getNoPassportDetected() {
        return this.noPassportDetected;
    }

    public final String getIdealFace() {
        return this.idealFace;
    }

    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    public final String getMovePhoneFrontLowEndDevice() {
        return this.movePhoneFrontLowEndDevice;
    }

    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
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

    public final String getGlareError() {
        return this.glareError;
    }

    public final String getBlurErrorSecondary() {
        return this.blurErrorSecondary;
    }

    public final ErrorLabelsExtended getError() {
        return this.error;
    }

    public final MobileLabels getMobile() {
        return this.mobile;
    }

    public final String getHaveDocReady() {
        return this.haveDocReady;
    }

    public final String getDocumentCameraPermission() {
        return this.documentCameraPermission;
    }

    public final String getNoCardDetected() {
        return this.noCardDetected;
    }

    public final String getInstructionsPrimaryText() {
        return this.instructionsPrimaryText;
    }

    public final String getInstructionsSecondaryText() {
        return this.instructionsSecondaryText;
    }

    public final String getContinueButton() {
        return this.continueButton;
    }
}
