package y40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.fintech.ui.ActionResult2UI;

/* renamed from: y40.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10837a {
    @NotNull
    public static final ActionResult2 a(@NotNull ActionResult2UI actionResult2UI) {
        String str;
        String str2;
        Map map;
        Intrinsics.checkNotNullParameter(actionResult2UI, "<this>");
        String cbottomId = actionResult2UI.getCbottomId();
        String widgetId = actionResult2UI.getWidgetId();
        String name = actionResult2UI.getType().name();
        String text = actionResult2UI.getText();
        String url = actionResult2UI.getUrl();
        Integer framePos = actionResult2UI.getFramePos();
        Integer storyPos = actionResult2UI.getStoryPos();
        Integer fromStory = actionResult2UI.getFromStory();
        Integer fromFrame = actionResult2UI.getFromFrame();
        Integer toStory = actionResult2UI.getToStory();
        Integer toFrame = actionResult2UI.getToFrame();
        Integer previousStoryPos = actionResult2UI.getPreviousStoryPos();
        Long duration = actionResult2UI.getDuration();
        String subWidgetId = actionResult2UI.getSubWidgetId();
        Integer versionStamp = actionResult2UI.getVersionStamp();
        List<String> widgetIds = actionResult2UI.getWidgetIds();
        String composerActionBehavior = actionResult2UI.getComposerActionBehavior();
        String composerActionLink = actionResult2UI.getComposerActionLink();
        String composerActionId = actionResult2UI.getComposerActionId();
        Map<String, String> composerActionParams = actionResult2UI.getComposerActionParams();
        Map<String, Object> composerTrackingInfo = actionResult2UI.getComposerTrackingInfo();
        if (composerTrackingInfo != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, Object>> it = composerTrackingInfo.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, Object> next = it.next();
                Iterator<Map.Entry<String, Object>> it2 = it;
                String key = next.getKey();
                String str3 = cbottomId;
                Object value = next.getValue();
                String str4 = widgetId;
                Pair pair = value instanceof ComposerTrackingInfo ? new Pair(key, value) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
                widgetId = str4;
                cbottomId = str3;
                it = it2;
            }
            str = cbottomId;
            str2 = widgetId;
            map = U.s(arrayList);
        } else {
            str = cbottomId;
            str2 = widgetId;
            map = null;
        }
        return new ActionResult2(str, str2, name, text, url, framePos, storyPos, fromStory, fromFrame, toStory, toFrame, previousStoryPos, subWidgetId, duration, widgetIds, null, null, null, null, null, null, versionStamp, composerActionBehavior, composerActionLink, composerActionId, composerActionParams, map, 2064384, null);
    }
}
