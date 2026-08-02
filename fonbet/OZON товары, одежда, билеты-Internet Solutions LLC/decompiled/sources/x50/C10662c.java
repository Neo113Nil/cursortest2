package x50;

import B1.C2548q;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;
import ru.ozon.app.android.R;
import ru.ozon.fintech.ui.storyprogress.StoryProgressView;

/* renamed from: x50.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10662c implements X4.a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final FrameLayout f105035a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final ImageView f105036b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final StoryProgressView f105037c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f105038d;

    private C10662c(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull StoryProgressView storyProgressView, @NonNull ViewPager2 viewPager2) {
        this.f105035a = frameLayout;
        this.f105036b = imageView;
        this.f105037c = storyProgressView;
        this.f105038d = viewPager2;
    }

    @NonNull
    public static C10662c b(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.story_fragment, viewGroup, false);
        int i11 = R.id.close;
        ImageView imageView = (ImageView) C2548q.d(R.id.close, inflate);
        if (imageView != null) {
            i11 = R.id.story_progress;
            StoryProgressView storyProgressView = (StoryProgressView) C2548q.d(R.id.story_progress, inflate);
            if (storyProgressView != null) {
                i11 = R.id.story_viewpager;
                ViewPager2 viewPager2 = (ViewPager2) C2548q.d(R.id.story_viewpager, inflate);
                if (viewPager2 != null) {
                    return new C10662c((FrameLayout) inflate, imageView, storyProgressView, viewPager2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i11)));
    }

    @NonNull
    public final FrameLayout a() {
        return this.f105035a;
    }

    @Override // X4.a
    @NonNull
    public final View getRoot() {
        return this.f105035a;
    }
}
