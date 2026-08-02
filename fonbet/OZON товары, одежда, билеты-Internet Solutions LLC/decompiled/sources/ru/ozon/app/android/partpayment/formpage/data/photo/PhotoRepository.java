package ru.ozon.app.android.partpayment.formpage.data.photo;

import Bc.r;
import Fn.C3055d;
import Mc.a;
import We.C;
import We.D;
import We.H;
import We.K;
import android.webkit.MimeTypeMap;
import bd.h;
import io.reactivex.y;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.view.vo.PassFormVO;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/data/photo/PhotoRepository;", "", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "api", "<init>", "(Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;)V", "", "uploadEndPoint", "photoFilePath", "Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/view/vo/PassFormVO;", "uploadPhoto", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/y;", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhotoRepository {

    @NotNull
    private final FormPageApiDataSource api;

    public PhotoRepository(@NotNull FormPageApiDataSource api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PassFormVO uploadPhoto$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (PassFormVO) function1.invoke(p02);
    }

    @NotNull
    public final y<PassFormVO> uploadPhoto(@NotNull String uploadEndPoint, @NotNull String photoFilePath) {
        Intrinsics.checkNotNullParameter(uploadEndPoint, "uploadEndPoint");
        Intrinsics.checkNotNullParameter(photoFilePath, "photoFilePath");
        File file = new File(photoFilePath);
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file));
        if (mimeTypeFromExtension == null) {
            mimeTypeFromExtension = "application/octet-stream";
        }
        C.f33536g.getClass();
        C b11 = C.a.b(mimeTypeFromExtension);
        D.c.a aVar = D.c.f33553c;
        String name = file.getName();
        K.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(file, "file");
        H a11 = K.Companion.a(file, b11);
        aVar.getClass();
        r rVar = new r(this.api.passPhoto(uploadEndPoint, D.c.a.b("passportPhoto", name, a11)).j(a.b()), new C3055d(PhotoRepository$uploadPhoto$1.INSTANCE, 7));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }
}
