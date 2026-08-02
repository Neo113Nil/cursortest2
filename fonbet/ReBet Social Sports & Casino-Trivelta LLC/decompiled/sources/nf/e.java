package nf;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import X0.a;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.T;
import androidx.lifecycle.AbstractC2185j;
import androidx.lifecycle.AbstractC2194t;
import androidx.lifecycle.InterfaceC2184i;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.U;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.EventKeys;
import com.zoho.livechat.android.modules.common.ui.activities.SalesIQActivity;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.L;
import lb.C5444x;
import m.AbstractC5479a;
import od.AbstractC5886l;
import rd.C6218a;

@Metadata(d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u008f\u0001\u0010(\u001a\u00020\u00062\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\u0010\b\u0002\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001f2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010,\u001a\u00020\u00062\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0\u001fH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u0006H\u0002¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u001f\u00103\u001a\u00020\u00062\u0006\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\nH\u0002¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u0010\rJ\u0013\u00108\u001a\u00020\u0006*\u000207H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u0006*\u000207H\u0002¢\u0006\u0004\b:\u00109J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u00020\u0006H\u0002¢\u0006\u0004\bA\u0010\u0003J-\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bI\u0010JJ\u0019\u0010L\u001a\u00020\u00062\b\u0010K\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bL\u0010\bJ\u0019\u0010O\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010Q\u001a\u00020\n2\b\u0010N\u001a\u0004\u0018\u00010MH\u0016¢\u0006\u0004\bQ\u0010PJ!\u0010S\u001a\u00020\u00062\u0006\u0010R\u001a\u00020H2\b\u0010G\u001a\u0004\u0018\u00010FH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0006H\u0016¢\u0006\u0004\bU\u0010\u0003J\u000f\u0010V\u001a\u00020\u0006H\u0016¢\u0006\u0004\bV\u0010\u0003J\u0017\u0010X\u001a\u00020\u00062\b\b\u0002\u0010W\u001a\u00020\n¢\u0006\u0004\bX\u0010\rJ\r\u0010Y\u001a\u00020\u0004¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\nH\u0016¢\u0006\u0004\b[\u0010\\J\r\u0010]\u001a\u00020\n¢\u0006\u0004\b]\u0010\\R\u0016\u0010a\u001a\u00020^8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010e\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010g\u001a\u00020b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010dR\u0016\u0010k\u001a\u00020h8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bi\u0010jR\u001b\u0010q\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010x\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010z\u001a\u00020u8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010wR\u0016\u0010}\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0088\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0085\u0001R \u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008a\u0001\u0010n\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0090\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u008e\u0001\u0010n\u001a\u0006\b\u008f\u0001\u0010\u008c\u0001R\u001c\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0093\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0093\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0093\u0001R\u001b\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010\u009f\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010sR\u0018\u0010¡\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010sR\u0018\u0010£\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010sR\u0018\u0010¥\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¤\u0001\u0010sR\u0018\u0010§\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¦\u0001\u0010sR\u0018\u0010©\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¨\u0001\u0010sR\u0018\u0010«\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bª\u0001\u0010sR\u0018\u0010\u00ad\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¬\u0001\u0010sR\u0018\u0010¯\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010sR\u001c\u0010±\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u0093\u0001R\u0018\u0010´\u0001\u001a\u00030²\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b³\u0001\u0010¢\u0001R\u0018\u0010¶\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bµ\u0001\u0010sR\u0018\u0010¸\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b·\u0001\u0010sR\u0018\u0010¼\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010¾\u0001\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b½\u0001\u0010ZR\u0018\u0010À\u0001\u001a\u0004\u0018\u00010\u00048BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010ZR\u0016\u0010Â\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÁ\u0001\u0010\\R\u001a\u0010Æ\u0001\u001a\u0005\u0018\u00010Ã\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010È\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\\R\u0016\u0010Ê\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010\\R\u0016\u0010Ì\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\\R\u0016\u0010Î\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\\R\u0016\u0010Ð\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\\R\u0016\u0010Ò\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010\\R\u0016\u0010Ô\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÓ\u0001\u0010\\R\u0016\u0010Ö\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010\\R\u0013\u0010Ø\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b×\u0001\u0010\\R\u0013\u0010Ú\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010ZR\u0013\u0010Ü\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010\\¨\u0006Ý\u0001"}, d2 = {"Lnf/e;", "Lbg/f;", "<init>", "()V", "", "newText", "", "m1", "(Ljava/lang/String;)V", "T0", "", EventKeys.VALUE_KEY, "U0", "(Z)V", "V0", "R0", "I1", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource;", "salesIQResource", "D1", "(Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource;)V", "Lcom/google/android/material/button/MaterialButton;", "I0", "(Lcom/google/android/material/button/MaterialButton;)V", "N0", "M0", "t1", "L0", "Q0", "O0", "P0", "", "resources", "resourceCategories", "recentlyViewedResources", "recentlyViewedResourcesIncludingItsChildCategories", "recentlyViewedFromSearchResources", "resourceDepartments", "updateWithDiffUtil", "shouldOnlyValidateWithoutUpdate", "J1", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$b;", "departments", "x1", "(Ljava/util/List;)V", "u1", "v1", "w1", "isDepartmentsToBeLoaded", "isSyncNeedToBeCompleted", "l1", "(ZZ)V", "isForceRefresh", "F1", "Lcom/google/android/material/button/MaterialButtonToggleGroup;", "H1", "(Lcom/google/android/material/button/MaterialButtonToggleGroup;)V", "n1", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "salesIQArticle", "B1", "(Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;)V", "resourceId", "C1", "S0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "text", "y1", "Landroid/view/MenuItem;", "menuItem", "e0", "(Landroid/view/MenuItem;)Z", "f0", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "forceRefresh", "E1", "X0", "()Ljava/lang/String;", "onBackPressed", "()Z", "K0", "Landroidx/recyclerview/widget/RecyclerView;", X9.m.f13664a, "Landroidx/recyclerview/widget/RecyclerView;", "articlesRecyclerView", "Landroid/widget/TextView;", "n", "Landroid/widget/TextView;", "emptySearchStateText", "o", "emptyStateText", "LZf/l;", "p", "LZf/l;", "resourcesAdapter", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel;", "q", "Lkotlin/Lazy;", "Y0", "()Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel;", "articlesViewModel", "r", "Z", "isFirstArticlesFragment", "Landroidx/constraintlayout/widget/Group;", "s", "Landroidx/constraintlayout/widget/Group;", "emptyStateGroup", "t", "emptySearchResultViewGroup", "u", "Lcom/google/android/material/button/MaterialButtonToggleGroup;", "articleSubCategoryTabButtonToggleGroup", "v", "Lcom/google/android/material/button/MaterialButton;", "articleTabButton", "w", "subCategoryTabButton", "Landroid/widget/ProgressBar;", C5444x.f55808b, "Landroid/widget/ProgressBar;", "articlesProgress", "y", "articlesSearchProgress", "Landroid/content/res/ColorStateList;", "z", "i1", "()Landroid/content/res/ColorStateList;", "selectedTintColorState", "A", "k1", "unSelectedTintColorState", "LPh/C0;", "B", "LPh/C0;", "articlesFlowJob", "C", "relatedArticlesFlowJob", "D", "categoriesFlowJob", "E", "recentlyViewedArticlesFromSearchJob", "F", "Ljava/lang/String;", "searchKey", "G", "isSearchUIVisible", "H", "isArticlesLoaded", "I", "isCategoriesLoaded", "J", "isDepartmentsLoaded", "K", "isRecentlyViewedArticlesFromSearchLoaded", "L", "shouldRestoreSearchUI", "O", "isArticlesReceivedAfterSyncCompletion", "P", "isArticleCategoriesReceivedAfterSyncCompletion", "R", "isResourcesAdapterAlreadyInitialised", "T", "typingStatusJob", "", "V", "minimumCharacterSizeLimit", "W", "isArticleSyncCompleted", "X", "isCategorySyncCompleted", "Landroidx/recyclerview/widget/RecyclerView$v;", "Y", "Landroidx/recyclerview/widget/RecyclerView$v;", "articlesListOnScrollListener", "g1", "parentCategoryId", "d1", "departmentId", "s1", "isSearchUIHidden", "Lcom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity;", "h1", "()Lcom/zoho/livechat/android/modules/common/ui/activities/SalesIQActivity;", "salesIQActivity", "e1", "hasArticle", "f1", "hasCategory", "c1", "canShowDepartments", "r1", "isSearchSyncInProgress", "a1", "canIncludeChildCategoriesRecentlyViewedArticles", "o1", "isBothClassifiersDisabled", "p1", "isDepartmentsClassifierEnabledWithCategoriesDisabled", "b1", "canRequestForArticles", "Z0", "canEnablePageSwipe", "j1", "title", "q1", "isEmptyViewShown", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArticlesFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArticlesFragment.kt\ncom/zoho/livechat/android/modules/knowledgebase/ui/fragments/ArticlesFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1032:1\n106#2,15:1033\n774#3:1048\n865#3,2:1049\n774#3:1052\n865#3,2:1053\n1#4:1051\n*S KotlinDebug\n*F\n+ 1 ArticlesFragment.kt\ncom/zoho/livechat/android/modules/knowledgebase/ui/fragments/ArticlesFragment\n*L\n59#1:1033,15\n244#1:1048\n244#1:1049,2\n592#1:1052\n592#1:1053,2\n*E\n"})
/* loaded from: classes4.dex */
public final class e extends bg.f {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final Lazy unSelectedTintColorState;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public C0 articlesFlowJob;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public C0 relatedArticlesFlowJob;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public C0 categoriesFlowJob;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public C0 recentlyViewedArticlesFromSearchJob;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public String searchKey;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public boolean isSearchUIVisible;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public boolean isArticlesLoaded;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public boolean isCategoriesLoaded;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public boolean isDepartmentsLoaded;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public boolean isRecentlyViewedArticlesFromSearchLoaded;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public boolean shouldRestoreSearchUI;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    public boolean isArticlesReceivedAfterSyncCompletion;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    public boolean isArticleCategoriesReceivedAfterSyncCompletion;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public boolean isResourcesAdapterAlreadyInitialised;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    public C0 typingStatusJob;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    public final int minimumCharacterSizeLimit;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    public boolean isArticleSyncCompleted;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    public boolean isCategorySyncCompleted;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    public final RecyclerView.v articlesListOnScrollListener;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public RecyclerView articlesRecyclerView;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public TextView emptySearchStateText;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public TextView emptyStateText;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Zf.l resourcesAdapter;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesViewModel;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean isFirstArticlesFragment;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public Group emptyStateGroup;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public Group emptySearchResultViewGroup;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public MaterialButtonToggleGroup articleSubCategoryTabButtonToggleGroup;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public MaterialButton articleTabButton;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public MaterialButton subCategoryTabButton;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public ProgressBar articlesProgress;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public ProgressBar articlesSearchProgress;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final Lazy selectedTintColorState;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArticlesViewModel.EnumC3866b.values().length];
            try {
                iArr[ArticlesViewModel.EnumC3866b.NotInitiated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArticlesViewModel.EnumC3866b.Initiated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArticlesViewModel.EnumC3866b.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class b extends RecyclerView.v {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.v
        public void b(RecyclerView recyclerView, int i10, int i11) {
            Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
            super.b(recyclerView, i10, i11);
            RecyclerView recyclerView2 = e.this.articlesRecyclerView;
            Zf.l lVar = null;
            if (recyclerView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
                recyclerView2 = null;
            }
            RecyclerView.q layoutManager = recyclerView2.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int q22 = ((LinearLayoutManager) layoutManager).q2();
            if (e.this.b1() && e.this.s1() && !e.this.Y0().getIsArticlesSyncInProgress()) {
                Zf.l lVar2 = e.this.resourcesAdapter;
                if (lVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                    lVar2 = null;
                }
                if (lVar2.k()) {
                    Zf.l lVar3 = e.this.resourcesAdapter;
                    if (lVar3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                    } else {
                        lVar = lVar3;
                    }
                    if (q22 >= og.i.k(Integer.valueOf(lVar.getItemCount())) - 10) {
                        e.this.Y0().u0(false);
                    }
                }
            }
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final U.c invoke() {
            ArticlesViewModel.Companion companion = ArticlesViewModel.INSTANCE;
            e eVar = e.this;
            return companion.a(eVar, eVar.getArguments());
        }
    }

    public static final class d extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58466n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58468n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58469o;

            /* renamed from: nf.e$d$a$a, reason: collision with other inner class name */
            public static final class C0847a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f58470a;

                public C0847a(e eVar) {
                    this.f58470a = eVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, Continuation continuation) {
                    String str = this.f58470a.searchKey;
                    if (str != null && str.length() != 0) {
                        ArticlesViewModel Y02 = this.f58470a.Y0();
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((SalesIQResource.Data) it.next()).getId());
                        }
                        Y02.f0(arrayList, this.f58470a.searchKey);
                    }
                    e eVar = this.f58470a;
                    eVar.isArticlesReceivedAfterSyncCompletion = og.i.e(eVar.Y0().L().getValue());
                    this.f58470a.v1();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58469o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58469o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58468n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C J10 = this.f58469o.Y0().J();
                    C0847a c0847a = new C0847a(this.f58469o);
                    this.f58468n = 1;
                    if (J10.collect(c0847a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new d(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((d) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58466n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58466n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: nf.e$e, reason: collision with other inner class name */
    public static final class C0848e extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58471n;

        /* renamed from: nf.e$e$a */
        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58473n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58474o;

            /* renamed from: nf.e$e$a$a, reason: collision with other inner class name */
            public static final class C0849a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f58475a;

                public C0849a(e eVar) {
                    this.f58475a = eVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, Continuation continuation) {
                    e eVar = this.f58475a;
                    eVar.isArticleCategoriesReceivedAfterSyncCompletion = og.i.e(eVar.Y0().B().getValue());
                    if (list != null) {
                        e eVar2 = this.f58475a;
                        if (eVar2.s1() && eVar2.Y0().M() < 1 && !list.isEmpty()) {
                            eVar2.Y0().W(true);
                        }
                        eVar2.u1();
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58474o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58474o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58473n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L z10 = this.f58474o.Y0().z();
                    C0849a c0849a = new C0849a(this.f58474o);
                    this.f58473n = 1;
                    if (z10.collect(c0849a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public C0848e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new C0848e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((C0848e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58471n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58471n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class f extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58476n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58478n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58479o;

            /* renamed from: nf.e$f$a$a, reason: collision with other inner class name */
            public static final class C0850a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f58480a;

                public C0850a(e eVar) {
                    this.f58480a = eVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(ArticlesViewModel.DataSync dataSync, Continuation continuation) {
                    this.f58480a.isArticleSyncCompleted = og.i.i(dataSync != null ? Boxing.boxBoolean(dataSync.isSynced()) : null);
                    if ((dataSync != null ? Intrinsics.areEqual(dataSync.getGotData(), Boxing.boxBoolean(false)) : false) || this.f58480a.isArticleSyncCompleted) {
                        this.f58480a.isArticlesReceivedAfterSyncCompletion = true;
                        this.f58480a.w1();
                    }
                    this.f58480a.F1(false);
                    this.f58480a.w1();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58479o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58479o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58478n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L L10 = this.f58479o.Y0().L();
                    C0850a c0850a = new C0850a(this.f58479o);
                    this.f58478n = 1;
                    if (L10.collect(c0850a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((f) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58476n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58476n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class g extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58481n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58483n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58484o;

            /* renamed from: nf.e$g$a$a, reason: collision with other inner class name */
            public static final class C0851a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f58485a;

                public C0851a(e eVar) {
                    this.f58485a = eVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(ArticlesViewModel.DataSync dataSync, Continuation continuation) {
                    this.f58485a.isCategorySyncCompleted = og.i.i(dataSync != null ? Boxing.boxBoolean(dataSync.isSynced()) : null);
                    if ((dataSync != null ? Intrinsics.areEqual(dataSync.getGotData(), Boxing.boxBoolean(false)) : false) || this.f58485a.isCategorySyncCompleted) {
                        this.f58485a.isArticleCategoriesReceivedAfterSyncCompletion = true;
                        this.f58485a.w1();
                    }
                    this.f58485a.F1(false);
                    this.f58485a.w1();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58484o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58484o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58483n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L B10 = this.f58484o.Y0().B();
                    C0851a c0851a = new C0851a(this.f58484o);
                    this.f58483n = 1;
                    if (B10.collect(c0851a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((g) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58481n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58481n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class h extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58486n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58488n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58489o;

            /* renamed from: nf.e$h$a$a, reason: collision with other inner class name */
            public static final class C0852a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f58490a;

                public C0852a(e eVar) {
                    this.f58490a = eVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, Continuation continuation) {
                    e eVar = this.f58490a;
                    eVar.F1(og.i.g(eVar.g1()));
                    e.K1(this.f58490a, null, null, null, null, null, null, false, false, 255, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58489o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58489o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58488n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L e02 = this.f58489o.Y0().e0();
                    C0852a c0852a = new C0852a(this.f58489o);
                    this.f58488n = 1;
                    if (e02.collect(c0852a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public h(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((h) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58486n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58486n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class i extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58491n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58493n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58494o;

            /* renamed from: nf.e$i$a$a, reason: collision with other inner class name */
            public static final class C0853a implements InterfaceC5322g {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e f58495a;

                public C0853a(e eVar) {
                    this.f58495a = eVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC5322g
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(List list, Continuation continuation) {
                    e eVar = this.f58495a;
                    eVar.F1(og.i.g(eVar.g1()));
                    e.K1(this.f58495a, null, null, null, null, null, null, false, false, 255, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58494o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58494o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58493n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L c02 = this.f58494o.Y0().c0();
                    C0853a c0853a = new C0853a(this.f58494o);
                    this.f58493n = 1;
                    if (c02.collect(c0853a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public i(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((i) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58491n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58491n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58496n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f58497o;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58499n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58500o;

            /* renamed from: nf.e$j$a$a, reason: collision with other inner class name */
            public static final class C0854a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f58501n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e f58502o;

                /* renamed from: nf.e$j$a$a$a, reason: collision with other inner class name */
                public static final class C0855a implements InterfaceC5322g {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ e f58503a;

                    public C0855a(e eVar) {
                        this.f58503a = eVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC5322g
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object emit(List list, Continuation continuation) {
                        e.K1(this.f58503a, null, null, null, null, null, null, false, false, 255, null);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0854a(e eVar, Continuation continuation) {
                    super(2, continuation);
                    this.f58502o = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0854a(this.f58502o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((C0854a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f58501n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        L h02 = this.f58502o.Y0().h0();
                        C0855a c0855a = new C0855a(this.f58502o);
                        this.f58501n = 1;
                        if (h02.collect(c0855a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58500o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58500o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58499n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC2185j lifecycle = this.f58500o.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                    C0854a c0854a = new C0854a(this.f58500o, null);
                    this.f58499n = 1;
                    if (RepeatOnLifecycleKt.a(lifecycle, bVar, c0854a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public static final class b extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58504n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58505o;

            public static final class a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f58506n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e f58507o;

                /* renamed from: nf.e$j$b$a$a, reason: collision with other inner class name */
                public static final class C0856a implements InterfaceC5322g {

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ e f58508a;

                    public C0856a(e eVar) {
                        this.f58508a = eVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC5322g
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Object emit(ArticlesViewModel.EnumC3866b enumC3866b, Continuation continuation) {
                        this.f58508a.w1();
                        e.K1(this.f58508a, null, null, null, null, null, null, false, true, 127, null);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(e eVar, Continuation continuation) {
                    super(2, continuation);
                    this.f58507o = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new a(this.f58507o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(P p10, Continuation continuation) {
                    return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i10 = this.f58506n;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        L I10 = this.f58507o.Y0().I();
                        C0856a c0856a = new C0856a(this.f58507o);
                        this.f58506n = 1;
                        if (I10.collect(c0856a, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    throw new KotlinNothingValueException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58505o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f58505o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58504n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    AbstractC2185j lifecycle = this.f58505o.getLifecycle();
                    Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                    AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                    a aVar = new a(this.f58505o, null);
                    this.f58504n = 1;
                    if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = e.this.new j(continuation);
            jVar.f58497o = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((j) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58496n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            P p10 = (P) this.f58497o;
            AbstractC1459k.d(p10, null, null, new a(e.this, null), 3, null);
            AbstractC1459k.d(p10, null, null, new b(e.this, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class k extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58509n;

        public static final class a extends SuspendLambda implements Function2 {

            /* renamed from: n, reason: collision with root package name */
            public int f58511n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ e f58512o;

            /* renamed from: nf.e$k$a$a, reason: collision with other inner class name */
            public static final class C0857a extends SuspendLambda implements Function2 {

                /* renamed from: n, reason: collision with root package name */
                public int f58513n;

                /* renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e f58514o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0857a(e eVar, Continuation continuation) {
                    super(2, continuation);
                    this.f58514o = eVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0857a(this.f58514o, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public final Object invoke(List list, Continuation continuation) {
                    return ((C0857a) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.f58513n != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    this.f58514o.v1();
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, Continuation continuation) {
                super(2, continuation);
                this.f58512o = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f58512o, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(P p10, Continuation continuation) {
                return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f58511n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    L a02 = this.f58512o.Y0().a0();
                    C0857a c0857a = new C0857a(this.f58512o, null);
                    this.f58511n = 1;
                    if (AbstractC5323h.h(a02, c0857a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        public k(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((k) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58509n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                AbstractC2185j lifecycle = e.this.getLifecycle();
                Intrinsics.checkNotNullExpressionValue(lifecycle, "<get-lifecycle>(...)");
                AbstractC2185j.b bVar = AbstractC2185j.b.f20394e;
                a aVar = new a(e.this, null);
                this.f58509n = 1;
                if (RepeatOnLifecycleKt.a(lifecycle, bVar, aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class l extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58515n;

        public l(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((l) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f58515n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List list = (List) e.this.Y0().P().getValue();
            if (list != null) {
                e eVar = e.this;
                eVar.x1(list);
                eVar.w1();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class m extends Lambda implements Function1 {
        public m() {
            super(1);
        }

        public final void a(SalesIQResource resource) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            if (resource instanceof SalesIQResource.a) {
                e.this.D1(resource);
                return;
            }
            if (resource instanceof SalesIQResource.b) {
                e.this.D1(resource);
            } else {
                if ((resource instanceof SalesIQResource.c) || !(resource instanceof SalesIQResource.Data)) {
                    return;
                }
                if (e.this.isSearchUIVisible) {
                    e.this.Y0().p0(((SalesIQResource.Data) resource).getId());
                }
                e.this.B1((SalesIQResource.Data) resource);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((SalesIQResource) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class n extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f58518n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f58519o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ e f58520p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, e eVar, Continuation continuation) {
            super(2, continuation);
            this.f58519o = str;
            this.f58520p = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f58519o, this.f58520p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((n) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
        
            if (og.i.k((r4 == null || (r4 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r4).toString()) == null) ? null : kotlin.coroutines.jvm.internal.Boxing.boxInt(r4.length())) >= r3.f58520p.minimumCharacterSizeLimit) goto L27;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f58518n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f58518n = 1;
                if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            String str = this.f58519o;
            String obj2 = str != null ? StringsKt.trim((CharSequence) str).toString() : null;
            if (obj2 != null && obj2.length() != 0) {
                String str2 = this.f58519o;
            }
            e eVar = this.f58520p;
            String str3 = this.f58519o;
            eVar.m1(str3 != null ? StringsKt.trim((CharSequence) str3).toString() : null);
            return Unit.INSTANCE;
        }
    }

    public static final class o extends Lambda implements Function0 {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ColorStateList invoke() {
            return ColorStateList.valueOf(com.zoho.livechat.android.utils.P.b(e.this.getContext(), 15.0f, AbstractC5886l.f59822f));
        }
    }

    public static final class p extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Fragment f58522d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Fragment fragment) {
            super(0);
            this.f58522d = fragment;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f58522d;
        }
    }

    public static final class q extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f58523d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0 function0) {
            super(0);
            this.f58523d = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final W invoke() {
            return (W) this.f58523d.invoke();
        }
    }

    public static final class r extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Lazy f58524d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Lazy lazy) {
            super(0);
            this.f58524d = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final V invoke() {
            W c10;
            c10 = T.c(this.f58524d);
            return c10.getViewModelStore();
        }
    }

    public static final class s extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f58525d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Lazy f58526e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Function0 function0, Lazy lazy) {
            super(0);
            this.f58525d = function0;
            this.f58526e = lazy;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final X0.a invoke() {
            W c10;
            X0.a aVar;
            Function0 function0 = this.f58525d;
            if (function0 != null && (aVar = (X0.a) function0.invoke()) != null) {
                return aVar;
            }
            c10 = T.c(this.f58526e);
            InterfaceC2184i interfaceC2184i = c10 instanceof InterfaceC2184i ? (InterfaceC2184i) c10 : null;
            return interfaceC2184i != null ? interfaceC2184i.getDefaultViewModelCreationExtras() : a.b.f13375c;
        }
    }

    public static final class t extends Lambda implements Function0 {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ColorStateList invoke() {
            return ColorStateList.valueOf(com.zoho.livechat.android.utils.P.b(e.this.getContext(), 15.0f, AbstractC5886l.f59827g));
        }
    }

    public e() {
        c cVar = new c();
        Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new q(new p(this)));
        this.articlesViewModel = T.b(this, Reflection.getOrCreateKotlinClass(ArticlesViewModel.class), new r(lazy), new s(null, lazy), cVar);
        this.selectedTintColorState = LazyKt.lazy(new o());
        this.unSelectedTintColorState = LazyKt.lazy(new t());
        this.minimumCharacterSizeLimit = 2;
        this.articlesListOnScrollListener = new b();
    }

    public static final void A1(e this$0, MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
        Zf.l lVar;
        Zf.l lVar2;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (z10) {
            if (i10 == od.q.f60607o0) {
                MaterialButton materialButton = this$0.subCategoryTabButton;
                if (materialButton == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCategoryTabButton");
                    materialButton = null;
                }
                materialButton.setBackgroundTintList(this$0.k1());
                MaterialButton materialButton2 = this$0.articleTabButton;
                if (materialButton2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articleTabButton");
                    materialButton2 = null;
                }
                materialButton2.setBackgroundTintList(this$0.i1());
                Zf.l lVar3 = this$0.resourcesAdapter;
                if (lVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                    lVar2 = null;
                } else {
                    lVar2 = lVar3;
                }
                Zf.l.p(lVar2, Boolean.TRUE, Boolean.FALSE, null, null, false, false, 28, null);
            } else if (i10 == od.q.f60468a8) {
                MaterialButton materialButton3 = this$0.articleTabButton;
                if (materialButton3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articleTabButton");
                    materialButton3 = null;
                }
                materialButton3.setBackgroundTintList(this$0.k1());
                MaterialButton materialButton4 = this$0.subCategoryTabButton;
                if (materialButton4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("subCategoryTabButton");
                    materialButton4 = null;
                }
                materialButton4.setBackgroundTintList(this$0.i1());
                Zf.l lVar4 = this$0.resourcesAdapter;
                if (lVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                    lVar = null;
                } else {
                    lVar = lVar4;
                }
                Zf.l.p(lVar, Boolean.FALSE, Boolean.TRUE, null, null, false, false, 28, null);
            }
            K1(this$0, null, null, null, null, null, null, false, false, EnumC3631g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
        }
    }

    public static /* synthetic */ void G1(e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        eVar.F1(z10);
    }

    public static final void J0(MaterialButton this_calculateAndSetTextAlignment) {
        Intrinsics.checkNotNullParameter(this_calculateAndSetTextAlignment, "$this_calculateAndSetTextAlignment");
        int width = this_calculateAndSetTextAlignment.getWidth();
        TextPaint paint = this_calculateAndSetTextAlignment.getPaint();
        Intrinsics.checkNotNullExpressionValue(paint, "getPaint(...)");
        this_calculateAndSetTextAlignment.setTextAlignment(paint.measureText(this_calculateAndSetTextAlignment.getText().toString()) > ((float) width) ? 5 : 4);
    }

    public static /* synthetic */ void K1(e eVar, List list, List list2, List list3, List list4, List list5, List list6, boolean z10, boolean z11, int i10, Object obj) {
        boolean z12;
        if ((i10 & 1) != 0) {
            list = eVar.Y0().C();
        }
        if ((i10 & 2) != 0) {
            list2 = (List) eVar.Y0().z().getValue();
        }
        if ((i10 & 4) != 0) {
            list3 = (List) eVar.Y0().e0().getValue();
        }
        if ((i10 & 8) != 0) {
            list4 = (List) eVar.Y0().c0().getValue();
        }
        if ((i10 & 16) != 0) {
            list5 = (List) eVar.Y0().a0().getValue();
        }
        if ((i10 & 32) != 0) {
            List list7 = (List) eVar.Y0().P().getValue();
            if (list7 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list7) {
                    SalesIQResource.b bVar = (SalesIQResource.b) obj2;
                    String str = eVar.searchKey;
                    if (str == null || str.length() == 0) {
                        z12 = true;
                    } else {
                        String a10 = bVar.a();
                        String str2 = eVar.searchKey;
                        Intrinsics.checkNotNull(str2);
                        z12 = StringsKt.contains((CharSequence) a10, (CharSequence) str2, true);
                    }
                    if (z12) {
                        arrayList.add(obj2);
                    }
                }
                list6 = arrayList;
            } else {
                list6 = null;
            }
        }
        if ((i10 & 64) != 0) {
            z10 = true;
        }
        if ((i10 & 128) != 0) {
            z11 = false;
        }
        boolean z13 = z10;
        boolean z14 = z11;
        eVar.J1(list, list2, list3, list4, list5, list6, z13, z14);
    }

    public static final boolean W0(View view, MotionEvent motionEvent) {
        LiveChatUtil.hideKeyboard(view);
        return false;
    }

    private final String d1() {
        return Y0().N();
    }

    public final void B1(SalesIQResource.Data salesIQArticle) {
        this.shouldRestoreSearchUI = this.isSearchUIVisible;
        SalesIQActivity h12 = h1();
        if (h12 != null) {
            h12.x0(null);
        }
        C1(salesIQArticle.getId());
    }

    public final void C1(String resourceId) {
        if (resourceId != null) {
            bg.c cVar = new bg.c();
            Bundle bundle = new Bundle();
            bundle.putString("article_id", resourceId);
            if (this.isSearchUIVisible) {
                bundle.putBoolean("is_opened_from_searched_articles", true);
            }
            cVar.setArguments(bundle);
            getParentFragmentManager().s().p(od.q.f60482c0, cVar, resourceId).g(null).h();
        }
    }

    public final void D1(SalesIQResource salesIQResource) {
        this.shouldRestoreSearchUI = this.isSearchUIVisible;
        SalesIQActivity h12 = h1();
        if (h12 != null) {
            h12.x0(null);
        }
        e eVar = new e();
        Bundle bundle = new Bundle();
        Bundle arguments = getArguments();
        if (arguments != null) {
            bundle.putAll(arguments);
        }
        bundle.remove("is_first_page");
        boolean z10 = salesIQResource instanceof SalesIQResource.a;
        if (z10) {
            SalesIQResource.a aVar = (SalesIQResource.a) salesIQResource;
            bundle.putString("title", aVar.c());
            bundle.putString("parent_category_id", aVar.getId());
            bundle.putInt("categories_count", aVar.b());
            bundle.putInt("articles_count", aVar.a());
        } else if (salesIQResource instanceof SalesIQResource.b) {
            SalesIQResource.b bVar = (SalesIQResource.b) salesIQResource;
            bundle.putString("title", bVar.a());
            bundle.putString("department_id", bVar.getId());
        }
        String d12 = d1();
        if (d12 != null && d12.length() != 0) {
            bundle.putString("department_id", d1());
        }
        eVar.setArguments(bundle);
        String id2 = salesIQResource instanceof SalesIQResource.b ? ((SalesIQResource.b) salesIQResource).getId() : z10 ? ((SalesIQResource.a) salesIQResource).getId() : og.i.b();
        getParentFragmentManager().s().p(od.q.f60482c0, eVar, id2).g(id2).h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (r4 != r1.get(r2.intValue())) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E1(boolean forceRefresh) {
        AbstractActivityC2168s activity;
        if (forceRefresh || isVisible()) {
            SalesIQActivity h12 = h1();
            if ((h12 != null ? Integer.valueOf(h12.f0()) : null) != null && !MobilistenUtil.h().isEmpty()) {
                ZohoSalesIQ.l lVar = ZohoSalesIQ.l.KnowledgeBase;
                List h10 = MobilistenUtil.h();
                SalesIQActivity h13 = h1();
                Integer valueOf = h13 != null ? Integer.valueOf(h13.f0()) : null;
                Intrinsics.checkNotNull(valueOf);
            }
            Bundle arguments = getArguments();
            if (arguments == null || !arguments.getBoolean("invoked_from_present_api")) {
                return;
            }
            SalesIQActivity h14 = h1();
            AbstractC5479a supportActionBar = h14 != null ? h14.getSupportActionBar() : null;
            if (supportActionBar != null) {
                supportActionBar.D(X0());
            }
            if (!s1() || (activity = getActivity()) == null) {
                return;
            }
            activity.invalidateOptionsMenu();
        }
    }

    public final void F1(boolean isForceRefresh) {
        Zf.l lVar;
        Zf.l lVar2;
        if (isForceRefresh || (this.isArticleSyncCompleted && this.isCategorySyncCompleted)) {
            MaterialButtonToggleGroup materialButtonToggleGroup = null;
            if (this.isFirstArticlesFragment || !e1() || !f1() || !Y0().m0() || !s1()) {
                MaterialButtonToggleGroup materialButtonToggleGroup2 = this.articleSubCategoryTabButtonToggleGroup;
                if (materialButtonToggleGroup2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articleSubCategoryTabButtonToggleGroup");
                } else {
                    materialButtonToggleGroup = materialButtonToggleGroup2;
                }
                n1(materialButtonToggleGroup);
                return;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup3 = this.articleSubCategoryTabButtonToggleGroup;
            if (materialButtonToggleGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleSubCategoryTabButtonToggleGroup");
                materialButtonToggleGroup3 = null;
            }
            H1(materialButtonToggleGroup3);
            MaterialButtonToggleGroup materialButtonToggleGroup4 = this.articleSubCategoryTabButtonToggleGroup;
            if (materialButtonToggleGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articleSubCategoryTabButtonToggleGroup");
                materialButtonToggleGroup4 = null;
            }
            if (materialButtonToggleGroup4.getCheckedButtonId() == od.q.f60607o0) {
                Zf.l lVar3 = this.resourcesAdapter;
                if (lVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                    lVar2 = null;
                } else {
                    lVar2 = lVar3;
                }
                Zf.l.p(lVar2, Boolean.TRUE, Boolean.FALSE, null, null, false, false, 44, null);
                return;
            }
            Zf.l lVar4 = this.resourcesAdapter;
            if (lVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar = null;
            } else {
                lVar = lVar4;
            }
            Zf.l.p(lVar, Boolean.FALSE, Boolean.TRUE, null, null, false, false, 44, null);
        }
    }

    public final void H1(MaterialButtonToggleGroup materialButtonToggleGroup) {
        ViewGroup.LayoutParams layoutParams = materialButtonToggleGroup.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = -2;
        materialButtonToggleGroup.setLayoutParams(marginLayoutParams);
        materialButtonToggleGroup.setPadding(materialButtonToggleGroup.getPaddingLeft(), C6218a.b(16.0f), materialButtonToggleGroup.getPaddingRight(), materialButtonToggleGroup.getPaddingBottom());
    }

    public final void I0(final MaterialButton materialButton) {
        materialButton.post(new Runnable() { // from class: nf.d
            @Override // java.lang.Runnable
            public final void run() {
                e.J0(MaterialButton.this);
            }
        });
    }

    public final void I1() {
        if (b1()) {
            ArticlesViewModel.v0(Y0(), false, 1, null);
        } else {
            Y0().q0();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0243, code lost:
    
        if ((Y0().m0() ? r10.isCategorySyncCompleted : true) != false) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J1(List resources, List resourceCategories, List recentlyViewedResources, List recentlyViewedResourcesIncludingItsChildCategories, List recentlyViewedFromSearchResources, List resourceDepartments, boolean updateWithDiffUtil, boolean shouldOnlyValidateWithoutUpdate) {
        List list;
        boolean z10;
        List list2;
        List list3;
        String str;
        ArrayList arrayList = new ArrayList();
        boolean z11 = true;
        Group group = null;
        if (resources != null) {
            if (this.isSearchUIVisible) {
                String str2 = this.searchKey;
                if (str2 != null && str2.length() != 0) {
                    List list4 = resources;
                    if ((!list4.isEmpty() ? this : null) != null) {
                        arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.Resource, true));
                    }
                    arrayList.addAll(list4);
                } else if (recentlyViewedFromSearchResources != null && recentlyViewedFromSearchResources.isEmpty()) {
                    arrayList.addAll(resources);
                }
            } else if (!a1()) {
                arrayList.addAll(resources);
            }
        }
        if (this.isSearchUIVisible) {
            String str3 = this.searchKey;
            if (((str3 != null && str3.length() != 0) || recentlyViewedFromSearchResources == null || !recentlyViewedFromSearchResources.isEmpty()) && ((str = this.searchKey) == null || str.length() == 0)) {
                arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.RecentlyViewedFromSearch, false, 4, null));
                Intrinsics.checkNotNull(recentlyViewedFromSearchResources);
                arrayList.addAll(recentlyViewedFromSearchResources);
            } else if (c1()) {
                String str4 = this.searchKey;
                if ((str4 != null && str4.length() != 0) || (list3 = recentlyViewedFromSearchResources) == null || list3.isEmpty()) {
                    List list5 = resourceDepartments;
                    if ((!(list5 == null || list5.isEmpty()) ? this : null) != null) {
                        String str5 = this.searchKey;
                        if (str5 != null && str5.length() != 0) {
                            arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.Department, true));
                        }
                        Intrinsics.checkNotNull(resourceDepartments);
                        arrayList.addAll(list5);
                    }
                }
            } else {
                if (((!Y0().m0() || (list2 = resourceCategories) == null || list2.isEmpty()) ? null : this) != null) {
                    String str6 = this.searchKey;
                    if (str6 != null && str6.length() != 0) {
                        arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.Category, true));
                    }
                    Intrinsics.checkNotNull(resourceCategories);
                    arrayList.addAll(resourceCategories);
                }
                Collection collection = (Collection) Y0().h0().getValue();
                if ((!(collection == null || collection.isEmpty()) ? this : null) != null) {
                    arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.Related, true));
                    Object value = Y0().h0().getValue();
                    Intrinsics.checkNotNull(value);
                    arrayList.addAll((Collection) value);
                }
            }
        } else {
            if (c1()) {
                List list6 = resourceDepartments;
                if ((!(list6 == null || list6.isEmpty()) ? this : null) != null) {
                    Intrinsics.checkNotNull(resourceDepartments);
                    arrayList.addAll(list6);
                }
            }
            if (((!Y0().m0() || (list = resourceCategories) == null || list.isEmpty()) ? null : this) != null) {
                Intrinsics.checkNotNull(resourceCategories);
                arrayList.addAll(resourceCategories);
            }
        }
        if (a1()) {
            List list7 = recentlyViewedResourcesIncludingItsChildCategories;
            if (((list7 == null || list7.isEmpty() || !s1()) ? null : this) != null) {
                arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.RecentlyViewed, false, 4, null));
                Intrinsics.checkNotNull(recentlyViewedResourcesIncludingItsChildCategories);
                arrayList.addAll(list7);
            }
        } else {
            List list8 = recentlyViewedResources;
            if (((list8 == null || list8.isEmpty() || !s1()) ? null : this) != null) {
                arrayList.add(new SalesIQResource.c(SalesIQResource.c.a.Article, SalesIQResource.c.b.RecentlyViewed, false, 4, null));
                Intrinsics.checkNotNull(recentlyViewedResources);
                arrayList.addAll(list8);
            }
        }
        if (!shouldOnlyValidateWithoutUpdate) {
            RecyclerView recyclerView = this.articlesRecyclerView;
            if (recyclerView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
                recyclerView = null;
            }
            RecyclerView.q layoutManager = recyclerView.getLayoutManager();
            Intrinsics.checkNotNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            boolean z12 = ((LinearLayoutManager) layoutManager).j2() == 0;
            Zf.l lVar = this.resourcesAdapter;
            if (lVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar = null;
            }
            if (updateWithDiffUtil) {
                if (!c1()) {
                    if (this.isArticleSyncCompleted) {
                    }
                }
                z10 = true;
                lVar.q(arrayList, z10);
                if (z12) {
                    RecyclerView recyclerView2 = this.articlesRecyclerView;
                    if (recyclerView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
                        recyclerView2 = null;
                    }
                    recyclerView2.x1(0);
                }
            }
            z10 = false;
            lVar.q(arrayList, z10);
            if (z12) {
            }
        }
        if (this.isSearchUIVisible) {
            String str7 = this.searchKey;
            if (str7 != null && str7.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                RecyclerView recyclerView3 = this.articlesRecyclerView;
                if (recyclerView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
                    recyclerView3 = null;
                }
                recyclerView3.x1(0);
                if (r1()) {
                    Group group2 = this.emptySearchResultViewGroup;
                    if (group2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("emptySearchResultViewGroup");
                    } else {
                        group = group2;
                    }
                    og.p.n(group);
                    return;
                }
                ProgressBar progressBar = this.articlesSearchProgress;
                if (progressBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articlesSearchProgress");
                    progressBar = null;
                }
                og.p.n(progressBar);
                if (arrayList.isEmpty()) {
                    Group group3 = this.emptySearchResultViewGroup;
                    if (group3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("emptySearchResultViewGroup");
                    } else {
                        group = group3;
                    }
                    og.p.w(group);
                    return;
                }
                Group group4 = this.emptySearchResultViewGroup;
                if (group4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emptySearchResultViewGroup");
                } else {
                    group = group4;
                }
                og.p.n(group);
                return;
            }
        }
        if (arrayList.isEmpty()) {
            w1();
            return;
        }
        Group group5 = this.emptySearchResultViewGroup;
        if (group5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptySearchResultViewGroup");
        } else {
            group = group5;
        }
        og.p.n(group);
    }

    public final boolean K0() {
        if (this.isSearchUIVisible) {
            return true;
        }
        List list = (List) Y0().z().getValue();
        Zf.l lVar = null;
        if (og.i.k(list != null ? Integer.valueOf(list.size()) : null) > 0) {
            return true;
        }
        Zf.l lVar2 = this.resourcesAdapter;
        if (lVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
        } else {
            lVar = lVar2;
        }
        return og.i.k(Integer.valueOf(lVar.getItemCount())) > 0;
    }

    public final void L0() {
        C0 d10;
        C0 c02 = this.articlesFlowJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(AbstractC2194t.a(this), null, null, new d(null), 3, null);
        this.articlesFlowJob = d10;
    }

    public final void M0() {
        C0 d10;
        C0 c02 = this.categoriesFlowJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(AbstractC2194t.a(this), null, null, new C0848e(null), 3, null);
        this.categoriesFlowJob = d10;
    }

    public final void N0() {
        w1();
        if (c1()) {
            t1();
            return;
        }
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new f(null), 3, null);
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new g(null), 3, null);
        if (Y0().m0()) {
            M0();
        } else {
            this.isCategoriesLoaded = true;
            w1();
        }
        L0();
        if (c1()) {
            return;
        }
        O0();
        P0();
    }

    public final void O0() {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new h(null), 3, null);
    }

    public final void P0() {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new i(null), 3, null);
    }

    public final void Q0() {
        C0 d10;
        C0 c02 = this.relatedArticlesFlowJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(AbstractC2194t.a(this), null, null, new j(null), 3, null);
        this.relatedArticlesFlowJob = d10;
    }

    public final void R0() {
        RecyclerView recyclerView = this.articlesRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
            recyclerView = null;
        }
        recyclerView.setOnTouchListener(null);
    }

    public final void S0() {
        SalesIQActivity h12 = h1();
        if (h12 != null) {
            h12.C0(this.isFirstArticlesFragment);
        }
        if (this.shouldRestoreSearchUI) {
            SalesIQActivity h13 = h1();
            if (h13 != null) {
                h13.y0(this.searchKey, true);
            }
            SalesIQActivity h14 = h1();
            if (h14 != null) {
                h14.invalidateOptionsMenu();
            }
            this.shouldRestoreSearchUI = false;
            SalesIQActivity h15 = h1();
            if (h15 != null) {
                h15.A0(8);
                return;
            }
            return;
        }
        SalesIQActivity h16 = h1();
        if (h16 != null) {
            h16.A0(0);
        }
        if (!c1()) {
            ArticlesViewModel.x(Y0(), null, 1, null);
            Y0().W(f1());
            if (e1() && f1()) {
                ArticlesViewModel.X(Y0(), false, 1, null);
            }
        }
        ArticlesViewModel.E(Y0(), null, false, (Y0().n0() || Y0().m0()) ? false : true, 3, null);
        E1(true);
    }

    public final void T0() {
        C0 d10;
        C0 c02;
        SalesIQActivity h12 = h1();
        if (h12 != null) {
            h12.A0(8);
        }
        U0(true);
        if (!this.isRecentlyViewedArticlesFromSearchLoaded) {
            this.isRecentlyViewedArticlesFromSearchLoaded = true;
            Y0().Y();
        }
        C0 c03 = this.recentlyViewedArticlesFromSearchJob;
        if (c03 != null && c03.isActive() && (c02 = this.recentlyViewedArticlesFromSearchJob) != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(AbstractC2194t.a(this), null, null, new k(null), 3, null);
        this.recentlyViewedArticlesFromSearchJob = d10;
    }

    public final void U0(boolean value) {
        Zf.l lVar;
        if (isVisible()) {
            this.isSearchUIVisible = value;
            Zf.l lVar2 = this.resourcesAdapter;
            if (lVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar = null;
            } else {
                lVar = lVar2;
            }
            Boolean bool = Boolean.TRUE;
            Zf.l.p(lVar, bool, bool, Boolean.valueOf(value), null, false, false, 24, null);
            SalesIQActivity h12 = h1();
            if (h12 != null) {
                h12.x0(null);
            }
            if (!value) {
                R0();
                this.searchKey = null;
                if (c1()) {
                    C0 c02 = this.articlesFlowJob;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    t1();
                    return;
                }
                return;
            }
            Zf.l lVar3 = this.resourcesAdapter;
            if (lVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar3 = null;
            }
            String str = this.searchKey;
            lVar3.n(str == null || str.length() == 0);
            V0();
            G1(this, false, 1, null);
            K1(this, null, null, null, null, null, null, false, false, 255, null);
        }
    }

    public final void V0() {
        RecyclerView recyclerView = this.articlesRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
            recyclerView = null;
        }
        recyclerView.setOnTouchListener(new View.OnTouchListener() { // from class: nf.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean W02;
                W02 = e.W0(view, motionEvent);
                return W02;
            }
        });
    }

    public final String X0() {
        String string = c1() ? getString(od.t.f61077n2) : j1();
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final ArticlesViewModel Y0() {
        return (ArticlesViewModel) this.articlesViewModel.getValue();
    }

    /* renamed from: Z0, reason: from getter */
    public final boolean getIsFirstArticlesFragment() {
        return this.isFirstArticlesFragment;
    }

    public final boolean a1() {
        if (!e1() && f1()) {
            return true;
        }
        if (!f1() || !e1()) {
            return false;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.articleSubCategoryTabButtonToggleGroup;
        if (materialButtonToggleGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleSubCategoryTabButtonToggleGroup");
            materialButtonToggleGroup = null;
        }
        return materialButtonToggleGroup.getCheckedButtonId() == od.q.f60468a8;
    }

    public final boolean b1() {
        String d12;
        Bundle arguments = getArguments();
        if (og.i.d(arguments != null ? Integer.valueOf(arguments.getInt("articles_count")) : null, 0) || o1()) {
            return true;
        }
        return (!p1() || (d12 = d1()) == null || d12.length() == 0) ? false : true;
    }

    public final boolean c1() {
        if (!Y0().n0() || !this.isFirstArticlesFragment) {
            return false;
        }
        List list = (List) Y0().P().getValue();
        return og.i.m(list != null ? Integer.valueOf(list.size()) : null) > 1;
    }

    @Override // bg.f
    public boolean e0(MenuItem menuItem) {
        U0(false);
        C0 c02 = this.recentlyViewedArticlesFromSearchJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        S0();
        return true;
    }

    public final boolean e1() {
        return Y0().S();
    }

    @Override // bg.f
    public boolean f0(MenuItem menuItem) {
        T0();
        return true;
    }

    public final boolean f1() {
        return Y0().T();
    }

    public final String g1() {
        return Y0().V();
    }

    public final SalesIQActivity h1() {
        AbstractActivityC2168s activity = getActivity();
        if (activity instanceof SalesIQActivity) {
            return (SalesIQActivity) activity;
        }
        return null;
    }

    public final ColorStateList i1() {
        return (ColorStateList) this.selectedTintColorState.getValue();
    }

    public final String j1() {
        return Y0().k0();
    }

    public final ColorStateList k1() {
        return (ColorStateList) this.unSelectedTintColorState.getValue();
    }

    public final void l1(boolean isDepartmentsToBeLoaded, boolean isSyncNeedToBeCompleted) {
        ProgressBar progressBar = null;
        if (s1() && (isDepartmentsToBeLoaded || isSyncNeedToBeCompleted)) {
            ProgressBar progressBar2 = this.articlesProgress;
            if (progressBar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articlesProgress");
            } else {
                progressBar = progressBar2;
            }
            progressBar.setVisibility(0);
            return;
        }
        ProgressBar progressBar3 = this.articlesProgress;
        if (progressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesProgress");
        } else {
            progressBar = progressBar3;
        }
        progressBar.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x0146, code lost:
    
        if (r1.isEmpty() != false) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1(String newText) {
        C0 c02;
        C0 c03;
        C0 c04;
        if (this.shouldRestoreSearchUI) {
            if (this.isFirstArticlesFragment) {
                List C02 = getChildFragmentManager().C0();
                Intrinsics.checkNotNullExpressionValue(C02, "getFragments(...)");
            }
            if (this.isFirstArticlesFragment) {
                return;
            }
            this.shouldRestoreSearchUI = false;
            return;
        }
        this.searchKey = newText;
        Zf.l lVar = this.resourcesAdapter;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
            lVar = null;
        }
        String str = this.searchKey;
        lVar.n(str == null || str.length() == 0);
        if (newText == null || newText.length() == 0) {
            Y0().v();
            if (c1()) {
                Y0().u();
                C0 c05 = this.articlesFlowJob;
                if (c05 != null) {
                    C0.a.b(c05, null, 1, null);
                }
                C0 c06 = this.categoriesFlowJob;
                if (c06 != null) {
                    C0.a.b(c06, null, 1, null);
                }
                K1(this, null, null, null, null, null, null, false, false, 255, null);
                C0 c07 = this.articlesFlowJob;
                if (c07 != null && c07.isActive() && (c04 = this.articlesFlowJob) != null) {
                    C0.a.b(c04, null, 1, null);
                }
                C0 c08 = this.categoriesFlowJob;
                if (c08 != null && c08.isActive() && (c03 = this.categoriesFlowJob) != null) {
                    C0.a.b(c03, null, 1, null);
                }
            }
            C0 c09 = this.relatedArticlesFlowJob;
            if (c09 == null || !c09.isActive() || (c02 = this.relatedArticlesFlowJob) == null) {
                return;
            }
            C0.a.b(c02, null, 1, null);
            return;
        }
        C0 c010 = this.recentlyViewedArticlesFromSearchJob;
        if (c010 != null) {
            C0.a.b(c010, null, 1, null);
        }
        Y0().r0(newText);
        ArticlesViewModel.E(Y0(), newText, false, c1(), 2, null);
        if (c1()) {
            List list = (List) Y0().P().getValue();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (StringsKt.contains((CharSequence) ((SalesIQResource.b) obj).a(), (CharSequence) newText, true)) {
                        arrayList.add(obj);
                    }
                }
                x1(arrayList);
            }
        } else {
            Y0().w(newText);
        }
        C0 c011 = this.relatedArticlesFlowJob;
        if (c011 == null || !c011.isActive()) {
            Q0();
        }
        C0 c012 = this.articlesFlowJob;
        if (c012 == null || !c012.isActive()) {
            L0();
            if (c1() || !Y0().m0()) {
                return;
            }
            C0 c013 = this.categoriesFlowJob;
            if (c013 == null || !c013.isActive()) {
                M0();
            }
        }
    }

    public final void n1(MaterialButtonToggleGroup materialButtonToggleGroup) {
        ViewGroup.LayoutParams layoutParams = materialButtonToggleGroup.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = 0;
        materialButtonToggleGroup.setLayoutParams(marginLayoutParams);
        materialButtonToggleGroup.setPadding(materialButtonToggleGroup.getPaddingLeft(), C6218a.b(16.0f), materialButtonToggleGroup.getPaddingRight(), materialButtonToggleGroup.getPaddingBottom());
    }

    public final boolean o1() {
        return (Y0().m0() || Y0().n0()) ? false : true;
    }

    @Override // bg.f
    public boolean onBackPressed() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Unit unit;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(od.r.f60820y, container, false);
        if (MobilistenUtil.m()) {
            inflate.setRotationY(180.0f);
        } else {
            inflate.setRotationY(0.0f);
        }
        if (this.resourcesAdapter == null) {
            this.resourcesAdapter = new Zf.l(new m());
        } else {
            this.isResourcesAdapterAlreadyInitialised = true;
        }
        SalesIQActivity h12 = h1();
        if (h12 != null) {
            h12.C0(this.isFirstArticlesFragment);
        }
        View findViewById = inflate.findViewById(od.q.f60677v0);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.articleSubCategoryTabButtonToggleGroup = (MaterialButtonToggleGroup) findViewById;
        View findViewById2 = inflate.findViewById(od.q.f60607o0);
        MaterialButton materialButton = (MaterialButton) findViewById2;
        materialButton.setBackgroundTintList(i1());
        materialButton.setTypeface(C6218a.C());
        materialButton.setChecked(true);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "apply(...)");
        this.articleTabButton = materialButton;
        View findViewById3 = inflate.findViewById(od.q.f60468a8);
        MaterialButton materialButton2 = (MaterialButton) findViewById3;
        materialButton2.setTypeface(C6218a.C());
        Intrinsics.checkNotNullExpressionValue(findViewById3, "apply(...)");
        this.subCategoryTabButton = materialButton2;
        View findViewById4 = inflate.findViewById(od.q.f60314L4);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.emptySearchResultViewGroup = (Group) findViewById4;
        Bundle arguments = getArguments();
        ProgressBar progressBar = null;
        if (arguments != null) {
            F1(true);
            this.isFirstArticlesFragment = arguments.getBoolean("is_first_page", false);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.isFirstArticlesFragment = true;
        }
        View findViewById5 = inflate.findViewById(od.q.f60657t0);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.articlesSearchProgress = (ProgressBar) findViewById5;
        View findViewById6 = inflate.findViewById(od.q.f60647s0);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById6;
        this.articlesRecyclerView = recyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
            recyclerView = null;
        }
        recyclerView.n(this.articlesListOnScrollListener);
        View findViewById7 = inflate.findViewById(od.q.f60334N4);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById(...)");
        this.emptyStateGroup = (Group) findViewById7;
        View findViewById8 = inflate.findViewById(od.q.f60354P4);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById(...)");
        this.emptyStateText = (TextView) findViewById8;
        View findViewById9 = inflate.findViewById(od.q.f60324M4);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "findViewById(...)");
        this.emptySearchStateText = (TextView) findViewById9;
        Typeface P10 = C6218a.P();
        TextView textView = this.emptySearchStateText;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptySearchStateText");
            textView = null;
        }
        textView.setTypeface(P10);
        TextView textView2 = this.emptyStateText;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyStateText");
            textView2 = null;
        }
        textView2.setTypeface(P10);
        View findViewById10 = inflate.findViewById(od.q.f60637r0);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "findViewById(...)");
        ProgressBar progressBar2 = (ProgressBar) findViewById10;
        this.articlesProgress = progressBar2;
        if (progressBar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesProgress");
        } else {
            progressBar = progressBar2;
        }
        Drawable indeterminateDrawable = progressBar.getIndeterminateDrawable();
        if (indeterminateDrawable == null) {
            return inflate;
        }
        indeterminateDrawable.setColorFilter(new PorterDuffColorFilter(com.zoho.livechat.android.utils.P.a(getContext()), PorterDuff.Mode.SRC_ATOP));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (this.isSearchUIVisible) {
            this.shouldRestoreSearchUI = true;
            SalesIQActivity h12 = h1();
            if (h12 != null) {
                h12.x0(null);
            }
        }
    }

    @Override // bg.f, androidx.fragment.app.Fragment
    public void onResume() {
        String string;
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("resource_id")) != null) {
            C1(string);
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                arguments2.putString("resource_id", null);
            }
        }
        super.onResume();
        S0();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String d12;
        String g12;
        Zf.l lVar;
        Zf.l lVar2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MaterialButton materialButton = this.articleTabButton;
        if (materialButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleTabButton");
            materialButton = null;
        }
        I0(materialButton);
        MaterialButton materialButton2 = this.subCategoryTabButton;
        if (materialButton2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("subCategoryTabButton");
            materialButton2 = null;
        }
        I0(materialButton2);
        RecyclerView recyclerView = this.articlesRecyclerView;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView recyclerView2 = this.articlesRecyclerView;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articlesRecyclerView");
            recyclerView2 = null;
        }
        Zf.l lVar3 = this.resourcesAdapter;
        if (lVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
            lVar3 = null;
        }
        recyclerView2.setAdapter(lVar3);
        if (!this.isResourcesAdapterAlreadyInitialised) {
            Zf.l lVar4 = this.resourcesAdapter;
            if (lVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar = null;
            } else {
                lVar = lVar4;
            }
            Zf.l.p(lVar, null, null, null, Boolean.valueOf(c1()), false, false, 55, null);
            if (f1() && e1()) {
                Zf.l lVar5 = this.resourcesAdapter;
                if (lVar5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                    lVar2 = null;
                } else {
                    lVar2 = lVar5;
                }
                Zf.l.p(lVar2, null, Boolean.FALSE, null, null, false, false, 45, null);
            }
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.articleSubCategoryTabButtonToggleGroup;
        if (materialButtonToggleGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleSubCategoryTabButtonToggleGroup");
            materialButtonToggleGroup = null;
        }
        materialButtonToggleGroup.setOnClickListener(new View.OnClickListener() { // from class: nf.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                e.z1(view2);
            }
        });
        MaterialButtonToggleGroup materialButtonToggleGroup2 = this.articleSubCategoryTabButtonToggleGroup;
        if (materialButtonToggleGroup2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("articleSubCategoryTabButtonToggleGroup");
            materialButtonToggleGroup2 = null;
        }
        materialButtonToggleGroup2.q(new MaterialButtonToggleGroup.b() { // from class: nf.c
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.b
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup3, int i10, boolean z10) {
                e.A1(e.this, materialButtonToggleGroup3, i10, z10);
            }
        });
        Bundle arguments = getArguments();
        if ((og.i.m(arguments != null ? Integer.valueOf(arguments.getInt("categories_count")) : null) > 0 || ((((d12 = d1()) != null && d12.length() != 0) || !Y0().n0()) && ((g12 = g1()) == null || g12.length() == 0))) && Y0().m0() && !c1()) {
            ArticlesViewModel Y02 = Y0();
            Bundle arguments2 = getArguments();
            Y02.t0(og.i.m(arguments2 != null ? Integer.valueOf(arguments2.getInt("articles_count")) : null) == 0);
        }
        I1();
        N0();
    }

    public final boolean p1() {
        return Y0().n0() && !Y0().m0();
    }

    public final boolean q1() {
        Group group = this.emptyStateGroup;
        if (group == null) {
            return false;
        }
        if (group == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyStateGroup");
            group = null;
        }
        return group.getVisibility() == 0;
    }

    public final boolean r1() {
        return Y0().I().getValue() == ArticlesViewModel.EnumC3866b.Initiated;
    }

    public final boolean s1() {
        return !this.isSearchUIVisible;
    }

    public final void t1() {
        AbstractC1459k.d(AbstractC2194t.a(this), null, null, new l(null), 3, null);
    }

    public final void u1() {
        if (this.shouldRestoreSearchUI) {
            return;
        }
        F1(og.i.g(g1()));
        this.isCategoriesLoaded = true;
        K1(this, null, null, null, null, null, null, false, false, 255, null);
        w1();
    }

    public final void v1() {
        if (this.shouldRestoreSearchUI) {
            return;
        }
        if (s1()) {
            F1(og.i.g(g1()));
        } else {
            G1(this, false, 1, null);
        }
        this.isArticlesLoaded = true;
        K1(this, null, null, null, null, null, null, false, false, 255, null);
        w1();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0164 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w1() {
        AbstractActivityC2168s activity;
        SalesIQActivity h12;
        String d12;
        boolean z10 = true;
        boolean z11 = c1() && !this.isDepartmentsLoaded;
        List C10 = Y0().C();
        int i10 = -1;
        int size = C10 != null ? C10.size() : e1() ? -1 : 0;
        List list = (List) Y0().z().getValue();
        if (list != null) {
            i10 = list.size();
        } else if (!Y0().m0()) {
            i10 = 0;
        }
        boolean z12 = !c1() && (!Y0().m0() ? this.isArticleSyncCompleted || size > 0 : i10 > 0 || size > 0 || (Y0().B().getValue() != null && (Y0().L().getValue() != null || this.isFirstArticlesFragment)));
        l1(z11, z12);
        Group group = null;
        ProgressBar progressBar = null;
        ProgressBar progressBar2 = null;
        Group group2 = null;
        if (!s1()) {
            int i11 = a.$EnumSwitchMapping$0[((ArticlesViewModel.EnumC3866b) Y0().I().getValue()).ordinal()];
            if (i11 == 1) {
                ProgressBar progressBar3 = this.articlesSearchProgress;
                if (progressBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articlesSearchProgress");
                    progressBar3 = null;
                }
                og.p.n(progressBar3);
                Group group3 = this.emptySearchResultViewGroup;
                if (group3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emptySearchResultViewGroup");
                } else {
                    group = group3;
                }
                og.p.n(group);
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                ProgressBar progressBar4 = this.articlesSearchProgress;
                if (progressBar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articlesSearchProgress");
                } else {
                    progressBar2 = progressBar4;
                }
                og.p.n(progressBar2);
                return;
            }
            ProgressBar progressBar5 = this.articlesSearchProgress;
            if (progressBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articlesSearchProgress");
                progressBar5 = null;
            }
            og.p.w(progressBar5);
            Group group4 = this.emptySearchResultViewGroup;
            if (group4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emptySearchResultViewGroup");
            } else {
                group2 = group4;
            }
            og.p.n(group2);
            return;
        }
        if (!c1() && !z12) {
            if (e1() || !(!p1() || (d12 = d1()) == null || d12.length() == 0)) {
                z10 = this.isArticlesReceivedAfterSyncCompletion;
            } else if (f1() || Y0().m0()) {
                z10 = this.isArticleCategoriesReceivedAfterSyncCompletion;
            } else if (!this.isArticlesReceivedAfterSyncCompletion && !this.isArticleCategoriesReceivedAfterSyncCompletion) {
                z10 = false;
            }
            if (z10 && size == 0 && i10 == 0) {
                Group group5 = this.emptyStateGroup;
                if (group5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("emptyStateGroup");
                    group5 = null;
                }
                group5.setVisibility(0);
                ProgressBar progressBar6 = this.articlesProgress;
                if (progressBar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("articlesProgress");
                } else {
                    progressBar = progressBar6;
                }
                progressBar.setVisibility(8);
                h12 = h1();
                if (h12 == null) {
                    h12.g0();
                    return;
                }
                return;
            }
        }
        Group group6 = this.emptyStateGroup;
        if (group6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emptyStateGroup");
            group6 = null;
        }
        group6.setVisibility(8);
        if (c1() || this.isArticlesReceivedAfterSyncCompletion || this.isArticleCategoriesReceivedAfterSyncCompletion) {
            ProgressBar progressBar7 = this.articlesProgress;
            if (progressBar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articlesProgress");
                progressBar7 = null;
            }
            og.p.n(progressBar7);
        } else {
            ProgressBar progressBar8 = this.articlesProgress;
            if (progressBar8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("articlesProgress");
                progressBar8 = null;
            }
            og.p.w(progressBar8);
        }
        if ((isVisible() ? this : null) != null && (activity = getActivity()) != null) {
            activity.invalidateOptionsMenu();
        }
        h12 = h1();
        if (h12 == null) {
        }
    }

    public final void x1(List departments) {
        Zf.l lVar;
        Zf.l lVar2;
        if (departments.isEmpty()) {
            this.isDepartmentsLoaded = false;
            Zf.l lVar3 = this.resourcesAdapter;
            if (lVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar = null;
            } else {
                lVar = lVar3;
            }
            Zf.l.p(lVar, null, Boolean.FALSE, null, null, false, false, 61, null);
        } else {
            Zf.l lVar4 = this.resourcesAdapter;
            if (lVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("resourcesAdapter");
                lVar2 = null;
            } else {
                lVar2 = lVar4;
            }
            Zf.l.p(lVar2, null, Boolean.TRUE, null, null, false, false, 61, null);
            this.isDepartmentsLoaded = true;
        }
        K1(this, null, null, null, null, null, null, false, false, 255, null);
    }

    public void y1(String text) {
        C0 d10;
        C0 c02 = this.typingStatusJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(AbstractC2194t.a(this), null, null, new n(text, this, null), 3, null);
        this.typingStatusJob = d10;
    }

    public static final void z1(View view) {
    }
}
