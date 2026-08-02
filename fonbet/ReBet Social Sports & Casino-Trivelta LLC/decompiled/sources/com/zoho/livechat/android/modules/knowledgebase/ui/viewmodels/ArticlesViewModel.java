package com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.P;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.lifecycle.AbstractC2176a;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import com.google.crypto.tink.integration.android.b;
import com.zoho.livechat.android.modules.knowledgebase.domain.entities.SalesIQResource;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.salesiqembed.ZohoSalesIQ;
import gf.C4378a;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import lb.C5444x;
import lf.d;
import lf.e;
import lf.f;
import lf.g;
import lf.h;
import me.C5582a;
import mf.C5583a;
import og.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import re.AbstractC6235a;
import td.C6461a;
import we.c;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010#\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 m2\u00020\u0001:\u0006«\u0001¬\u0001\u00ad\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\nJ'\u0010\u0011\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0018\u0010\u0017J-\u0010\u001b\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010\nJ\u0015\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000e¢\u0006\u0004\b!\u0010\u0017J\r\u0010\"\u001a\u00020\b¢\u0006\u0004\b\"\u0010\u0014J\r\u0010#\u001a\u00020\b¢\u0006\u0004\b#\u0010\u0014J!\u0010&\u001a\u00020\b2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b1\u00102R\u001b\u00107\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010,\u001a\u0004\b5\u00106R\u001b\u0010;\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010,\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\bH\u0010IR\u001b\u0010N\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bK\u0010,\u001a\u0004\bL\u0010MR\u001b\u0010Q\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bO\u0010,\u001a\u0004\bP\u0010MR)\u0010W\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020S\u0018\u00010\r0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bT\u0010,\u001a\u0004\bU\u0010VR)\u0010[\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020S\u0018\u00010\r0X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\bY\u0010ZR)\u0010^\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\\\u0018\u00010\r0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010,\u001a\u0004\bB\u0010VR)\u0010`\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\\\u0018\u00010\r0X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b_\u0010,\u001a\u0004\bG\u0010ZR\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010bR'\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010,\u001a\u0004\b_\u0010fR'\u0010l\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0h8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bi\u0010,\u001a\u0004\bj\u0010kR)\u0010n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\r0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010,\u001a\u0004\bm\u0010VR)\u0010q\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020$\u0018\u00010\r0X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bo\u0010,\u001a\u0004\bp\u0010ZR#\u0010t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010,\u001a\u0004\bo\u0010VR#\u0010v\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bu\u0010,\u001a\u0004\bs\u0010ZR!\u0010y\u001a\b\u0012\u0004\u0012\u00020w0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010,\u001a\u0004\be\u0010VR!\u0010z\u001a\b\u0012\u0004\u0012\u00020w0X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bU\u0010,\u001a\u0004\bi\u0010ZR#\u0010{\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bY\u0010,\u001a\u0004\bK\u0010VR#\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010r0X8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\bO\u0010ZR'\u0010~\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0R8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\b}\u0010VR)\u0010\u0081\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0X8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u007f\u0010,\u001a\u0005\b\u0080\u0001\u0010ZR*\u0010\u0084\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0R8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010,\u001a\u0005\b\u0083\u0001\u0010VR)\u0010\u0086\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0X8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\bH\u0010,\u001a\u0005\b\u0085\u0001\u0010ZR*\u0010\u0089\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0R8BX\u0082\u0084\u0002¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010,\u001a\u0005\b\u0088\u0001\u0010VR)\u0010\u008b\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\r0X8FX\u0086\u0084\u0002¢\u0006\r\n\u0004\b\u001f\u0010,\u001a\u0005\b\u008a\u0001\u0010ZR\u001e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R&\u0010\u0092\u0001\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u001d\u0010\u0088\u0001\u001a\u0005\b\u0090\u0001\u0010M\"\u0005\b\u0091\u0001\u0010\nR\u001c\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0094\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0094\u0001R\u001c\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0094\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0094\u0001R\u001b\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b}\u0010\u0094\u0001R\u001c\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0094\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010\u0088\u0001R\u0016\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u009c\u0001R\u0015\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0007\u001a\u0005\bx\u0010\u009c\u0001R\u0014\u0010 \u0001\u001a\u00020\u000e8F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u009c\u0001R\u0014\u0010£\u0001\u001a\u00030¡\u00018F¢\u0006\u0007\u001a\u0005\bu\u0010¢\u0001R\u0012\u0010¤\u0001\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u007f\u0010MR\u0013\u0010¥\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010MR\u001a\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\r8F¢\u0006\u0007\u001a\u0005\bT\u0010¦\u0001R\u0018\u0010ª\u0001\u001a\u00030§\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006®\u0001"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel;", "Landroidx/lifecycle/Q;", "Landroidx/lifecycle/J;", "savedStateHandle", "<init>", "(Landroidx/lifecycle/J;)V", "", "hasNoArticles", "", "t0", "(Z)V", "isInitialCall", "u0", "", "", "exceptionalIds", "searchKey", "f0", "(Ljava/util/List;Ljava/lang/String;)V", "q0", "()V", "query", "r0", "(Ljava/lang/String;)V", "w", "shouldIgnoreCategoryCheck", "shouldSearchFromAll", "D", "(Ljava/lang/String;ZZ)V", "Y", "fetchOnlyFromChildCategories", "W", "articleId", "p0", "u", "v", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$Data;", "articles", "w0", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "s", "Landroidx/lifecycle/J;", "Lgf/a;", "t", "Lkotlin/Lazy;", "G", "()Lgf/a;", "articlesRepository", "Llf/f;", "i0", "()Llf/f;", "syncArticleCategories", "Llf/g;", "j0", "()Llf/g;", "syncArticles", "Llf/c;", "Q", "()Llf/c;", "getArticleCategories", "Llf/h;", C5444x.f55808b, "l0", "()Llf/h;", "updateArticle", "Llf/d;", "y", "R", "()Llf/d;", "getArticles", "Llf/e;", "z", "U", "()Llf/e;", "knowledgeBaseConfiguration", "A", "n0", "()Z", "isArticleDepartmentClassifierEnabled", "B", "m0", "isArticleCategoryClassifierEnabled", "Lkotlinx/coroutines/flow/y;", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$b;", "C", "O", "()Lkotlinx/coroutines/flow/y;", "departmentsMutableStateFlow", "Lkotlinx/coroutines/flow/L;", "P", "()Lkotlinx/coroutines/flow/L;", "departmentsStateFlow", "Lcom/zoho/livechat/android/modules/knowledgebase/domain/entities/SalesIQResource$a;", "E", "articleCategoriesMutableStateFlow", "F", "articleCategoriesStateFlow", "", "Ljava/util/List;", "_articles", "Lkotlinx/coroutines/flow/x;", "H", "()Lkotlinx/coroutines/flow/x;", "articlesMutableSharedFlow", "Lkotlinx/coroutines/flow/C;", "I", "J", "()Lkotlinx/coroutines/flow/C;", "articlesStateFlow", "g0", "relatedArticlesMutableStateFlow", "K", "h0", "relatedArticlesStateFlow", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel$DataSync;", "L", "articlesSyncCompletionMutableStateFlow", "M", "articlesSyncCompletionStateFlow", "Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel$b;", "N", "articlesSearchSyncCompletionMutableStateFlow", "articlesSearchSyncCompletionStateFlow", "articleCategoriesSyncCompletionMutableStateFlow", "articleCategoriesSyncCompletionStateFlow", "d0", "recentlyViewedArticlesMutableStateFlow", "S", "e0", "recentlyViewedArticlesStateFlow", "T", "b0", "recentlyViewedArticlesIncludingItsChildCategoriesMutableStateFlow", "c0", "recentlyViewedArticlesIncludingItsChildCategoriesStateFlow", "V", "Z", "recentlyViewedArticlesFromSearchMutableStateFlow", "a0", "recentlyViewedArticlesFromSearchStateFlow", "", "X", "Ljava/util/Set;", "searchedKeys", "o0", "s0", "isArticlesSyncInProgress", "LPh/C0;", "LPh/C0;", "searchArticlesJob", "getArticlesFlowJob", "getRelatedArticlesFlowJob", "getRecentlyViewedArticlesFlowJob", "getRecentlyViewedArticlesFromChildCategoriesFlowJob", "getArticleCategoriesFlowJob", "isArticlesCollectedOnceAfterSyncCompletion", "()Ljava/lang/String;", "parentCategoryId", "departmentId", "k0", "title", "", "()I", "categoriesCountFromArguments", "hasArticle", "hasCategory", "()Ljava/util/List;", "LPh/P;", "getAppScope", "()LPh/P;", "appScope", "a", "DataSync", b.f37029b, "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ArticlesViewModel extends Q {

    /* renamed from: g0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final Lazy isArticleDepartmentClassifierEnabled;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public final Lazy isArticleCategoryClassifierEnabled;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public final Lazy departmentsMutableStateFlow;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    public final Lazy departmentsStateFlow;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleCategoriesMutableStateFlow;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleCategoriesStateFlow;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    public List _articles;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesMutableSharedFlow;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesStateFlow;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    public final Lazy relatedArticlesMutableStateFlow;

    /* renamed from: K, reason: collision with root package name and from kotlin metadata */
    public final Lazy relatedArticlesStateFlow;

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesSyncCompletionMutableStateFlow;

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesSyncCompletionStateFlow;

    /* renamed from: N, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesSearchSyncCompletionMutableStateFlow;

    /* renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesSearchSyncCompletionStateFlow;

    /* renamed from: P, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleCategoriesSyncCompletionMutableStateFlow;

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    public final Lazy articleCategoriesSyncCompletionStateFlow;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    public final Lazy recentlyViewedArticlesMutableStateFlow;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    public final Lazy recentlyViewedArticlesStateFlow;

    /* renamed from: T, reason: collision with root package name and from kotlin metadata */
    public final Lazy recentlyViewedArticlesIncludingItsChildCategoriesMutableStateFlow;

    /* renamed from: U, reason: collision with root package name and from kotlin metadata */
    public final Lazy recentlyViewedArticlesIncludingItsChildCategoriesStateFlow;

    /* renamed from: V, reason: collision with root package name and from kotlin metadata */
    public final Lazy recentlyViewedArticlesFromSearchMutableStateFlow;

    /* renamed from: W, reason: collision with root package name and from kotlin metadata */
    public final Lazy recentlyViewedArticlesFromSearchStateFlow;

    /* renamed from: X, reason: collision with root package name and from kotlin metadata */
    public final Set searchedKeys;

    /* renamed from: Y, reason: collision with root package name and from kotlin metadata */
    public boolean isArticlesSyncInProgress;

    /* renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public C0 searchArticlesJob;

    /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
    public C0 getArticlesFlowJob;

    /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
    public C0 getRelatedArticlesFlowJob;

    /* renamed from: c0, reason: collision with root package name and from kotlin metadata */
    public C0 getRecentlyViewedArticlesFlowJob;

    /* renamed from: d0, reason: collision with root package name and from kotlin metadata */
    public C0 getRecentlyViewedArticlesFromChildCategoriesFlowJob;

    /* renamed from: e0, reason: collision with root package name and from kotlin metadata */
    public C0 getArticleCategoriesFlowJob;

    /* renamed from: f0, reason: collision with root package name and from kotlin metadata */
    public boolean isArticlesCollectedOnceAfterSyncCompletion;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final androidx.lifecycle.J savedStateHandle;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Lazy articlesRepository;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncArticleCategories;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncArticles;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy getArticleCategories;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public final Lazy updateArticle;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public final Lazy getArticles;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public final Lazy knowledgeBaseConfiguration;

    public static final class A extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43643n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43645p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(String str, Continuation continuation) {
            super(2, continuation);
            this.f43645p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new A(this.f43645p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((A) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43643n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                h l02 = ArticlesViewModel.this.l0();
                String str = this.f43645p;
                this.f43643n = 1;
                if (l02.b(str, this) == coroutine_suspended) {
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

    public static final class B extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final B f43646d = new B();

        public B() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(CollectionsKt.emptyList());
        }
    }

    public static final class C extends Lambda implements Function0 {
        public C() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.Z();
        }
    }

    public static final class D extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final D f43648d = new D();

        public D() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(CollectionsKt.emptyList());
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel$DataSync;", "", "isSynced", "", "gotData", "(ZLjava/lang/Boolean;)V", "getGotData", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "()Z", "component1", "component2", "copy", "(ZLjava/lang/Boolean;)Lcom/zoho/livechat/android/modules/knowledgebase/ui/viewmodels/ArticlesViewModel$DataSync;", "equals", "other", "hashCode", "", "toString", "", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DataSync {

        @Nullable
        private final Boolean gotData;
        private final boolean isSynced;

        public DataSync(boolean z10, @Nullable Boolean bool) {
            this.isSynced = z10;
            this.gotData = bool;
        }

        public static /* synthetic */ DataSync copy$default(DataSync dataSync, boolean z10, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = dataSync.isSynced;
            }
            if ((i10 & 2) != 0) {
                bool = dataSync.gotData;
            }
            return dataSync.copy(z10, bool);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsSynced() {
            return this.isSynced;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getGotData() {
            return this.gotData;
        }

        @NotNull
        public final DataSync copy(boolean isSynced, @Nullable Boolean gotData) {
            return new DataSync(isSynced, gotData);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataSync)) {
                return false;
            }
            DataSync dataSync = (DataSync) other;
            return this.isSynced == dataSync.isSynced && Intrinsics.areEqual(this.gotData, dataSync.gotData);
        }

        @Nullable
        public final Boolean getGotData() {
            return this.gotData;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z10 = this.isSynced;
            ?? r02 = z10;
            if (z10) {
                r02 = 1;
            }
            int i10 = r02 * 31;
            Boolean bool = this.gotData;
            return i10 + (bool == null ? 0 : bool.hashCode());
        }

        public final boolean isSynced() {
            return this.isSynced;
        }

        @NotNull
        public String toString() {
            return "DataSync(isSynced=" + this.isSynced + ", gotData=" + this.gotData + ')';
        }
    }

    public static final class E extends Lambda implements Function0 {
        public E() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.b0();
        }
    }

    public static final class F extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final F f43650d = new F();

        public F() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(CollectionsKt.emptyList());
        }
    }

    public static final class G extends Lambda implements Function0 {
        public G() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.d0();
        }
    }

    public static final class H extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final H f43652d = new H();

        public H() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(null);
        }
    }

    public static final class I extends Lambda implements Function0 {
        public I() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.g0();
        }
    }

    public static final class J extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43654n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43656p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(String str, Continuation continuation) {
            super(2, continuation);
            this.f43656p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new J(this.f43656p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((J) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            J j10;
            AbstractC6235a abstractC6235a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43654n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                g j02 = ArticlesViewModel.this.j0();
                String str = this.f43656p;
                this.f43654n = 1;
                j10 = this;
                obj = g.b(j02, null, null, str, false, j10, 11, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                j10 = this;
            }
            C5582a c5582a = (C5582a) obj;
            ArticlesViewModel articlesViewModel = ArticlesViewModel.this;
            String str2 = j10.f43656p;
            if (c5582a.d()) {
                ((Boolean) c5582a.b()).getClass();
                articlesViewModel.searchedKeys.add(str2);
            }
            AbstractC6235a.c cVar = AbstractC6235a.c.KnowledgeBase;
            if (!c5582a.d()) {
                C5582a.b c10 = c5582a.c();
                if (c10 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c10, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c11 = c5582a.c();
                Intrinsics.checkNotNull(c11, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (abstractC6235a.a() > 0) {
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                } else {
                    C5583a.v(ZohoSalesIQ.k.Articles, C5583a.EnumC0818a.ErrorOccurred, null, new c.b(c11.c()));
                }
            }
            ArticlesViewModel.this.H().setValue(EnumC3866b.Completed);
            return Unit.INSTANCE;
        }
    }

    public static final class K extends Lambda implements Function0 {
        public K() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final f invoke() {
            return new f(ArticlesViewModel.this.G());
        }
    }

    public static final class L extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43658n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f43660p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f43660p = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new L(this.f43660p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((L) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC6235a abstractC6235a;
            Integer b10;
            C5582a.b c10;
            Integer b11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43658n;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                f i02 = ArticlesViewModel.this.i0();
                String N10 = ArticlesViewModel.this.N();
                String V10 = ArticlesViewModel.this.V();
                boolean z11 = this.f43660p;
                this.f43658n = 1;
                obj = i02.a(N10, V10, z11, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            C5582a c5582a = (C5582a) obj;
            kotlinx.coroutines.flow.y A10 = ArticlesViewModel.this.A();
            if (!c5582a.d() && ((c10 = c5582a.c()) == null || (b11 = c10.b()) == null || b11.intValue() != 600)) {
                z10 = false;
            }
            C5582a.b c11 = c5582a.c();
            A10.setValue(new DataSync(z10, (c11 == null || (b10 = c11.b()) == null || b10.intValue() != 600) ? Boxing.boxBoolean(i.i((Boolean) c5582a.b())) : null));
            AbstractC6235a.c cVar = AbstractC6235a.c.KnowledgeBase;
            if (!c5582a.d()) {
                C5582a.b c12 = c5582a.c();
                if (c12 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c12, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c13 = c5582a.c();
                Intrinsics.checkNotNull(c13, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (abstractC6235a.a() > 0 && abstractC6235a.a() != 600) {
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                    C5583a.v(ZohoSalesIQ.k.Articles, C5583a.EnumC0818a.ErrorOccurred, null, new c.a(c13.c()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class M extends Lambda implements Function0 {
        public M() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final g invoke() {
            return new g(ArticlesViewModel.this.G());
        }
    }

    public static final class N extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43662n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f43664p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public N(boolean z10, Continuation continuation) {
            super(2, continuation);
            this.f43664p = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new N(this.f43664p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((N) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            N n10;
            AbstractC6235a abstractC6235a;
            Integer b10;
            C5582a.b c10;
            Integer b11;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43662n;
            boolean z10 = true;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                g j02 = ArticlesViewModel.this.j0();
                String N10 = ArticlesViewModel.this.N();
                String V10 = ArticlesViewModel.this.V();
                boolean z11 = this.f43664p;
                this.f43662n = 1;
                n10 = this;
                obj = g.b(j02, N10, V10, null, z11, n10, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                n10 = this;
            }
            C5582a c5582a = (C5582a) obj;
            if (n10.f43664p) {
                kotlinx.coroutines.flow.y K10 = ArticlesViewModel.this.K();
                if (!c5582a.d() && ((c10 = c5582a.c()) == null || (b11 = c10.b()) == null || b11.intValue() != 600)) {
                    z10 = false;
                }
                C5582a.b c11 = c5582a.c();
                K10.setValue(new DataSync(z10, (c11 == null || (b10 = c11.b()) == null || b10.intValue() != 600) ? Boxing.boxBoolean(i.i((Boolean) c5582a.b())) : null));
            }
            ArticlesViewModel.this.s0(false);
            AbstractC6235a.c cVar = AbstractC6235a.c.KnowledgeBase;
            if (!c5582a.d()) {
                C5582a.b c12 = c5582a.c();
                if (c12 == null || (abstractC6235a = AbstractC6235a.f64111c.a(c12, cVar)) == null) {
                    abstractC6235a = AbstractC6235a.b.f64114d;
                }
                C5582a.b c13 = c5582a.c();
                Intrinsics.checkNotNull(c13, "null cannot be cast to non-null type com.zoho.livechat.android.modules.common.result.SalesIQResult.Error");
                if (abstractC6235a.a() > 0 && abstractC6235a.a() != 600) {
                    MobilistenUtil.z(abstractC6235a.b(), 0, 2, null);
                    C5583a.v(ZohoSalesIQ.k.Articles, C5583a.EnumC0818a.ErrorOccurred, null, new c.C0962c(c13.c()));
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class O extends Lambda implements Function0 {
        public O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(ArticlesViewModel.this.G());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$a, reason: case insensitive filesystem and from kotlin metadata */
    public static final class Companion {

        /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$a$a, reason: collision with other inner class name */
        public static final class C0628a extends AbstractC2176a {
            public C0628a(B2.g gVar, Bundle bundle) {
                super(gVar, bundle);
            }

            @Override // androidx.lifecycle.AbstractC2176a
            public Q c(String key, Class modelClass, androidx.lifecycle.J handle) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(handle, "handle");
                return new ArticlesViewModel(handle);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC2176a a(B2.g owner, Bundle bundle) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return new C0628a(owner, bundle);
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$b, reason: case insensitive filesystem */
    public static final class EnumC3866b {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EnumC3866b[] $VALUES;
        public static final EnumC3866b NotInitiated = new EnumC3866b("NotInitiated", 0);
        public static final EnumC3866b Initiated = new EnumC3866b("Initiated", 1);
        public static final EnumC3866b Completed = new EnumC3866b("Completed", 2);

        private static final /* synthetic */ EnumC3866b[] $values() {
            return new EnumC3866b[]{NotInitiated, Initiated, Completed};
        }

        static {
            EnumC3866b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EnumC3866b(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<EnumC3866b> getEntries() {
            return $ENTRIES;
        }

        public static EnumC3866b valueOf(String str) {
            return (EnumC3866b) Enum.valueOf(EnumC3866b.class, str);
        }

        public static EnumC3866b[] values() {
            return (EnumC3866b[]) $VALUES.clone();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$c, reason: case insensitive filesystem */
    public static final class C3867c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3867c f43666d = new C3867c();

        public C3867c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(null);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$d, reason: case insensitive filesystem */
    public static final class C3868d extends Lambda implements Function0 {
        public C3868d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.y();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$e, reason: case insensitive filesystem */
    public static final class C3869e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3869e f43668d = new C3869e();

        public C3869e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(null);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$f, reason: case insensitive filesystem */
    public static final class C3870f extends Lambda implements Function0 {
        public C3870f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.A();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$g, reason: case insensitive filesystem */
    public static final class C3871g extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3871g f43670d = new C3871g();

        public C3871g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.x invoke() {
            return kotlinx.coroutines.flow.E.b(0, 0, null, 7, null);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$h, reason: case insensitive filesystem */
    public static final class C3872h extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3872h f43671d = new C3872h();

        public C3872h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C4378a invoke() {
            C4378a.C0690a c0690a = C4378a.f47249d;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0690a.a(e10);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$i, reason: case insensitive filesystem */
    public static final class C3873i extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3873i f43672d = new C3873i();

        public C3873i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(EnumC3866b.NotInitiated);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$j, reason: case insensitive filesystem */
    public static final class C3874j extends Lambda implements Function0 {
        public C3874j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.H();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$k, reason: case insensitive filesystem */
    public static final class C3875k extends Lambda implements Function0 {
        public C3875k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.x invoke() {
            return ArticlesViewModel.this.F();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$l, reason: case insensitive filesystem */
    public static final class C3876l extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C3876l f43675d = new C3876l();

        public C3876l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(null);
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$m, reason: case insensitive filesystem */
    public static final class C3877m extends Lambda implements Function0 {
        public C3877m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.K();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$n, reason: case insensitive filesystem */
    public static final class C3878n extends Lambda implements Function0 {
        public C3878n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return kotlinx.coroutines.flow.N.a(ArticlesViewModel.this.U().e().b());
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.knowledgebase.ui.viewmodels.ArticlesViewModel$o, reason: case insensitive filesystem */
    public static final class C3879o extends Lambda implements Function0 {
        public C3879o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlinx.coroutines.flow.y invoke() {
            return ArticlesViewModel.this.O();
        }
    }

    public static final class p extends Lambda implements Function0 {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final lf.c invoke() {
            return new lf.c(ArticlesViewModel.this.G());
        }
    }

    public static final class q extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43680n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43682p;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticlesViewModel f43683a;

            public a(ArticlesViewModel articlesViewModel) {
                this.f43683a = articlesViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                this.f43683a.y().setValue(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, Continuation continuation) {
            super(2, continuation);
            this.f43682p = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new q(this.f43682p, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((q) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43680n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ArticlesViewModel.this.Q().b(ArticlesViewModel.this.V(), ArticlesViewModel.this.N(), this.f43682p).b();
                if (interfaceC5321f != null) {
                    a aVar = new a(ArticlesViewModel.this);
                    this.f43680n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class r extends Lambda implements Function0 {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d(ArticlesViewModel.this.G());
        }
    }

    public static final class s extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43685n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f43687p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ boolean f43688q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f43689r;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticlesViewModel f43690a;

            public a(ArticlesViewModel articlesViewModel) {
                this.f43690a = articlesViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                if (i.e(this.f43690a.L().getValue())) {
                    this.f43690a.isArticlesCollectedOnceAfterSyncCompletion = true;
                }
                Object w02 = this.f43690a.w0(list, continuation);
                return w02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? w02 : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String str, boolean z10, boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f43687p = str;
            this.f43688q = z10;
            this.f43689r = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new s(this.f43687p, this.f43688q, this.f43689r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((s) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43685n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ArticlesViewModel.this.R().g(ArticlesViewModel.this.N(), ArticlesViewModel.this.V(), this.f43687p, this.f43688q, this.f43689r).b();
                if (interfaceC5321f != null) {
                    a aVar = new a(ArticlesViewModel.this);
                    this.f43685n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class t extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43691n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticlesViewModel f43693a;

            public a(ArticlesViewModel articlesViewModel) {
                this.f43693a = articlesViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                this.f43693a.b0().setValue(list);
                return Unit.INSTANCE;
            }
        }

        public t(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new t(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((t) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43691n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ArticlesViewModel.this.R().c(ArticlesViewModel.this.N(), ArticlesViewModel.this.V(), true).b();
                if (interfaceC5321f != null) {
                    a aVar = new a(ArticlesViewModel.this);
                    this.f43691n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class u extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43694n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticlesViewModel f43696a;

            public a(ArticlesViewModel articlesViewModel) {
                this.f43696a = articlesViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                this.f43696a.d0().setValue(list);
                return Unit.INSTANCE;
            }
        }

        public u(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new u(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((u) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43694n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) d.d(ArticlesViewModel.this.R(), ArticlesViewModel.this.N(), ArticlesViewModel.this.V(), false, 4, null).b();
                if (interfaceC5321f != null) {
                    a aVar = new a(ArticlesViewModel.this);
                    this.f43694n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class v extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43697n;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticlesViewModel f43699a;

            public a(ArticlesViewModel articlesViewModel) {
                this.f43699a = articlesViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                this.f43699a.Z().setValue(list);
                return Unit.INSTANCE;
            }
        }

        public v(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new v(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((v) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43697n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ArticlesViewModel.this.R().e().b();
                if (interfaceC5321f != null) {
                    a aVar = new a(ArticlesViewModel.this);
                    this.f43697n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class w extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f43700n;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ List f43702p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ String f43703q;

        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ArticlesViewModel f43704a;

            public a(ArticlesViewModel articlesViewModel) {
                this.f43704a = articlesViewModel;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(List list, Continuation continuation) {
                this.f43704a.g0().setValue(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(List list, String str, Continuation continuation) {
            super(2, continuation);
            this.f43702p = list;
            this.f43703q = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ArticlesViewModel.this.new w(this.f43702p, this.f43703q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((w) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f43700n;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC5321f interfaceC5321f = (InterfaceC5321f) ArticlesViewModel.this.R().f(this.f43702p, this.f43703q).b();
                if (interfaceC5321f != null) {
                    a aVar = new a(ArticlesViewModel.this);
                    this.f43700n = 1;
                    if (interfaceC5321f.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class x extends Lambda implements Function0 {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean bool = (Boolean) ArticlesViewModel.this.U().g().b();
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    public static final class y extends Lambda implements Function0 {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            Boolean bool = (Boolean) ArticlesViewModel.this.U().h().b();
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
    }

    public static final class z extends Lambda implements Function0 {
        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e invoke() {
            return new e(ArticlesViewModel.this.G());
        }
    }

    public ArticlesViewModel(@NotNull androidx.lifecycle.J savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this.articlesRepository = LazyKt.lazy(C3872h.f43671d);
        this.syncArticleCategories = LazyKt.lazy(new K());
        this.syncArticles = LazyKt.lazy(new M());
        this.getArticleCategories = LazyKt.lazy(new p());
        this.updateArticle = LazyKt.lazy(new O());
        this.getArticles = LazyKt.lazy(new r());
        this.knowledgeBaseConfiguration = LazyKt.lazy(new z());
        this.isArticleDepartmentClassifierEnabled = LazyKt.lazy(new y());
        this.isArticleCategoryClassifierEnabled = LazyKt.lazy(new x());
        this.departmentsMutableStateFlow = LazyKt.lazy(new C3878n());
        this.departmentsStateFlow = LazyKt.lazy(new C3879o());
        this.articleCategoriesMutableStateFlow = LazyKt.lazy(C3867c.f43666d);
        this.articleCategoriesStateFlow = LazyKt.lazy(new C3868d());
        this.articlesMutableSharedFlow = LazyKt.lazy(C3871g.f43670d);
        this.articlesStateFlow = LazyKt.lazy(new C3875k());
        this.relatedArticlesMutableStateFlow = LazyKt.lazy(H.f43652d);
        this.relatedArticlesStateFlow = LazyKt.lazy(new I());
        this.articlesSyncCompletionMutableStateFlow = LazyKt.lazy(C3876l.f43675d);
        this.articlesSyncCompletionStateFlow = LazyKt.lazy(new C3877m());
        this.articlesSearchSyncCompletionMutableStateFlow = LazyKt.lazy(C3873i.f43672d);
        this.articlesSearchSyncCompletionStateFlow = LazyKt.lazy(new C3874j());
        this.articleCategoriesSyncCompletionMutableStateFlow = LazyKt.lazy(C3869e.f43668d);
        this.articleCategoriesSyncCompletionStateFlow = LazyKt.lazy(new C3870f());
        this.recentlyViewedArticlesMutableStateFlow = LazyKt.lazy(F.f43650d);
        this.recentlyViewedArticlesStateFlow = LazyKt.lazy(new G());
        this.recentlyViewedArticlesIncludingItsChildCategoriesMutableStateFlow = LazyKt.lazy(D.f43648d);
        this.recentlyViewedArticlesIncludingItsChildCategoriesStateFlow = LazyKt.lazy(new E());
        this.recentlyViewedArticlesFromSearchMutableStateFlow = LazyKt.lazy(B.f43646d);
        this.recentlyViewedArticlesFromSearchStateFlow = LazyKt.lazy(new C());
        this.searchedKeys = new LinkedHashSet();
    }

    public static /* synthetic */ void E(ArticlesViewModel articlesViewModel, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = !articlesViewModel.m0();
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        articlesViewModel.D(str, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C4378a G() {
        return (C4378a) this.articlesRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d R() {
        return (d) this.getArticles.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e U() {
        return (e) this.knowledgeBaseConfiguration.getValue();
    }

    public static /* synthetic */ void X(ArticlesViewModel articlesViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        articlesViewModel.W(z10);
    }

    private final P getAppScope() {
        return C6461a.f65810a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g j0() {
        return (g) this.syncArticles.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h l0() {
        return (h) this.updateArticle.getValue();
    }

    public static /* synthetic */ void v0(ArticlesViewModel articlesViewModel, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        articlesViewModel.u0(z10);
    }

    public static /* synthetic */ void x(ArticlesViewModel articlesViewModel, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        articlesViewModel.w(str);
    }

    public final kotlinx.coroutines.flow.y A() {
        return (kotlinx.coroutines.flow.y) this.articleCategoriesSyncCompletionMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L B() {
        return (kotlinx.coroutines.flow.L) this.articleCategoriesSyncCompletionStateFlow.getValue();
    }

    public final List C() {
        List list = this._articles;
        if (list != null) {
            return CollectionsKt.toList(list);
        }
        return null;
    }

    public final void D(String searchKey, boolean shouldIgnoreCategoryCheck, boolean shouldSearchFromAll) {
        C0 d10;
        C0 c02 = this.getArticlesFlowJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(S.a(this), null, null, new s(searchKey, shouldIgnoreCategoryCheck, shouldSearchFromAll, null), 3, null);
        this.getArticlesFlowJob = d10;
    }

    public final kotlinx.coroutines.flow.x F() {
        return (kotlinx.coroutines.flow.x) this.articlesMutableSharedFlow.getValue();
    }

    public final kotlinx.coroutines.flow.y H() {
        return (kotlinx.coroutines.flow.y) this.articlesSearchSyncCompletionMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L I() {
        return (kotlinx.coroutines.flow.L) this.articlesSearchSyncCompletionStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.C J() {
        return (kotlinx.coroutines.flow.C) this.articlesStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.y K() {
        return (kotlinx.coroutines.flow.y) this.articlesSyncCompletionMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L L() {
        return (kotlinx.coroutines.flow.L) this.articlesSyncCompletionStateFlow.getValue();
    }

    public final int M() {
        return i.k((Integer) this.savedStateHandle.a("categories_count"));
    }

    public final String N() {
        List list;
        String str = (String) this.savedStateHandle.a("department_id");
        if (str != null) {
            return str;
        }
        if (!n0() || (list = (List) P().getValue()) == null || list.size() != 1) {
            return null;
        }
        Object value = P().getValue();
        Intrinsics.checkNotNull(value);
        return ((SalesIQResource.b) CollectionsKt.first((List) value)).getId();
    }

    public final kotlinx.coroutines.flow.y O() {
        return (kotlinx.coroutines.flow.y) this.departmentsMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L P() {
        return (kotlinx.coroutines.flow.L) this.departmentsStateFlow.getValue();
    }

    public final lf.c Q() {
        return (lf.c) this.getArticleCategories.getValue();
    }

    public final boolean S() {
        int k10;
        if (i.e(L().getValue()) && this.isArticlesCollectedOnceAfterSyncCompletion) {
            return C() != null ? !r0.isEmpty() : i.k((Integer) this.savedStateHandle.a("articles_count")) > 0;
        }
        if (C() == null || !(!r0.isEmpty())) {
            k10 = i.k((Integer) this.savedStateHandle.a("articles_count"));
        } else {
            List C10 = C();
            Intrinsics.checkNotNull(C10);
            k10 = C10.size();
        }
        return k10 > 0;
    }

    public final boolean T() {
        return ((List) z().getValue()) != null ? !r0.isEmpty() : i.k((Integer) this.savedStateHandle.a("categories_count")) > 0;
    }

    public final String V() {
        return (String) this.savedStateHandle.a("parent_category_id");
    }

    public final void W(boolean fetchOnlyFromChildCategories) {
        C0 d10;
        C0 d11;
        if (fetchOnlyFromChildCategories) {
            d11 = AbstractC1459k.d(S.a(this), null, null, new t(null), 3, null);
            this.getRecentlyViewedArticlesFromChildCategoriesFlowJob = d11;
        } else {
            d10 = AbstractC1459k.d(S.a(this), null, null, new u(null), 3, null);
            this.getRecentlyViewedArticlesFlowJob = d10;
        }
    }

    public final void Y() {
        AbstractC1459k.d(S.a(this), null, null, new v(null), 3, null);
    }

    public final kotlinx.coroutines.flow.y Z() {
        return (kotlinx.coroutines.flow.y) this.recentlyViewedArticlesFromSearchMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L a0() {
        return (kotlinx.coroutines.flow.L) this.recentlyViewedArticlesFromSearchStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.y b0() {
        return (kotlinx.coroutines.flow.y) this.recentlyViewedArticlesIncludingItsChildCategoriesMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L c0() {
        return (kotlinx.coroutines.flow.L) this.recentlyViewedArticlesIncludingItsChildCategoriesStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.y d0() {
        return (kotlinx.coroutines.flow.y) this.recentlyViewedArticlesMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L e0() {
        return (kotlinx.coroutines.flow.L) this.recentlyViewedArticlesStateFlow.getValue();
    }

    public final void f0(List exceptionalIds, String searchKey) {
        C0 d10;
        Intrinsics.checkNotNullParameter(exceptionalIds, "exceptionalIds");
        C0 c02 = this.getRelatedArticlesFlowJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(S.a(this), null, null, new w(exceptionalIds, searchKey, null), 3, null);
        this.getRelatedArticlesFlowJob = d10;
    }

    public final kotlinx.coroutines.flow.y g0() {
        return (kotlinx.coroutines.flow.y) this.relatedArticlesMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L h0() {
        return (kotlinx.coroutines.flow.L) this.relatedArticlesStateFlow.getValue();
    }

    public final f i0() {
        return (f) this.syncArticleCategories.getValue();
    }

    public final String k0() {
        String str = (String) this.savedStateHandle.a("title");
        if (str != null) {
            return str;
        }
        String customArticleTitle = LiveChatUtil.getCustomArticleTitle();
        if (customArticleTitle != null) {
            return customArticleTitle;
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        Intrinsics.checkNotNull(e10);
        String string = e10.getString(od.t.f61045i5);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final boolean m0() {
        return ((Boolean) this.isArticleCategoryClassifierEnabled.getValue()).booleanValue();
    }

    public final boolean n0() {
        return ((Boolean) this.isArticleDepartmentClassifierEnabled.getValue()).booleanValue();
    }

    /* renamed from: o0, reason: from getter */
    public final boolean getIsArticlesSyncInProgress() {
        return this.isArticlesSyncInProgress;
    }

    public final void p0(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        AbstractC1459k.d(S.a(this), null, null, new A(articleId, null), 3, null);
    }

    public final void q0() {
        K().setValue(new DataSync(true, Boolean.TRUE));
    }

    public final void r0(String query) {
        C0 d10;
        Intrinsics.checkNotNullParameter(query, "query");
        if (query.length() <= 0 || this.searchedKeys.contains(query)) {
            return;
        }
        H().setValue(EnumC3866b.Initiated);
        C0 c02 = this.searchArticlesJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        d10 = AbstractC1459k.d(getAppScope(), null, null, new J(query, null), 3, null);
        this.searchArticlesJob = d10;
    }

    public final void s0(boolean z10) {
        this.isArticlesSyncInProgress = z10;
    }

    public final void t0(boolean hasNoArticles) {
        AbstractC1459k.d(getAppScope(), null, null, new L(hasNoArticles, null), 3, null);
    }

    public final void u() {
        List list = this._articles;
        if (list != null) {
            list.clear();
        }
    }

    public final void u0(boolean isInitialCall) {
        if (this.isArticlesSyncInProgress) {
            return;
        }
        this.isArticlesSyncInProgress = true;
        AbstractC1459k.d(getAppScope(), null, null, new N(isInitialCall, null), 3, null);
    }

    public final void v() {
        g0().setValue(null);
    }

    public final void w(String searchKey) {
        C0 d10;
        if (m0()) {
            C0 c02 = this.getArticleCategoriesFlowJob;
            if (c02 != null) {
                C0.a.b(c02, null, 1, null);
                y().setValue(null);
            }
            d10 = AbstractC1459k.d(S.a(this), null, null, new q(searchKey, null), 3, null);
            this.getArticleCategoriesFlowJob = d10;
        }
    }

    public final Object w0(List list, Continuation continuation) {
        this._articles = CollectionsKt.toMutableList((Collection) list);
        Object emit = F().emit(list, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }

    public final kotlinx.coroutines.flow.y y() {
        return (kotlinx.coroutines.flow.y) this.articleCategoriesMutableStateFlow.getValue();
    }

    public final kotlinx.coroutines.flow.L z() {
        return (kotlinx.coroutines.flow.L) this.articleCategoriesStateFlow.getValue();
    }
}
