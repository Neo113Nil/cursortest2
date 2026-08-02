package com.socure.docv.capturesdk.common.network.model.stepup;

import androidx.media3.common.C;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewLabels.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0003\bü\u0001\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bû\u0004\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0001\u0010 \u001a\u00020\u0003\u0012\b\b\u0001\u0010!\u001a\u00020\u0003\u0012\b\b\u0001\u0010\"\u001a\u00020\u0003\u0012\b\b\u0001\u0010#\u001a\u00020\u0003\u0012\b\b\u0001\u0010$\u001a\u00020\u0003\u0012\b\b\u0001\u0010%\u001a\u00020\u0003\u0012\b\b\u0001\u0010&\u001a\u00020\u0003\u0012\b\b\u0001\u0010'\u001a\u00020\u0003\u0012\b\b\u0001\u0010(\u001a\u00020\u0003\u0012\b\b\u0001\u0010)\u001a\u00020\u0003\u0012\b\b\u0001\u0010*\u001a\u00020\u0003\u0012\b\b\u0001\u0010+\u001a\u00020\u0003\u0012\b\b\u0001\u0010,\u001a\u00020\u0003\u0012\b\b\u0001\u0010-\u001a\u00020\u0003\u0012\b\b\u0001\u0010.\u001a\u00020\u0003\u0012\b\b\u0001\u0010/\u001a\u00020\u0003\u0012\b\b\u0001\u00100\u001a\u00020\u0003\u0012\b\b\u0001\u00101\u001a\u00020\u0003\u0012\b\b\u0001\u00102\u001a\u00020\u0003\u0012\b\b\u0001\u00103\u001a\u00020\u0003\u0012\b\b\u0001\u00104\u001a\u00020\u0003\u0012\b\b\u0001\u00105\u001a\u00020\u0003\u0012\b\b\u0001\u00106\u001a\u00020\u0003\u0012\b\b\u0001\u00107\u001a\u00020\u0003\u0012\b\b\u0001\u00108\u001a\u00020\u0003\u0012\b\b\u0001\u00109\u001a\u00020\u0003\u0012\b\b\u0001\u0010:\u001a\u00020\u0003\u0012\b\b\u0001\u0010;\u001a\u00020\u0003\u0012\b\b\u0001\u0010<\u001a\u00020\u0003\u0012\b\b\u0001\u0010=\u001a\u00020\u0003\u0012\b\b\u0001\u0010>\u001a\u00020\u0003\u0012\b\b\u0001\u0010?\u001a\u00020\u0003\u0012\b\b\u0001\u0010@\u001a\u00020\u0003\u0012\b\b\u0001\u0010A\u001a\u00020\u0003¢\u0006\u0002\u0010BJ\n\u0010¿\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010×\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Ý\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010Þ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ß\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010à\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010á\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010â\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ã\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ä\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010å\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010æ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ç\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010è\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010é\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ê\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ë\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ì\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010í\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010î\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ï\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ð\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ñ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ò\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ó\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ô\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010õ\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ö\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010÷\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ø\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ù\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ú\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010û\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ü\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010ý\u0001\u001a\u00020\u0003HÆ\u0003J\u0080\u0005\u0010þ\u0001\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u00032\b\b\u0003\u0010\u0019\u001a\u00020\u00032\b\b\u0003\u0010\u001a\u001a\u00020\u00032\b\b\u0003\u0010\u001b\u001a\u00020\u00032\b\b\u0003\u0010\u001c\u001a\u00020\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u00032\b\b\u0003\u0010\u001e\u001a\u00020\u00032\b\b\u0003\u0010\u001f\u001a\u00020\u00032\b\b\u0003\u0010 \u001a\u00020\u00032\b\b\u0003\u0010!\u001a\u00020\u00032\b\b\u0003\u0010\"\u001a\u00020\u00032\b\b\u0003\u0010#\u001a\u00020\u00032\b\b\u0003\u0010$\u001a\u00020\u00032\b\b\u0003\u0010%\u001a\u00020\u00032\b\b\u0003\u0010&\u001a\u00020\u00032\b\b\u0003\u0010'\u001a\u00020\u00032\b\b\u0003\u0010(\u001a\u00020\u00032\b\b\u0003\u0010)\u001a\u00020\u00032\b\b\u0003\u0010*\u001a\u00020\u00032\b\b\u0003\u0010+\u001a\u00020\u00032\b\b\u0003\u0010,\u001a\u00020\u00032\b\b\u0003\u0010-\u001a\u00020\u00032\b\b\u0003\u0010.\u001a\u00020\u00032\b\b\u0003\u0010/\u001a\u00020\u00032\b\b\u0003\u00100\u001a\u00020\u00032\b\b\u0003\u00101\u001a\u00020\u00032\b\b\u0003\u00102\u001a\u00020\u00032\b\b\u0003\u00103\u001a\u00020\u00032\b\b\u0003\u00104\u001a\u00020\u00032\b\b\u0003\u00105\u001a\u00020\u00032\b\b\u0003\u00106\u001a\u00020\u00032\b\b\u0003\u00107\u001a\u00020\u00032\b\b\u0003\u00108\u001a\u00020\u00032\b\b\u0003\u00109\u001a\u00020\u00032\b\b\u0003\u0010:\u001a\u00020\u00032\b\b\u0003\u0010;\u001a\u00020\u00032\b\b\u0003\u0010<\u001a\u00020\u00032\b\b\u0003\u0010=\u001a\u00020\u00032\b\b\u0003\u0010>\u001a\u00020\u00032\b\b\u0003\u0010?\u001a\u00020\u00032\b\b\u0003\u0010@\u001a\u00020\u00032\b\b\u0003\u0010A\u001a\u00020\u0003HÆ\u0001J\u0016\u0010ÿ\u0001\u001a\u00030\u0080\u00022\t\u0010\u0081\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u000b\u0010\u0082\u0002\u001a\u00030\u0083\u0002HÖ\u0001J\n\u0010\u0084\u0002\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010D\"\u0004\bH\u0010FR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010D\"\u0004\bJ\u0010FR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010D\"\u0004\bL\u0010FR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010D\"\u0004\bN\u0010FR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010D\"\u0004\bP\u0010FR\u001a\u00104\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010D\"\u0004\bT\u0010FR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR\u001a\u00103\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010D\"\u0004\bX\u0010FR\u001a\u00101\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010D\"\u0004\bZ\u0010FR\u001a\u00102\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010D\"\u0004\b\\\u0010FR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010D\"\u0004\b^\u0010FR\u001a\u0010A\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010D\"\u0004\b`\u0010FR\u001a\u0010>\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\ba\u0010D\"\u0004\bb\u0010FR\u001a\u0010?\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010D\"\u0004\bd\u0010FR\u001a\u0010@\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010D\"\u0004\bf\u0010FR\u001a\u0010=\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bg\u0010D\"\u0004\bh\u0010FR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010D\"\u0004\bj\u0010FR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010D\"\u0004\bl\u0010FR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u0010D\"\u0004\bn\u0010FR\u001a\u0010<\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u0010D\"\u0004\bp\u0010FR\u001a\u00107\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010D\"\u0004\br\u0010FR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u0010D\"\u0004\bt\u0010FR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010D\"\u0004\bv\u0010FR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010D\"\u0004\bx\u0010FR\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010D\"\u0004\bz\u0010FR\u001a\u0010\u0013\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010D\"\u0004\b|\u0010FR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010D\"\u0004\b~\u0010FR\u001b\u0010\u0015\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010D\"\u0005\b\u0080\u0001\u0010FR\u001c\u0010\u0016\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010D\"\u0005\b\u0082\u0001\u0010FR\u001c\u0010\u0017\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010D\"\u0005\b\u0084\u0001\u0010FR\u001c\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010D\"\u0005\b\u0086\u0001\u0010FR\u001c\u0010:\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010D\"\u0005\b\u0088\u0001\u0010FR\u001c\u0010.\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010D\"\u0005\b\u008a\u0001\u0010FR\u001c\u0010+\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010D\"\u0005\b\u008c\u0001\u0010FR\u001b\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u0019\u0010D\"\u0005\b\u008d\u0001\u0010FR\u001b\u0010\u001a\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u001a\u0010D\"\u0005\b\u008e\u0001\u0010FR\u001b\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u001b\u0010D\"\u0005\b\u008f\u0001\u0010FR\u001b\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u001c\u0010D\"\u0005\b\u0090\u0001\u0010FR\u001c\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010D\"\u0005\b\u0092\u0001\u0010FR\u001c\u0010\u001e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0093\u0001\u0010D\"\u0005\b\u0094\u0001\u0010FR\u001c\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010D\"\u0005\b\u0096\u0001\u0010FR\u001c\u00109\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010D\"\u0005\b\u0098\u0001\u0010FR\u001c\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010D\"\u0005\b\u009a\u0001\u0010FR\u001c\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009b\u0001\u0010D\"\u0005\b\u009c\u0001\u0010FR\u001c\u0010\"\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010D\"\u0005\b\u009e\u0001\u0010FR\u001c\u0010#\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010D\"\u0005\b \u0001\u0010FR\u001c\u0010;\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010D\"\u0005\b¢\u0001\u0010FR\u001c\u0010$\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010D\"\u0005\b¤\u0001\u0010FR\u001c\u0010%\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¥\u0001\u0010D\"\u0005\b¦\u0001\u0010FR\u001c\u0010&\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b§\u0001\u0010D\"\u0005\b¨\u0001\u0010FR\u001c\u00108\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b©\u0001\u0010D\"\u0005\bª\u0001\u0010FR\u001c\u00105\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b«\u0001\u0010D\"\u0005\b¬\u0001\u0010FR\u001c\u00106\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u00ad\u0001\u0010D\"\u0005\b®\u0001\u0010FR\u001c\u0010/\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010D\"\u0005\b°\u0001\u0010FR\u001c\u0010'\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b±\u0001\u0010D\"\u0005\b²\u0001\u0010FR\u001c\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b³\u0001\u0010D\"\u0005\b´\u0001\u0010FR\u001c\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010D\"\u0005\b¶\u0001\u0010FR\u001c\u0010,\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b·\u0001\u0010D\"\u0005\b¸\u0001\u0010FR\u001c\u00100\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¹\u0001\u0010D\"\u0005\bº\u0001\u0010FR\u001c\u0010*\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b»\u0001\u0010D\"\u0005\b¼\u0001\u0010FR\u001c\u0010-\u001a\u00020\u0003X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b½\u0001\u0010D\"\u0005\b¾\u0001\u0010F¨\u0006\u0085\u0002"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "", "adjustLighting", "", "alignFaceBox", "alignFaceFrame", "backCapture", "backSideCaptured", "backToScanning", "captureSuccess", "alignDocumentId", "alignDocumentPassport", "ensureIdFocus", "ensurePassportFocus", "faceMustBeVisible", "flipIdBarcode", "flipYourId", "focusCameraId", "focusCameraPassport", "frontCapture", "frontSideCaptured", "greatNowCapture", "holdDevice", "holdPhoneOverId", "holdPhoneOverPassport", "isAllInfoVisible", "isAllInfoVisibleBarcode", "isAllInfoVisiblePassport", "isYourFaceInFrame", "lookDirectly", "makeSureBarcode", "moveCloser", "movePhoneFront", "openPassport", "passportCapture", "passportCaptured", "placeFlatAndHoldId", "placeFlatAndHoldPassport", "placeIdFlat", "retake", "selfieCapture", "selfieCaptured", "toGetStarted", "invalidImage", "submitImageForValidation", "validatingImage", "imageValidated", "processing", "success", "cameraPermissionMsg", "cameraPermissionTitle", "cameraPermissionButton", "backPressWarningMsg", "previewDocSubmit", "previewSelfieSubmit", "faceTooClose", "pleaseWait", "movePhoneBack", "idTooClose", "passportTooClose", "faceNotParallel", "docSelectSubText", "docIdSubText", "docPassportSubText", "docReady", "docCameraPermission", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdjustLighting", "()Ljava/lang/String;", "setAdjustLighting", "(Ljava/lang/String;)V", "getAlignDocumentId", "setAlignDocumentId", "getAlignDocumentPassport", "setAlignDocumentPassport", "getAlignFaceBox", "setAlignFaceBox", "getAlignFaceFrame", "setAlignFaceFrame", "getBackCapture", "setBackCapture", "getBackPressWarningMsg", "setBackPressWarningMsg", "getBackSideCaptured", "setBackSideCaptured", "getBackToScanning", "setBackToScanning", "getCameraPermissionButton", "setCameraPermissionButton", "getCameraPermissionMsg", "setCameraPermissionMsg", "getCameraPermissionTitle", "setCameraPermissionTitle", "getCaptureSuccess", "setCaptureSuccess", "getDocCameraPermission", "setDocCameraPermission", "getDocIdSubText", "setDocIdSubText", "getDocPassportSubText", "setDocPassportSubText", "getDocReady", "setDocReady", "getDocSelectSubText", "setDocSelectSubText", "getEnsureIdFocus", "setEnsureIdFocus", "getEnsurePassportFocus", "setEnsurePassportFocus", "getFaceMustBeVisible", "setFaceMustBeVisible", "getFaceNotParallel", "setFaceNotParallel", "getFaceTooClose", "setFaceTooClose", "getFlipIdBarcode", "setFlipIdBarcode", "getFlipYourId", "setFlipYourId", "getFocusCameraId", "setFocusCameraId", "getFocusCameraPassport", "setFocusCameraPassport", "getFrontCapture", "setFrontCapture", "getFrontSideCaptured", "setFrontSideCaptured", "getGreatNowCapture", "setGreatNowCapture", "getHoldDevice", "setHoldDevice", "getHoldPhoneOverId", "setHoldPhoneOverId", "getHoldPhoneOverPassport", "setHoldPhoneOverPassport", "getIdTooClose", "setIdTooClose", "getImageValidated", "setImageValidated", "getInvalidImage", "setInvalidImage", "setAllInfoVisible", "setAllInfoVisibleBarcode", "setAllInfoVisiblePassport", "setYourFaceInFrame", "getLookDirectly", "setLookDirectly", "getMakeSureBarcode", "setMakeSureBarcode", "getMoveCloser", "setMoveCloser", "getMovePhoneBack", "setMovePhoneBack", "getMovePhoneFront", "setMovePhoneFront", "getOpenPassport", "setOpenPassport", "getPassportCapture", "setPassportCapture", "getPassportCaptured", "setPassportCaptured", "getPassportTooClose", "setPassportTooClose", "getPlaceFlatAndHoldId", "setPlaceFlatAndHoldId", "getPlaceFlatAndHoldPassport", "setPlaceFlatAndHoldPassport", "getPlaceIdFlat", "setPlaceIdFlat", "getPleaseWait", "setPleaseWait", "getPreviewDocSubmit", "setPreviewDocSubmit", "getPreviewSelfieSubmit", "setPreviewSelfieSubmit", "getProcessing", "setProcessing", "getRetake", "setRetake", "getSelfieCapture", "setSelfieCapture", "getSelfieCaptured", "setSelfieCaptured", "getSubmitImageForValidation", "setSubmitImageForValidation", "getSuccess", "setSuccess", "getToGetStarted", "setToGetStarted", "getValidatingImage", "setValidatingImage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component60", "component61", "component62", "component63", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class NewLabels {
    public static final int $stable = 8;
    private String adjustLighting;
    private String alignDocumentId;
    private String alignDocumentPassport;
    private String alignFaceBox;
    private String alignFaceFrame;
    private String backCapture;
    private String backPressWarningMsg;
    private String backSideCaptured;
    private String backToScanning;
    private String cameraPermissionButton;
    private String cameraPermissionMsg;
    private String cameraPermissionTitle;
    private String captureSuccess;
    private String docCameraPermission;
    private String docIdSubText;
    private String docPassportSubText;
    private String docReady;
    private String docSelectSubText;
    private String ensureIdFocus;
    private String ensurePassportFocus;
    private String faceMustBeVisible;
    private String faceNotParallel;
    private String faceTooClose;
    private String flipIdBarcode;
    private String flipYourId;
    private String focusCameraId;
    private String focusCameraPassport;
    private String frontCapture;
    private String frontSideCaptured;
    private String greatNowCapture;
    private String holdDevice;
    private String holdPhoneOverId;
    private String holdPhoneOverPassport;
    private String idTooClose;
    private String imageValidated;
    private String invalidImage;
    private String isAllInfoVisible;
    private String isAllInfoVisibleBarcode;
    private String isAllInfoVisiblePassport;
    private String isYourFaceInFrame;
    private String lookDirectly;
    private String makeSureBarcode;
    private String moveCloser;
    private String movePhoneBack;
    private String movePhoneFront;
    private String openPassport;
    private String passportCapture;
    private String passportCaptured;
    private String passportTooClose;
    private String placeFlatAndHoldId;
    private String placeFlatAndHoldPassport;
    private String placeIdFlat;
    private String pleaseWait;
    private String previewDocSubmit;
    private String previewSelfieSubmit;
    private String processing;
    private String retake;
    private String selfieCapture;
    private String selfieCaptured;
    private String submitImageForValidation;
    private String success;
    private String toGetStarted;
    private String validatingImage;

    public static /* synthetic */ NewLabels copy$default(NewLabels newLabels, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, int i, int i2, Object obj) {
        String str64 = (i & 1) != 0 ? newLabels.adjustLighting : str;
        return newLabels.copy(str64, (i & 2) != 0 ? newLabels.alignFaceBox : str2, (i & 4) != 0 ? newLabels.alignFaceFrame : str3, (i & 8) != 0 ? newLabels.backCapture : str4, (i & 16) != 0 ? newLabels.backSideCaptured : str5, (i & 32) != 0 ? newLabels.backToScanning : str6, (i & 64) != 0 ? newLabels.captureSuccess : str7, (i & 128) != 0 ? newLabels.alignDocumentId : str8, (i & 256) != 0 ? newLabels.alignDocumentPassport : str9, (i & 512) != 0 ? newLabels.ensureIdFocus : str10, (i & 1024) != 0 ? newLabels.ensurePassportFocus : str11, (i & 2048) != 0 ? newLabels.faceMustBeVisible : str12, (i & 4096) != 0 ? newLabels.flipIdBarcode : str13, (i & 8192) != 0 ? newLabels.flipYourId : str14, (i & 16384) != 0 ? newLabels.focusCameraId : str15, (i & 32768) != 0 ? newLabels.focusCameraPassport : str16, (i & 65536) != 0 ? newLabels.frontCapture : str17, (i & 131072) != 0 ? newLabels.frontSideCaptured : str18, (i & 262144) != 0 ? newLabels.greatNowCapture : str19, (i & 524288) != 0 ? newLabels.holdDevice : str20, (i & 1048576) != 0 ? newLabels.holdPhoneOverId : str21, (i & 2097152) != 0 ? newLabels.holdPhoneOverPassport : str22, (i & 4194304) != 0 ? newLabels.isAllInfoVisible : str23, (i & 8388608) != 0 ? newLabels.isAllInfoVisibleBarcode : str24, (i & 16777216) != 0 ? newLabels.isAllInfoVisiblePassport : str25, (i & 33554432) != 0 ? newLabels.isYourFaceInFrame : str26, (i & 67108864) != 0 ? newLabels.lookDirectly : str27, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? newLabels.makeSureBarcode : str28, (i & 268435456) != 0 ? newLabels.moveCloser : str29, (i & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? newLabels.movePhoneFront : str30, (i & 1073741824) != 0 ? newLabels.openPassport : str31, (i & Integer.MIN_VALUE) != 0 ? newLabels.passportCapture : str32, (i2 & 1) != 0 ? newLabels.passportCaptured : str33, (i2 & 2) != 0 ? newLabels.placeFlatAndHoldId : str34, (i2 & 4) != 0 ? newLabels.placeFlatAndHoldPassport : str35, (i2 & 8) != 0 ? newLabels.placeIdFlat : str36, (i2 & 16) != 0 ? newLabels.retake : str37, (i2 & 32) != 0 ? newLabels.selfieCapture : str38, (i2 & 64) != 0 ? newLabels.selfieCaptured : str39, (i2 & 128) != 0 ? newLabels.toGetStarted : str40, (i2 & 256) != 0 ? newLabels.invalidImage : str41, (i2 & 512) != 0 ? newLabels.submitImageForValidation : str42, (i2 & 1024) != 0 ? newLabels.validatingImage : str43, (i2 & 2048) != 0 ? newLabels.imageValidated : str44, (i2 & 4096) != 0 ? newLabels.processing : str45, (i2 & 8192) != 0 ? newLabels.success : str46, (i2 & 16384) != 0 ? newLabels.cameraPermissionMsg : str47, (i2 & 32768) != 0 ? newLabels.cameraPermissionTitle : str48, (i2 & 65536) != 0 ? newLabels.cameraPermissionButton : str49, (i2 & 131072) != 0 ? newLabels.backPressWarningMsg : str50, (i2 & 262144) != 0 ? newLabels.previewDocSubmit : str51, (i2 & 524288) != 0 ? newLabels.previewSelfieSubmit : str52, (i2 & 1048576) != 0 ? newLabels.faceTooClose : str53, (i2 & 2097152) != 0 ? newLabels.pleaseWait : str54, (i2 & 4194304) != 0 ? newLabels.movePhoneBack : str55, (i2 & 8388608) != 0 ? newLabels.idTooClose : str56, (i2 & 16777216) != 0 ? newLabels.passportTooClose : str57, (i2 & 33554432) != 0 ? newLabels.faceNotParallel : str58, (i2 & 67108864) != 0 ? newLabels.docSelectSubText : str59, (i2 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? newLabels.docIdSubText : str60, (i2 & 268435456) != 0 ? newLabels.docPassportSubText : str61, (i2 & C.BUFFER_FLAG_LAST_SAMPLE) != 0 ? newLabels.docReady : str62, (i2 & 1073741824) != 0 ? newLabels.docCameraPermission : str63);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    /* renamed from: component10, reason: from getter */
    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    /* renamed from: component11, reason: from getter */
    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    /* renamed from: component12, reason: from getter */
    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    /* renamed from: component13, reason: from getter */
    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    /* renamed from: component14, reason: from getter */
    public final String getFlipYourId() {
        return this.flipYourId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    /* renamed from: component17, reason: from getter */
    public final String getFrontCapture() {
        return this.frontCapture;
    }

    /* renamed from: component18, reason: from getter */
    public final String getFrontSideCaptured() {
        return this.frontSideCaptured;
    }

    /* renamed from: component19, reason: from getter */
    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    /* renamed from: component20, reason: from getter */
    public final String getHoldDevice() {
        return this.holdDevice;
    }

    /* renamed from: component21, reason: from getter */
    public final String getHoldPhoneOverId() {
        return this.holdPhoneOverId;
    }

    /* renamed from: component22, reason: from getter */
    public final String getHoldPhoneOverPassport() {
        return this.holdPhoneOverPassport;
    }

    /* renamed from: component23, reason: from getter */
    public final String getIsAllInfoVisible() {
        return this.isAllInfoVisible;
    }

    /* renamed from: component24, reason: from getter */
    public final String getIsAllInfoVisibleBarcode() {
        return this.isAllInfoVisibleBarcode;
    }

    /* renamed from: component25, reason: from getter */
    public final String getIsAllInfoVisiblePassport() {
        return this.isAllInfoVisiblePassport;
    }

    /* renamed from: component26, reason: from getter */
    public final String getIsYourFaceInFrame() {
        return this.isYourFaceInFrame;
    }

    /* renamed from: component27, reason: from getter */
    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    /* renamed from: component28, reason: from getter */
    public final String getMakeSureBarcode() {
        return this.makeSureBarcode;
    }

    /* renamed from: component29, reason: from getter */
    public final String getMoveCloser() {
        return this.moveCloser;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    /* renamed from: component30, reason: from getter */
    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    /* renamed from: component31, reason: from getter */
    public final String getOpenPassport() {
        return this.openPassport;
    }

    /* renamed from: component32, reason: from getter */
    public final String getPassportCapture() {
        return this.passportCapture;
    }

    /* renamed from: component33, reason: from getter */
    public final String getPassportCaptured() {
        return this.passportCaptured;
    }

    /* renamed from: component34, reason: from getter */
    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    /* renamed from: component35, reason: from getter */
    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    /* renamed from: component36, reason: from getter */
    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    /* renamed from: component37, reason: from getter */
    public final String getRetake() {
        return this.retake;
    }

    /* renamed from: component38, reason: from getter */
    public final String getSelfieCapture() {
        return this.selfieCapture;
    }

    /* renamed from: component39, reason: from getter */
    public final String getSelfieCaptured() {
        return this.selfieCaptured;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackCapture() {
        return this.backCapture;
    }

    /* renamed from: component40, reason: from getter */
    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    /* renamed from: component41, reason: from getter */
    public final String getInvalidImage() {
        return this.invalidImage;
    }

    /* renamed from: component42, reason: from getter */
    public final String getSubmitImageForValidation() {
        return this.submitImageForValidation;
    }

    /* renamed from: component43, reason: from getter */
    public final String getValidatingImage() {
        return this.validatingImage;
    }

    /* renamed from: component44, reason: from getter */
    public final String getImageValidated() {
        return this.imageValidated;
    }

    /* renamed from: component45, reason: from getter */
    public final String getProcessing() {
        return this.processing;
    }

    /* renamed from: component46, reason: from getter */
    public final String getSuccess() {
        return this.success;
    }

    /* renamed from: component47, reason: from getter */
    public final String getCameraPermissionMsg() {
        return this.cameraPermissionMsg;
    }

    /* renamed from: component48, reason: from getter */
    public final String getCameraPermissionTitle() {
        return this.cameraPermissionTitle;
    }

    /* renamed from: component49, reason: from getter */
    public final String getCameraPermissionButton() {
        return this.cameraPermissionButton;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackSideCaptured() {
        return this.backSideCaptured;
    }

    /* renamed from: component50, reason: from getter */
    public final String getBackPressWarningMsg() {
        return this.backPressWarningMsg;
    }

    /* renamed from: component51, reason: from getter */
    public final String getPreviewDocSubmit() {
        return this.previewDocSubmit;
    }

    /* renamed from: component52, reason: from getter */
    public final String getPreviewSelfieSubmit() {
        return this.previewSelfieSubmit;
    }

    /* renamed from: component53, reason: from getter */
    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    /* renamed from: component54, reason: from getter */
    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    /* renamed from: component55, reason: from getter */
    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    /* renamed from: component56, reason: from getter */
    public final String getIdTooClose() {
        return this.idTooClose;
    }

    /* renamed from: component57, reason: from getter */
    public final String getPassportTooClose() {
        return this.passportTooClose;
    }

    /* renamed from: component58, reason: from getter */
    public final String getFaceNotParallel() {
        return this.faceNotParallel;
    }

    /* renamed from: component59, reason: from getter */
    public final String getDocSelectSubText() {
        return this.docSelectSubText;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackToScanning() {
        return this.backToScanning;
    }

    /* renamed from: component60, reason: from getter */
    public final String getDocIdSubText() {
        return this.docIdSubText;
    }

    /* renamed from: component61, reason: from getter */
    public final String getDocPassportSubText() {
        return this.docPassportSubText;
    }

    /* renamed from: component62, reason: from getter */
    public final String getDocReady() {
        return this.docReady;
    }

    /* renamed from: component63, reason: from getter */
    public final String getDocCameraPermission() {
        return this.docCameraPermission;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAlignDocumentId() {
        return this.alignDocumentId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAlignDocumentPassport() {
        return this.alignDocumentPassport;
    }

    public final NewLabels copy(@Json(name = "adjustLighting") String adjustLighting, @Json(name = "alignFaceBox") String alignFaceBox, @Json(name = "alignFaceFrame") String alignFaceFrame, @Json(name = "backCapture") String backCapture, @Json(name = "backSideCaptured") String backSideCaptured, @Json(name = "backToScanning") String backToScanning, @Json(name = "captureSuccess") String captureSuccess, @Json(name = "alignDocumentId") String alignDocumentId, @Json(name = "alignDocumentPassport") String alignDocumentPassport, @Json(name = "ensureIdFocus") String ensureIdFocus, @Json(name = "ensurePassportFocus") String ensurePassportFocus, @Json(name = "faceMustBeVisible") String faceMustBeVisible, @Json(name = "flipIdBarcode") String flipIdBarcode, @Json(name = "flipYourId") String flipYourId, @Json(name = "focusCameraId") String focusCameraId, @Json(name = "focusCameraPassport") String focusCameraPassport, @Json(name = "frontCapture") String frontCapture, @Json(name = "frontSideCaptured") String frontSideCaptured, @Json(name = "greatNowCapture") String greatNowCapture, @Json(name = "holdDevice") String holdDevice, @Json(name = "holdPhoneOverId") String holdPhoneOverId, @Json(name = "holdPhoneOverPassport") String holdPhoneOverPassport, @Json(name = "isAllInfoVisible") String isAllInfoVisible, @Json(name = "isAllInfoVisibleBarcode") String isAllInfoVisibleBarcode, @Json(name = "isAllInfoVisiblePassport") String isAllInfoVisiblePassport, @Json(name = "isYourFaceInFrame") String isYourFaceInFrame, @Json(name = "lookDirectly") String lookDirectly, @Json(name = "makeSureBarcode") String makeSureBarcode, @Json(name = "moveCloser") String moveCloser, @Json(name = "movePhoneFront") String movePhoneFront, @Json(name = "openPassport") String openPassport, @Json(name = "passportCapture") String passportCapture, @Json(name = "passportCaptured") String passportCaptured, @Json(name = "placeFlatAndHoldId") String placeFlatAndHoldId, @Json(name = "placeFlatAndHoldPassport") String placeFlatAndHoldPassport, @Json(name = "placeIdFlat") String placeIdFlat, @Json(name = "retake") String retake, @Json(name = "selfieCapture") String selfieCapture, @Json(name = "selfieCaptured") String selfieCaptured, @Json(name = "toGetStarted") String toGetStarted, @Json(name = "invalidImage") String invalidImage, @Json(name = "submitImageForValidation") String submitImageForValidation, @Json(name = "validatingImage") String validatingImage, @Json(name = "imageValidated") String imageValidated, @Json(name = "processing") String processing, @Json(name = "success") String success, @Json(name = "cameraPermissionMsg") String cameraPermissionMsg, @Json(name = "cameraPermissionTitle") String cameraPermissionTitle, @Json(name = "cameraPermissionButton") String cameraPermissionButton, @Json(name = "backPressWarningMsg") String backPressWarningMsg, @Json(name = "previewDocSubmit") String previewDocSubmit, @Json(name = "previewSelfieSubmit") String previewSelfieSubmit, @Json(name = "faceTooClose") String faceTooClose, @Json(name = "pleaseWait") String pleaseWait, @Json(name = "movePhoneBack") String movePhoneBack, @Json(name = "idTooClose") String idTooClose, @Json(name = "passportTooClose") String passportTooClose, @Json(name = "faceNotParallel") String faceNotParallel, @Json(name = "docSelectSubText") String docSelectSubText, @Json(name = "docIdSubText") String docIdSubText, @Json(name = "docPassportSubText") String docPassportSubText, @Json(name = "docReady") String docReady, @Json(name = "docCameraPermission") String docCameraPermission) {
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(alignFaceBox, "alignFaceBox");
        Intrinsics.checkNotNullParameter(alignFaceFrame, "alignFaceFrame");
        Intrinsics.checkNotNullParameter(backCapture, "backCapture");
        Intrinsics.checkNotNullParameter(backSideCaptured, "backSideCaptured");
        Intrinsics.checkNotNullParameter(backToScanning, "backToScanning");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(alignDocumentId, "alignDocumentId");
        Intrinsics.checkNotNullParameter(alignDocumentPassport, "alignDocumentPassport");
        Intrinsics.checkNotNullParameter(ensureIdFocus, "ensureIdFocus");
        Intrinsics.checkNotNullParameter(ensurePassportFocus, "ensurePassportFocus");
        Intrinsics.checkNotNullParameter(faceMustBeVisible, "faceMustBeVisible");
        Intrinsics.checkNotNullParameter(flipIdBarcode, "flipIdBarcode");
        Intrinsics.checkNotNullParameter(flipYourId, "flipYourId");
        Intrinsics.checkNotNullParameter(focusCameraId, "focusCameraId");
        Intrinsics.checkNotNullParameter(focusCameraPassport, "focusCameraPassport");
        Intrinsics.checkNotNullParameter(frontCapture, "frontCapture");
        Intrinsics.checkNotNullParameter(frontSideCaptured, "frontSideCaptured");
        Intrinsics.checkNotNullParameter(greatNowCapture, "greatNowCapture");
        Intrinsics.checkNotNullParameter(holdDevice, "holdDevice");
        Intrinsics.checkNotNullParameter(holdPhoneOverId, "holdPhoneOverId");
        Intrinsics.checkNotNullParameter(holdPhoneOverPassport, "holdPhoneOverPassport");
        Intrinsics.checkNotNullParameter(isAllInfoVisible, "isAllInfoVisible");
        Intrinsics.checkNotNullParameter(isAllInfoVisibleBarcode, "isAllInfoVisibleBarcode");
        Intrinsics.checkNotNullParameter(isAllInfoVisiblePassport, "isAllInfoVisiblePassport");
        Intrinsics.checkNotNullParameter(isYourFaceInFrame, "isYourFaceInFrame");
        Intrinsics.checkNotNullParameter(lookDirectly, "lookDirectly");
        Intrinsics.checkNotNullParameter(makeSureBarcode, "makeSureBarcode");
        Intrinsics.checkNotNullParameter(moveCloser, "moveCloser");
        Intrinsics.checkNotNullParameter(movePhoneFront, "movePhoneFront");
        Intrinsics.checkNotNullParameter(openPassport, "openPassport");
        Intrinsics.checkNotNullParameter(passportCapture, "passportCapture");
        Intrinsics.checkNotNullParameter(passportCaptured, "passportCaptured");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldId, "placeFlatAndHoldId");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldPassport, "placeFlatAndHoldPassport");
        Intrinsics.checkNotNullParameter(placeIdFlat, "placeIdFlat");
        Intrinsics.checkNotNullParameter(retake, "retake");
        Intrinsics.checkNotNullParameter(selfieCapture, "selfieCapture");
        Intrinsics.checkNotNullParameter(selfieCaptured, "selfieCaptured");
        Intrinsics.checkNotNullParameter(toGetStarted, "toGetStarted");
        Intrinsics.checkNotNullParameter(invalidImage, "invalidImage");
        Intrinsics.checkNotNullParameter(submitImageForValidation, "submitImageForValidation");
        Intrinsics.checkNotNullParameter(validatingImage, "validatingImage");
        Intrinsics.checkNotNullParameter(imageValidated, "imageValidated");
        Intrinsics.checkNotNullParameter(processing, "processing");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(cameraPermissionMsg, "cameraPermissionMsg");
        Intrinsics.checkNotNullParameter(cameraPermissionTitle, "cameraPermissionTitle");
        Intrinsics.checkNotNullParameter(cameraPermissionButton, "cameraPermissionButton");
        Intrinsics.checkNotNullParameter(backPressWarningMsg, "backPressWarningMsg");
        Intrinsics.checkNotNullParameter(previewDocSubmit, "previewDocSubmit");
        Intrinsics.checkNotNullParameter(previewSelfieSubmit, "previewSelfieSubmit");
        Intrinsics.checkNotNullParameter(faceTooClose, "faceTooClose");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(idTooClose, "idTooClose");
        Intrinsics.checkNotNullParameter(passportTooClose, "passportTooClose");
        Intrinsics.checkNotNullParameter(faceNotParallel, "faceNotParallel");
        Intrinsics.checkNotNullParameter(docSelectSubText, "docSelectSubText");
        Intrinsics.checkNotNullParameter(docIdSubText, "docIdSubText");
        Intrinsics.checkNotNullParameter(docPassportSubText, "docPassportSubText");
        Intrinsics.checkNotNullParameter(docReady, "docReady");
        Intrinsics.checkNotNullParameter(docCameraPermission, "docCameraPermission");
        return new NewLabels(adjustLighting, alignFaceBox, alignFaceFrame, backCapture, backSideCaptured, backToScanning, captureSuccess, alignDocumentId, alignDocumentPassport, ensureIdFocus, ensurePassportFocus, faceMustBeVisible, flipIdBarcode, flipYourId, focusCameraId, focusCameraPassport, frontCapture, frontSideCaptured, greatNowCapture, holdDevice, holdPhoneOverId, holdPhoneOverPassport, isAllInfoVisible, isAllInfoVisibleBarcode, isAllInfoVisiblePassport, isYourFaceInFrame, lookDirectly, makeSureBarcode, moveCloser, movePhoneFront, openPassport, passportCapture, passportCaptured, placeFlatAndHoldId, placeFlatAndHoldPassport, placeIdFlat, retake, selfieCapture, selfieCaptured, toGetStarted, invalidImage, submitImageForValidation, validatingImage, imageValidated, processing, success, cameraPermissionMsg, cameraPermissionTitle, cameraPermissionButton, backPressWarningMsg, previewDocSubmit, previewSelfieSubmit, faceTooClose, pleaseWait, movePhoneBack, idTooClose, passportTooClose, faceNotParallel, docSelectSubText, docIdSubText, docPassportSubText, docReady, docCameraPermission);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewLabels)) {
            return false;
        }
        NewLabels newLabels = (NewLabels) other;
        return Intrinsics.areEqual(this.adjustLighting, newLabels.adjustLighting) && Intrinsics.areEqual(this.alignFaceBox, newLabels.alignFaceBox) && Intrinsics.areEqual(this.alignFaceFrame, newLabels.alignFaceFrame) && Intrinsics.areEqual(this.backCapture, newLabels.backCapture) && Intrinsics.areEqual(this.backSideCaptured, newLabels.backSideCaptured) && Intrinsics.areEqual(this.backToScanning, newLabels.backToScanning) && Intrinsics.areEqual(this.captureSuccess, newLabels.captureSuccess) && Intrinsics.areEqual(this.alignDocumentId, newLabels.alignDocumentId) && Intrinsics.areEqual(this.alignDocumentPassport, newLabels.alignDocumentPassport) && Intrinsics.areEqual(this.ensureIdFocus, newLabels.ensureIdFocus) && Intrinsics.areEqual(this.ensurePassportFocus, newLabels.ensurePassportFocus) && Intrinsics.areEqual(this.faceMustBeVisible, newLabels.faceMustBeVisible) && Intrinsics.areEqual(this.flipIdBarcode, newLabels.flipIdBarcode) && Intrinsics.areEqual(this.flipYourId, newLabels.flipYourId) && Intrinsics.areEqual(this.focusCameraId, newLabels.focusCameraId) && Intrinsics.areEqual(this.focusCameraPassport, newLabels.focusCameraPassport) && Intrinsics.areEqual(this.frontCapture, newLabels.frontCapture) && Intrinsics.areEqual(this.frontSideCaptured, newLabels.frontSideCaptured) && Intrinsics.areEqual(this.greatNowCapture, newLabels.greatNowCapture) && Intrinsics.areEqual(this.holdDevice, newLabels.holdDevice) && Intrinsics.areEqual(this.holdPhoneOverId, newLabels.holdPhoneOverId) && Intrinsics.areEqual(this.holdPhoneOverPassport, newLabels.holdPhoneOverPassport) && Intrinsics.areEqual(this.isAllInfoVisible, newLabels.isAllInfoVisible) && Intrinsics.areEqual(this.isAllInfoVisibleBarcode, newLabels.isAllInfoVisibleBarcode) && Intrinsics.areEqual(this.isAllInfoVisiblePassport, newLabels.isAllInfoVisiblePassport) && Intrinsics.areEqual(this.isYourFaceInFrame, newLabels.isYourFaceInFrame) && Intrinsics.areEqual(this.lookDirectly, newLabels.lookDirectly) && Intrinsics.areEqual(this.makeSureBarcode, newLabels.makeSureBarcode) && Intrinsics.areEqual(this.moveCloser, newLabels.moveCloser) && Intrinsics.areEqual(this.movePhoneFront, newLabels.movePhoneFront) && Intrinsics.areEqual(this.openPassport, newLabels.openPassport) && Intrinsics.areEqual(this.passportCapture, newLabels.passportCapture) && Intrinsics.areEqual(this.passportCaptured, newLabels.passportCaptured) && Intrinsics.areEqual(this.placeFlatAndHoldId, newLabels.placeFlatAndHoldId) && Intrinsics.areEqual(this.placeFlatAndHoldPassport, newLabels.placeFlatAndHoldPassport) && Intrinsics.areEqual(this.placeIdFlat, newLabels.placeIdFlat) && Intrinsics.areEqual(this.retake, newLabels.retake) && Intrinsics.areEqual(this.selfieCapture, newLabels.selfieCapture) && Intrinsics.areEqual(this.selfieCaptured, newLabels.selfieCaptured) && Intrinsics.areEqual(this.toGetStarted, newLabels.toGetStarted) && Intrinsics.areEqual(this.invalidImage, newLabels.invalidImage) && Intrinsics.areEqual(this.submitImageForValidation, newLabels.submitImageForValidation) && Intrinsics.areEqual(this.validatingImage, newLabels.validatingImage) && Intrinsics.areEqual(this.imageValidated, newLabels.imageValidated) && Intrinsics.areEqual(this.processing, newLabels.processing) && Intrinsics.areEqual(this.success, newLabels.success) && Intrinsics.areEqual(this.cameraPermissionMsg, newLabels.cameraPermissionMsg) && Intrinsics.areEqual(this.cameraPermissionTitle, newLabels.cameraPermissionTitle) && Intrinsics.areEqual(this.cameraPermissionButton, newLabels.cameraPermissionButton) && Intrinsics.areEqual(this.backPressWarningMsg, newLabels.backPressWarningMsg) && Intrinsics.areEqual(this.previewDocSubmit, newLabels.previewDocSubmit) && Intrinsics.areEqual(this.previewSelfieSubmit, newLabels.previewSelfieSubmit) && Intrinsics.areEqual(this.faceTooClose, newLabels.faceTooClose) && Intrinsics.areEqual(this.pleaseWait, newLabels.pleaseWait) && Intrinsics.areEqual(this.movePhoneBack, newLabels.movePhoneBack) && Intrinsics.areEqual(this.idTooClose, newLabels.idTooClose) && Intrinsics.areEqual(this.passportTooClose, newLabels.passportTooClose) && Intrinsics.areEqual(this.faceNotParallel, newLabels.faceNotParallel) && Intrinsics.areEqual(this.docSelectSubText, newLabels.docSelectSubText) && Intrinsics.areEqual(this.docIdSubText, newLabels.docIdSubText) && Intrinsics.areEqual(this.docPassportSubText, newLabels.docPassportSubText) && Intrinsics.areEqual(this.docReady, newLabels.docReady) && Intrinsics.areEqual(this.docCameraPermission, newLabels.docCameraPermission);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.adjustLighting.hashCode() * 31) + this.alignFaceBox.hashCode()) * 31) + this.alignFaceFrame.hashCode()) * 31) + this.backCapture.hashCode()) * 31) + this.backSideCaptured.hashCode()) * 31) + this.backToScanning.hashCode()) * 31) + this.captureSuccess.hashCode()) * 31) + this.alignDocumentId.hashCode()) * 31) + this.alignDocumentPassport.hashCode()) * 31) + this.ensureIdFocus.hashCode()) * 31) + this.ensurePassportFocus.hashCode()) * 31) + this.faceMustBeVisible.hashCode()) * 31) + this.flipIdBarcode.hashCode()) * 31) + this.flipYourId.hashCode()) * 31) + this.focusCameraId.hashCode()) * 31) + this.focusCameraPassport.hashCode()) * 31) + this.frontCapture.hashCode()) * 31) + this.frontSideCaptured.hashCode()) * 31) + this.greatNowCapture.hashCode()) * 31) + this.holdDevice.hashCode()) * 31) + this.holdPhoneOverId.hashCode()) * 31) + this.holdPhoneOverPassport.hashCode()) * 31) + this.isAllInfoVisible.hashCode()) * 31) + this.isAllInfoVisibleBarcode.hashCode()) * 31) + this.isAllInfoVisiblePassport.hashCode()) * 31) + this.isYourFaceInFrame.hashCode()) * 31) + this.lookDirectly.hashCode()) * 31) + this.makeSureBarcode.hashCode()) * 31) + this.moveCloser.hashCode()) * 31) + this.movePhoneFront.hashCode()) * 31) + this.openPassport.hashCode()) * 31) + this.passportCapture.hashCode()) * 31) + this.passportCaptured.hashCode()) * 31) + this.placeFlatAndHoldId.hashCode()) * 31) + this.placeFlatAndHoldPassport.hashCode()) * 31) + this.placeIdFlat.hashCode()) * 31) + this.retake.hashCode()) * 31) + this.selfieCapture.hashCode()) * 31) + this.selfieCaptured.hashCode()) * 31) + this.toGetStarted.hashCode()) * 31) + this.invalidImage.hashCode()) * 31) + this.submitImageForValidation.hashCode()) * 31) + this.validatingImage.hashCode()) * 31) + this.imageValidated.hashCode()) * 31) + this.processing.hashCode()) * 31) + this.success.hashCode()) * 31) + this.cameraPermissionMsg.hashCode()) * 31) + this.cameraPermissionTitle.hashCode()) * 31) + this.cameraPermissionButton.hashCode()) * 31) + this.backPressWarningMsg.hashCode()) * 31) + this.previewDocSubmit.hashCode()) * 31) + this.previewSelfieSubmit.hashCode()) * 31) + this.faceTooClose.hashCode()) * 31) + this.pleaseWait.hashCode()) * 31) + this.movePhoneBack.hashCode()) * 31) + this.idTooClose.hashCode()) * 31) + this.passportTooClose.hashCode()) * 31) + this.faceNotParallel.hashCode()) * 31) + this.docSelectSubText.hashCode()) * 31) + this.docIdSubText.hashCode()) * 31) + this.docPassportSubText.hashCode()) * 31) + this.docReady.hashCode()) * 31) + this.docCameraPermission.hashCode();
    }

    public String toString() {
        return "NewLabels(adjustLighting=" + this.adjustLighting + ", alignFaceBox=" + this.alignFaceBox + ", alignFaceFrame=" + this.alignFaceFrame + ", backCapture=" + this.backCapture + ", backSideCaptured=" + this.backSideCaptured + ", backToScanning=" + this.backToScanning + ", captureSuccess=" + this.captureSuccess + ", alignDocumentId=" + this.alignDocumentId + ", alignDocumentPassport=" + this.alignDocumentPassport + ", ensureIdFocus=" + this.ensureIdFocus + ", ensurePassportFocus=" + this.ensurePassportFocus + ", faceMustBeVisible=" + this.faceMustBeVisible + ", flipIdBarcode=" + this.flipIdBarcode + ", flipYourId=" + this.flipYourId + ", focusCameraId=" + this.focusCameraId + ", focusCameraPassport=" + this.focusCameraPassport + ", frontCapture=" + this.frontCapture + ", frontSideCaptured=" + this.frontSideCaptured + ", greatNowCapture=" + this.greatNowCapture + ", holdDevice=" + this.holdDevice + ", holdPhoneOverId=" + this.holdPhoneOverId + ", holdPhoneOverPassport=" + this.holdPhoneOverPassport + ", isAllInfoVisible=" + this.isAllInfoVisible + ", isAllInfoVisibleBarcode=" + this.isAllInfoVisibleBarcode + ", isAllInfoVisiblePassport=" + this.isAllInfoVisiblePassport + ", isYourFaceInFrame=" + this.isYourFaceInFrame + ", lookDirectly=" + this.lookDirectly + ", makeSureBarcode=" + this.makeSureBarcode + ", moveCloser=" + this.moveCloser + ", movePhoneFront=" + this.movePhoneFront + ", openPassport=" + this.openPassport + ", passportCapture=" + this.passportCapture + ", passportCaptured=" + this.passportCaptured + ", placeFlatAndHoldId=" + this.placeFlatAndHoldId + ", placeFlatAndHoldPassport=" + this.placeFlatAndHoldPassport + ", placeIdFlat=" + this.placeIdFlat + ", retake=" + this.retake + ", selfieCapture=" + this.selfieCapture + ", selfieCaptured=" + this.selfieCaptured + ", toGetStarted=" + this.toGetStarted + ", invalidImage=" + this.invalidImage + ", submitImageForValidation=" + this.submitImageForValidation + ", validatingImage=" + this.validatingImage + ", imageValidated=" + this.imageValidated + ", processing=" + this.processing + ", success=" + this.success + ", cameraPermissionMsg=" + this.cameraPermissionMsg + ", cameraPermissionTitle=" + this.cameraPermissionTitle + ", cameraPermissionButton=" + this.cameraPermissionButton + ", backPressWarningMsg=" + this.backPressWarningMsg + ", previewDocSubmit=" + this.previewDocSubmit + ", previewSelfieSubmit=" + this.previewSelfieSubmit + ", faceTooClose=" + this.faceTooClose + ", pleaseWait=" + this.pleaseWait + ", movePhoneBack=" + this.movePhoneBack + ", idTooClose=" + this.idTooClose + ", passportTooClose=" + this.passportTooClose + ", faceNotParallel=" + this.faceNotParallel + ", docSelectSubText=" + this.docSelectSubText + ", docIdSubText=" + this.docIdSubText + ", docPassportSubText=" + this.docPassportSubText + ", docReady=" + this.docReady + ", docCameraPermission=" + this.docCameraPermission + ")";
    }

    public NewLabels(@Json(name = "adjustLighting") String adjustLighting, @Json(name = "alignFaceBox") String alignFaceBox, @Json(name = "alignFaceFrame") String alignFaceFrame, @Json(name = "backCapture") String backCapture, @Json(name = "backSideCaptured") String backSideCaptured, @Json(name = "backToScanning") String backToScanning, @Json(name = "captureSuccess") String captureSuccess, @Json(name = "alignDocumentId") String alignDocumentId, @Json(name = "alignDocumentPassport") String alignDocumentPassport, @Json(name = "ensureIdFocus") String ensureIdFocus, @Json(name = "ensurePassportFocus") String ensurePassportFocus, @Json(name = "faceMustBeVisible") String faceMustBeVisible, @Json(name = "flipIdBarcode") String flipIdBarcode, @Json(name = "flipYourId") String flipYourId, @Json(name = "focusCameraId") String focusCameraId, @Json(name = "focusCameraPassport") String focusCameraPassport, @Json(name = "frontCapture") String frontCapture, @Json(name = "frontSideCaptured") String frontSideCaptured, @Json(name = "greatNowCapture") String greatNowCapture, @Json(name = "holdDevice") String holdDevice, @Json(name = "holdPhoneOverId") String holdPhoneOverId, @Json(name = "holdPhoneOverPassport") String holdPhoneOverPassport, @Json(name = "isAllInfoVisible") String isAllInfoVisible, @Json(name = "isAllInfoVisibleBarcode") String isAllInfoVisibleBarcode, @Json(name = "isAllInfoVisiblePassport") String isAllInfoVisiblePassport, @Json(name = "isYourFaceInFrame") String isYourFaceInFrame, @Json(name = "lookDirectly") String lookDirectly, @Json(name = "makeSureBarcode") String makeSureBarcode, @Json(name = "moveCloser") String moveCloser, @Json(name = "movePhoneFront") String movePhoneFront, @Json(name = "openPassport") String openPassport, @Json(name = "passportCapture") String passportCapture, @Json(name = "passportCaptured") String passportCaptured, @Json(name = "placeFlatAndHoldId") String placeFlatAndHoldId, @Json(name = "placeFlatAndHoldPassport") String placeFlatAndHoldPassport, @Json(name = "placeIdFlat") String placeIdFlat, @Json(name = "retake") String retake, @Json(name = "selfieCapture") String selfieCapture, @Json(name = "selfieCaptured") String selfieCaptured, @Json(name = "toGetStarted") String toGetStarted, @Json(name = "invalidImage") String invalidImage, @Json(name = "submitImageForValidation") String submitImageForValidation, @Json(name = "validatingImage") String validatingImage, @Json(name = "imageValidated") String imageValidated, @Json(name = "processing") String processing, @Json(name = "success") String success, @Json(name = "cameraPermissionMsg") String cameraPermissionMsg, @Json(name = "cameraPermissionTitle") String cameraPermissionTitle, @Json(name = "cameraPermissionButton") String cameraPermissionButton, @Json(name = "backPressWarningMsg") String backPressWarningMsg, @Json(name = "previewDocSubmit") String previewDocSubmit, @Json(name = "previewSelfieSubmit") String previewSelfieSubmit, @Json(name = "faceTooClose") String faceTooClose, @Json(name = "pleaseWait") String pleaseWait, @Json(name = "movePhoneBack") String movePhoneBack, @Json(name = "idTooClose") String idTooClose, @Json(name = "passportTooClose") String passportTooClose, @Json(name = "faceNotParallel") String faceNotParallel, @Json(name = "docSelectSubText") String docSelectSubText, @Json(name = "docIdSubText") String docIdSubText, @Json(name = "docPassportSubText") String docPassportSubText, @Json(name = "docReady") String docReady, @Json(name = "docCameraPermission") String docCameraPermission) {
        Intrinsics.checkNotNullParameter(adjustLighting, "adjustLighting");
        Intrinsics.checkNotNullParameter(alignFaceBox, "alignFaceBox");
        Intrinsics.checkNotNullParameter(alignFaceFrame, "alignFaceFrame");
        Intrinsics.checkNotNullParameter(backCapture, "backCapture");
        Intrinsics.checkNotNullParameter(backSideCaptured, "backSideCaptured");
        Intrinsics.checkNotNullParameter(backToScanning, "backToScanning");
        Intrinsics.checkNotNullParameter(captureSuccess, "captureSuccess");
        Intrinsics.checkNotNullParameter(alignDocumentId, "alignDocumentId");
        Intrinsics.checkNotNullParameter(alignDocumentPassport, "alignDocumentPassport");
        Intrinsics.checkNotNullParameter(ensureIdFocus, "ensureIdFocus");
        Intrinsics.checkNotNullParameter(ensurePassportFocus, "ensurePassportFocus");
        Intrinsics.checkNotNullParameter(faceMustBeVisible, "faceMustBeVisible");
        Intrinsics.checkNotNullParameter(flipIdBarcode, "flipIdBarcode");
        Intrinsics.checkNotNullParameter(flipYourId, "flipYourId");
        Intrinsics.checkNotNullParameter(focusCameraId, "focusCameraId");
        Intrinsics.checkNotNullParameter(focusCameraPassport, "focusCameraPassport");
        Intrinsics.checkNotNullParameter(frontCapture, "frontCapture");
        Intrinsics.checkNotNullParameter(frontSideCaptured, "frontSideCaptured");
        Intrinsics.checkNotNullParameter(greatNowCapture, "greatNowCapture");
        Intrinsics.checkNotNullParameter(holdDevice, "holdDevice");
        Intrinsics.checkNotNullParameter(holdPhoneOverId, "holdPhoneOverId");
        Intrinsics.checkNotNullParameter(holdPhoneOverPassport, "holdPhoneOverPassport");
        Intrinsics.checkNotNullParameter(isAllInfoVisible, "isAllInfoVisible");
        Intrinsics.checkNotNullParameter(isAllInfoVisibleBarcode, "isAllInfoVisibleBarcode");
        Intrinsics.checkNotNullParameter(isAllInfoVisiblePassport, "isAllInfoVisiblePassport");
        Intrinsics.checkNotNullParameter(isYourFaceInFrame, "isYourFaceInFrame");
        Intrinsics.checkNotNullParameter(lookDirectly, "lookDirectly");
        Intrinsics.checkNotNullParameter(makeSureBarcode, "makeSureBarcode");
        Intrinsics.checkNotNullParameter(moveCloser, "moveCloser");
        Intrinsics.checkNotNullParameter(movePhoneFront, "movePhoneFront");
        Intrinsics.checkNotNullParameter(openPassport, "openPassport");
        Intrinsics.checkNotNullParameter(passportCapture, "passportCapture");
        Intrinsics.checkNotNullParameter(passportCaptured, "passportCaptured");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldId, "placeFlatAndHoldId");
        Intrinsics.checkNotNullParameter(placeFlatAndHoldPassport, "placeFlatAndHoldPassport");
        Intrinsics.checkNotNullParameter(placeIdFlat, "placeIdFlat");
        Intrinsics.checkNotNullParameter(retake, "retake");
        Intrinsics.checkNotNullParameter(selfieCapture, "selfieCapture");
        Intrinsics.checkNotNullParameter(selfieCaptured, "selfieCaptured");
        Intrinsics.checkNotNullParameter(toGetStarted, "toGetStarted");
        Intrinsics.checkNotNullParameter(invalidImage, "invalidImage");
        Intrinsics.checkNotNullParameter(submitImageForValidation, "submitImageForValidation");
        Intrinsics.checkNotNullParameter(validatingImage, "validatingImage");
        Intrinsics.checkNotNullParameter(imageValidated, "imageValidated");
        Intrinsics.checkNotNullParameter(processing, "processing");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(cameraPermissionMsg, "cameraPermissionMsg");
        Intrinsics.checkNotNullParameter(cameraPermissionTitle, "cameraPermissionTitle");
        Intrinsics.checkNotNullParameter(cameraPermissionButton, "cameraPermissionButton");
        Intrinsics.checkNotNullParameter(backPressWarningMsg, "backPressWarningMsg");
        Intrinsics.checkNotNullParameter(previewDocSubmit, "previewDocSubmit");
        Intrinsics.checkNotNullParameter(previewSelfieSubmit, "previewSelfieSubmit");
        Intrinsics.checkNotNullParameter(faceTooClose, "faceTooClose");
        Intrinsics.checkNotNullParameter(pleaseWait, "pleaseWait");
        Intrinsics.checkNotNullParameter(movePhoneBack, "movePhoneBack");
        Intrinsics.checkNotNullParameter(idTooClose, "idTooClose");
        Intrinsics.checkNotNullParameter(passportTooClose, "passportTooClose");
        Intrinsics.checkNotNullParameter(faceNotParallel, "faceNotParallel");
        Intrinsics.checkNotNullParameter(docSelectSubText, "docSelectSubText");
        Intrinsics.checkNotNullParameter(docIdSubText, "docIdSubText");
        Intrinsics.checkNotNullParameter(docPassportSubText, "docPassportSubText");
        Intrinsics.checkNotNullParameter(docReady, "docReady");
        Intrinsics.checkNotNullParameter(docCameraPermission, "docCameraPermission");
        this.adjustLighting = adjustLighting;
        this.alignFaceBox = alignFaceBox;
        this.alignFaceFrame = alignFaceFrame;
        this.backCapture = backCapture;
        this.backSideCaptured = backSideCaptured;
        this.backToScanning = backToScanning;
        this.captureSuccess = captureSuccess;
        this.alignDocumentId = alignDocumentId;
        this.alignDocumentPassport = alignDocumentPassport;
        this.ensureIdFocus = ensureIdFocus;
        this.ensurePassportFocus = ensurePassportFocus;
        this.faceMustBeVisible = faceMustBeVisible;
        this.flipIdBarcode = flipIdBarcode;
        this.flipYourId = flipYourId;
        this.focusCameraId = focusCameraId;
        this.focusCameraPassport = focusCameraPassport;
        this.frontCapture = frontCapture;
        this.frontSideCaptured = frontSideCaptured;
        this.greatNowCapture = greatNowCapture;
        this.holdDevice = holdDevice;
        this.holdPhoneOverId = holdPhoneOverId;
        this.holdPhoneOverPassport = holdPhoneOverPassport;
        this.isAllInfoVisible = isAllInfoVisible;
        this.isAllInfoVisibleBarcode = isAllInfoVisibleBarcode;
        this.isAllInfoVisiblePassport = isAllInfoVisiblePassport;
        this.isYourFaceInFrame = isYourFaceInFrame;
        this.lookDirectly = lookDirectly;
        this.makeSureBarcode = makeSureBarcode;
        this.moveCloser = moveCloser;
        this.movePhoneFront = movePhoneFront;
        this.openPassport = openPassport;
        this.passportCapture = passportCapture;
        this.passportCaptured = passportCaptured;
        this.placeFlatAndHoldId = placeFlatAndHoldId;
        this.placeFlatAndHoldPassport = placeFlatAndHoldPassport;
        this.placeIdFlat = placeIdFlat;
        this.retake = retake;
        this.selfieCapture = selfieCapture;
        this.selfieCaptured = selfieCaptured;
        this.toGetStarted = toGetStarted;
        this.invalidImage = invalidImage;
        this.submitImageForValidation = submitImageForValidation;
        this.validatingImage = validatingImage;
        this.imageValidated = imageValidated;
        this.processing = processing;
        this.success = success;
        this.cameraPermissionMsg = cameraPermissionMsg;
        this.cameraPermissionTitle = cameraPermissionTitle;
        this.cameraPermissionButton = cameraPermissionButton;
        this.backPressWarningMsg = backPressWarningMsg;
        this.previewDocSubmit = previewDocSubmit;
        this.previewSelfieSubmit = previewSelfieSubmit;
        this.faceTooClose = faceTooClose;
        this.pleaseWait = pleaseWait;
        this.movePhoneBack = movePhoneBack;
        this.idTooClose = idTooClose;
        this.passportTooClose = passportTooClose;
        this.faceNotParallel = faceNotParallel;
        this.docSelectSubText = docSelectSubText;
        this.docIdSubText = docIdSubText;
        this.docPassportSubText = docPassportSubText;
        this.docReady = docReady;
        this.docCameraPermission = docCameraPermission;
    }

    public final String getAdjustLighting() {
        return this.adjustLighting;
    }

    public final void setAdjustLighting(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adjustLighting = str;
    }

    public final String getAlignFaceBox() {
        return this.alignFaceBox;
    }

    public final void setAlignFaceBox(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alignFaceBox = str;
    }

    public final String getAlignFaceFrame() {
        return this.alignFaceFrame;
    }

    public final void setAlignFaceFrame(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alignFaceFrame = str;
    }

    public final String getBackCapture() {
        return this.backCapture;
    }

    public final void setBackCapture(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backCapture = str;
    }

    public final String getBackSideCaptured() {
        return this.backSideCaptured;
    }

    public final void setBackSideCaptured(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backSideCaptured = str;
    }

    public final String getBackToScanning() {
        return this.backToScanning;
    }

    public final void setBackToScanning(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backToScanning = str;
    }

    public final String getCaptureSuccess() {
        return this.captureSuccess;
    }

    public final void setCaptureSuccess(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.captureSuccess = str;
    }

    public final String getAlignDocumentId() {
        return this.alignDocumentId;
    }

    public final void setAlignDocumentId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alignDocumentId = str;
    }

    public final String getAlignDocumentPassport() {
        return this.alignDocumentPassport;
    }

    public final void setAlignDocumentPassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alignDocumentPassport = str;
    }

    public final String getEnsureIdFocus() {
        return this.ensureIdFocus;
    }

    public final void setEnsureIdFocus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ensureIdFocus = str;
    }

    public final String getEnsurePassportFocus() {
        return this.ensurePassportFocus;
    }

    public final void setEnsurePassportFocus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ensurePassportFocus = str;
    }

    public final String getFaceMustBeVisible() {
        return this.faceMustBeVisible;
    }

    public final void setFaceMustBeVisible(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceMustBeVisible = str;
    }

    public final String getFlipIdBarcode() {
        return this.flipIdBarcode;
    }

    public final void setFlipIdBarcode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flipIdBarcode = str;
    }

    public final String getFlipYourId() {
        return this.flipYourId;
    }

    public final void setFlipYourId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flipYourId = str;
    }

    public final String getFocusCameraId() {
        return this.focusCameraId;
    }

    public final void setFocusCameraId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.focusCameraId = str;
    }

    public final String getFocusCameraPassport() {
        return this.focusCameraPassport;
    }

    public final void setFocusCameraPassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.focusCameraPassport = str;
    }

    public final String getFrontCapture() {
        return this.frontCapture;
    }

    public final void setFrontCapture(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.frontCapture = str;
    }

    public final String getFrontSideCaptured() {
        return this.frontSideCaptured;
    }

    public final void setFrontSideCaptured(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.frontSideCaptured = str;
    }

    public final String getGreatNowCapture() {
        return this.greatNowCapture;
    }

    public final void setGreatNowCapture(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.greatNowCapture = str;
    }

    public final String getHoldDevice() {
        return this.holdDevice;
    }

    public final void setHoldDevice(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.holdDevice = str;
    }

    public final String getHoldPhoneOverId() {
        return this.holdPhoneOverId;
    }

    public final void setHoldPhoneOverId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.holdPhoneOverId = str;
    }

    public final String getHoldPhoneOverPassport() {
        return this.holdPhoneOverPassport;
    }

    public final void setHoldPhoneOverPassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.holdPhoneOverPassport = str;
    }

    public final String isAllInfoVisible() {
        return this.isAllInfoVisible;
    }

    public final void setAllInfoVisible(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isAllInfoVisible = str;
    }

    public final String isAllInfoVisibleBarcode() {
        return this.isAllInfoVisibleBarcode;
    }

    public final void setAllInfoVisibleBarcode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isAllInfoVisibleBarcode = str;
    }

    public final String isAllInfoVisiblePassport() {
        return this.isAllInfoVisiblePassport;
    }

    public final void setAllInfoVisiblePassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isAllInfoVisiblePassport = str;
    }

    public final String isYourFaceInFrame() {
        return this.isYourFaceInFrame;
    }

    public final void setYourFaceInFrame(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.isYourFaceInFrame = str;
    }

    public final String getLookDirectly() {
        return this.lookDirectly;
    }

    public final void setLookDirectly(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.lookDirectly = str;
    }

    public final String getMakeSureBarcode() {
        return this.makeSureBarcode;
    }

    public final void setMakeSureBarcode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.makeSureBarcode = str;
    }

    public final String getMoveCloser() {
        return this.moveCloser;
    }

    public final void setMoveCloser(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.moveCloser = str;
    }

    public final String getMovePhoneFront() {
        return this.movePhoneFront;
    }

    public final void setMovePhoneFront(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneFront = str;
    }

    public final String getOpenPassport() {
        return this.openPassport;
    }

    public final void setOpenPassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.openPassport = str;
    }

    public final String getPassportCapture() {
        return this.passportCapture;
    }

    public final void setPassportCapture(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passportCapture = str;
    }

    public final String getPassportCaptured() {
        return this.passportCaptured;
    }

    public final void setPassportCaptured(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passportCaptured = str;
    }

    public final String getPlaceFlatAndHoldId() {
        return this.placeFlatAndHoldId;
    }

    public final void setPlaceFlatAndHoldId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeFlatAndHoldId = str;
    }

    public final String getPlaceFlatAndHoldPassport() {
        return this.placeFlatAndHoldPassport;
    }

    public final void setPlaceFlatAndHoldPassport(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeFlatAndHoldPassport = str;
    }

    public final String getPlaceIdFlat() {
        return this.placeIdFlat;
    }

    public final void setPlaceIdFlat(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.placeIdFlat = str;
    }

    public final String getRetake() {
        return this.retake;
    }

    public final void setRetake(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.retake = str;
    }

    public final String getSelfieCapture() {
        return this.selfieCapture;
    }

    public final void setSelfieCapture(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selfieCapture = str;
    }

    public final String getSelfieCaptured() {
        return this.selfieCaptured;
    }

    public final void setSelfieCaptured(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.selfieCaptured = str;
    }

    public final String getToGetStarted() {
        return this.toGetStarted;
    }

    public final void setToGetStarted(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.toGetStarted = str;
    }

    public final String getInvalidImage() {
        return this.invalidImage;
    }

    public final void setInvalidImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.invalidImage = str;
    }

    public final String getSubmitImageForValidation() {
        return this.submitImageForValidation;
    }

    public final void setSubmitImageForValidation(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.submitImageForValidation = str;
    }

    public final String getValidatingImage() {
        return this.validatingImage;
    }

    public final void setValidatingImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.validatingImage = str;
    }

    public final String getImageValidated() {
        return this.imageValidated;
    }

    public final void setImageValidated(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.imageValidated = str;
    }

    public final String getProcessing() {
        return this.processing;
    }

    public final void setProcessing(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.processing = str;
    }

    public final String getSuccess() {
        return this.success;
    }

    public final void setSuccess(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.success = str;
    }

    public final String getCameraPermissionMsg() {
        return this.cameraPermissionMsg;
    }

    public final void setCameraPermissionMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cameraPermissionMsg = str;
    }

    public final String getCameraPermissionTitle() {
        return this.cameraPermissionTitle;
    }

    public final void setCameraPermissionTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cameraPermissionTitle = str;
    }

    public final String getCameraPermissionButton() {
        return this.cameraPermissionButton;
    }

    public final void setCameraPermissionButton(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cameraPermissionButton = str;
    }

    public final String getBackPressWarningMsg() {
        return this.backPressWarningMsg;
    }

    public final void setBackPressWarningMsg(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.backPressWarningMsg = str;
    }

    public final String getPreviewDocSubmit() {
        return this.previewDocSubmit;
    }

    public final void setPreviewDocSubmit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.previewDocSubmit = str;
    }

    public final String getPreviewSelfieSubmit() {
        return this.previewSelfieSubmit;
    }

    public final void setPreviewSelfieSubmit(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.previewSelfieSubmit = str;
    }

    public final String getFaceTooClose() {
        return this.faceTooClose;
    }

    public final void setFaceTooClose(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceTooClose = str;
    }

    public final String getPleaseWait() {
        return this.pleaseWait;
    }

    public final void setPleaseWait(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.pleaseWait = str;
    }

    public final String getMovePhoneBack() {
        return this.movePhoneBack;
    }

    public final void setMovePhoneBack(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.movePhoneBack = str;
    }

    public final String getIdTooClose() {
        return this.idTooClose;
    }

    public final void setIdTooClose(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.idTooClose = str;
    }

    public final String getPassportTooClose() {
        return this.passportTooClose;
    }

    public final void setPassportTooClose(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.passportTooClose = str;
    }

    public final String getFaceNotParallel() {
        return this.faceNotParallel;
    }

    public final void setFaceNotParallel(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.faceNotParallel = str;
    }

    public final String getDocSelectSubText() {
        return this.docSelectSubText;
    }

    public final void setDocSelectSubText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docSelectSubText = str;
    }

    public final String getDocIdSubText() {
        return this.docIdSubText;
    }

    public final void setDocIdSubText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docIdSubText = str;
    }

    public final String getDocPassportSubText() {
        return this.docPassportSubText;
    }

    public final void setDocPassportSubText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docPassportSubText = str;
    }

    public final String getDocReady() {
        return this.docReady;
    }

    public final void setDocReady(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docReady = str;
    }

    public final String getDocCameraPermission() {
        return this.docCameraPermission;
    }

    public final void setDocCameraPermission(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.docCameraPermission = str;
    }
}
