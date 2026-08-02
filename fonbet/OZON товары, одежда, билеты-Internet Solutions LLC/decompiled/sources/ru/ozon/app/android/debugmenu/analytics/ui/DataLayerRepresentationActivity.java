package ru.ozon.app.android.debugmenu.analytics.ui;

import Pc.a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.g;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gi.C6739a;
import gi.C6740b;
import hi.InterfaceC6958a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.di.AnalyticsComponentApi;
import ru.ozon.app.android.debugmenu.R$id;
import ru.ozon.app.android.debugmenu.analytics.ui.DataLayerAdapter;
import ru.ozon.app.android.debugmenu.analytics.ui.di.DaggerDataLayerRepresentationComponent;
import ru.ozon.app.android.debugmenu.analytics.ui.di.DataLayerRepresentationComponent;
import ru.ozon.app.android.debugmenu.databinding.DataLayerLayoutBinding;
import ru.ozon.app.android.uikit.R$style;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J=\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001eR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerRepresentationActivity;", "Landroidx/appcompat/app/g;", "Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerAdapter$OnItemClickListener;", "<init>", "()V", "", "", "", "cache", "", "breadCrumbs", "getData", "(Ljava/util/Map;Ljava/util/List;)Ljava/util/Map;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "key", "onItemClick", "(Ljava/lang/String;)V", "LPc/a;", "Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerRepresentationViewModel;", "pViewModel", "LPc/a;", "getPViewModel$debugmenu_prodGoogleAllVendorsRelease", "()LPc/a;", "setPViewModel$debugmenu_prodGoogleAllVendorsRelease", "(LPc/a;)V", "", "Ljava/util/List;", "Lru/ozon/app/android/debugmenu/databinding/DataLayerLayoutBinding;", "binding", "Lru/ozon/app/android/debugmenu/databinding/DataLayerLayoutBinding;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DataLayerRepresentationActivity extends g implements DataLayerAdapter.OnItemClickListener {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private DataLayerLayoutBinding binding;

    @NotNull
    private final List<String> breadCrumbs = new ArrayList();
    public a<DataLayerRepresentationViewModel> pViewModel;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/debugmenu/analytics/ui/DataLayerRepresentationActivity$Companion;", "", "<init>", "()V", "BREAD_CRUMBS", "", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> getData(Map<String, ? extends Object> cache, List<String> breadCrumbs) {
        Iterator<String> it = breadCrumbs.iterator();
        while (it.hasNext()) {
            Object obj = cache.get(it.next());
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any>");
            cache = (Map) obj;
        }
        return cache;
    }

    @NotNull
    public final a<DataLayerRepresentationViewModel> getPViewModel$debugmenu_prodGoogleAllVendorsRelease() {
        a<DataLayerRepresentationViewModel> aVar = this.pViewModel;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.n("pViewModel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.r, androidx.activity.ActivityC5043j, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        DataLayerRepresentationComponent.Factory factory = DaggerDataLayerRepresentationComponent.factory();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        C6740b dependencyStorage = C6739a.a(this, AnalyticsComponentApi.class).getDependencyStorage();
        if (AnalyticsComponentApi.class.isAssignableFrom(InterfaceC6958a.class)) {
            throw new IllegalStateException("Requested component AnalyticsComponentApi is not DiComponent");
        }
        factory.create((AnalyticsComponentApi) dependencyStorage.b(AnalyticsComponentApi.class)).inject(this);
        setTheme(R$style.OzonTheme);
        super.onCreate(savedInstanceState);
        DataLayerLayoutBinding inflate = DataLayerLayoutBinding.inflate(getLayoutInflater());
        this.binding = inflate;
        if (inflate == null) {
            Intrinsics.n("binding");
            throw null;
        }
        setContentView(inflate.getConstraintLayout());
        DataLayerRepresentationViewModel dataLayerRepresentationViewModel = (DataLayerRepresentationViewModel) new z0(this, new z0.c() { // from class: ru.ozon.app.android.debugmenu.analytics.ui.DataLayerRepresentationActivity$onCreate$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                DataLayerRepresentationViewModel dataLayerRepresentationViewModel2 = DataLayerRepresentationActivity.this.getPViewModel$debugmenu_prodGoogleAllVendorsRelease().get();
                Intrinsics.g(dataLayerRepresentationViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return dataLayerRepresentationViewModel2;
            }
        }).a(DataLayerRepresentationViewModel.class);
        List stringArrayListExtra = getIntent().getStringArrayListExtra("BREAD_CRUMBS");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = K.f71697a;
        }
        if (!stringArrayListExtra.isEmpty()) {
            DataLayerLayoutBinding dataLayerLayoutBinding = this.binding;
            if (dataLayerLayoutBinding == null) {
                Intrinsics.n("binding");
                throw null;
            }
            dataLayerLayoutBinding.dataLayerTitleTv.setText((CharSequence) stringArrayListExtra.get(stringArrayListExtra.size() - 1));
            DataLayerLayoutBinding dataLayerLayoutBinding2 = this.binding;
            if (dataLayerLayoutBinding2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            TextView dataLayerTitleTv = dataLayerLayoutBinding2.dataLayerTitleTv;
            Intrinsics.checkNotNullExpressionValue(dataLayerTitleTv, "dataLayerTitleTv");
            ViewExtKt.show(dataLayerTitleTv);
            this.breadCrumbs.clear();
            this.breadCrumbs.addAll(stringArrayListExtra);
        }
        View findViewById = findViewById(R$id.data);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        dataLayerRepresentationViewModel.getCache().observe(this, new DataLayerRepresentationActivity$sam$androidx_lifecycle_Observer$0(new DataLayerRepresentationActivity$onCreate$1(recyclerView, this, stringArrayListExtra)));
    }

    @Override // ru.ozon.app.android.debugmenu.analytics.ui.DataLayerAdapter.OnItemClickListener
    public void onItemClick(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ArrayList arrayList = new ArrayList(this.breadCrumbs);
        arrayList.add(key);
        Intent intent = new Intent(this, (Class<?>) DataLayerRepresentationActivity.class);
        intent.putExtra("BREAD_CRUMBS", arrayList);
        startActivity(intent);
    }
}
