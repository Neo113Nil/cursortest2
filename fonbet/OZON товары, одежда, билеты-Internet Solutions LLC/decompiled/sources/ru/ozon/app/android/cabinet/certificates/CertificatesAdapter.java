package ru.ozon.app.android.cabinet.certificates;

import Ve.C4636t5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.R$layout;
import ru.ozon.app.android.cabinet.databinding.WidgetCertificatesItemBinding;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00020\u000f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cabinet/certificates/CertificatesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/cabinet/certificates/CertificatesAdapter$CertificateVH;", "<init>", "()V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/cabinet/certificates/CertificatesAdapter$CertificateVH;", "getItemCount", "()I", "holder", "position", "", "onBindViewHolder", "(Lru/ozon/app/android/cabinet/certificates/CertificatesAdapter$CertificateVH;I)V", "", "Lru/ozon/app/android/cabinet/certificates/CertificateVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "certificates", "Ljava/util/List;", "getCertificates", "()Ljava/util/List;", "setCertificates", "(Ljava/util/List;)V", "CertificateVH", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CertificatesAdapter extends RecyclerView.g<CertificateVH> {

    @NotNull
    private List<CertificateVO> certificates = K.f71697a;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/cabinet/certificates/CertificatesAdapter$CertificateVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "<init>", "(Lru/ozon/app/android/cabinet/certificates/CertificatesAdapter;Landroid/view/View;)V", "Lru/ozon/app/android/cabinet/certificates/CertificateVO;", "item", "", "bind", "(Lru/ozon/app/android/cabinet/certificates/CertificateVO;)V", "Lru/ozon/app/android/cabinet/databinding/WidgetCertificatesItemBinding;", "binding", "Lru/ozon/app/android/cabinet/databinding/WidgetCertificatesItemBinding;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class CertificateVH extends RecyclerView.C {

        @NotNull
        private final WidgetCertificatesItemBinding binding;
        final /* synthetic */ CertificatesAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CertificateVH(@NotNull CertificatesAdapter certificatesAdapter, View containerView) {
            super(containerView);
            Intrinsics.checkNotNullParameter(containerView, "containerView");
            this.this$0 = certificatesAdapter;
            WidgetCertificatesItemBinding bind = WidgetCertificatesItemBinding.bind(containerView);
            Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
            this.binding = bind;
        }

        public final void bind(@NotNull CertificateVO item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.binding.titleTv.setText(item.getTitle());
            TextView subtitleTv = this.binding.subtitleTv;
            Intrinsics.checkNotNullExpressionValue(subtitleTv, "subtitleTv");
            TextViewExtKt.setTextOrGone(subtitleTv, item.getSubtitle());
            this.binding.dateTv.setText(item.getAccessory());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.certificates.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public CertificateVH onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View inflate = C4636t5.a(parent, "parent").inflate(R$layout.widget_certificates_item, parent, false);
        Intrinsics.f(inflate);
        return new CertificateVH(this, inflate);
    }

    public final void setCertificates(@NotNull List<CertificateVO> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.certificates = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull CertificateVH holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(this.certificates.get(position));
    }
}
