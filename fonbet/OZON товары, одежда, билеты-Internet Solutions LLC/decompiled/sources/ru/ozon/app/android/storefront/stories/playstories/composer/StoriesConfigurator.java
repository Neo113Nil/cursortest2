package ru.ozon.app.android.storefront.stories.playstories.composer;

import android.content.Intent;
import androidx.fragment.app.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.K;
import l10.InterfaceC7851b;
import ru.ozon.app.android.common.events.StoriesUpdate;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/stories/playstories/composer/StoriesConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "<init>", "()V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "updateStories", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StoriesConfigurator extends ComposerScreenConfig.PageConfigurator {
    private final void updateStories(Intent data) {
        int intExtra = data.getIntExtra("close_screen_story_position", -1);
        long[] longArrayExtra = data.getLongArrayExtra("viewed_stories_ids");
        r a11 = getContainer().a();
        if (a11 != null) {
            a11.postponeEnterTransition();
        }
        ConfiguratorReferences references = getReferences();
        if (references == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        InterfaceC7851b controller = references.getController();
        List e02 = longArrayExtra != null ? C7705l.e0(longArrayExtra) : null;
        if (e02 == null) {
            e02 = K.f71697a;
        }
        controller.update(new StoriesUpdate(intExtra, e02));
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode != -1 || data == null) {
            return;
        }
        updateStories(data);
    }
}
